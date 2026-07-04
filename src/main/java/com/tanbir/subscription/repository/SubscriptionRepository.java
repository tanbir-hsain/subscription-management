package com.tanbir.subscription.repository;

import com.tanbir.subscription.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubscriptionRepository
        extends JpaRepository<Subscription, Long> {

    long countByPlan(String plan);

    List<Subscription> findByEmailContaining(String email);

    boolean existsByEmail(String email);
}
