package com.tanbir.subscription.controller;

import com.tanbir.subscription.model.Subscription;
import com.tanbir.subscription.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SubscriptionController {

    @Autowired
    private SubscriptionRepository repository;

    @GetMapping("/")
    public String home(
            @RequestParam(required = false)
            String email,
            Model model) {

        model.addAttribute(
                "subscriptions",
                email == null || email.isBlank()
                        ? repository.findAll()
                        : repository.findByEmailContaining(email)
        );

        model.addAttribute("total", repository.count());
        model.addAttribute("monthly", repository.countByPlan("Monthly"));
        model.addAttribute("yearly", repository.countByPlan("Yearly"));

        return "index";
    }

    @PostMapping("/subscribe")
    public String subscribe(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String plan) {

        if (repository.existsByEmail(email)) {
            return "redirect:/";
        }

        Subscription s = new Subscription();

        s.setName(name);
        s.setEmail(email);
        s.setPlan(plan);
        s.setStatus("ACTIVE");

        repository.save(s);

        return "redirect:/";
    }
}
