# Subscription Management System

## Project Description

Subscription Management System is a web-based application developed using Spring Boot and MySQL to manage customer subscriptions efficiently. The system allows users to add subscriptions, search customers by email, manage subscription plans, and view dashboard statistics.

This project demonstrates backend development, database integration, ORM concepts, and MVC architecture using Spring Boot.

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Thymeleaf
- Maven
- Git & GitHub

---

## Architecture

User
↓
Thymeleaf UI
↓
Spring Boot Controller
↓
Service Layer
↓
JPA Repository
↓
MySQL Database

---

## Features

- Add new subscriptions
- Search subscriptions by email
- View subscription dashboard statistics
- Manage monthly and yearly plans
- Database persistence using MySQL
- User-friendly web interface using Thymeleaf
- Layered Spring Boot architecture

---

## How It Works

1. User enters subscription details
2. Spring Boot receives the request
3. Service layer processes business logic
4. JPA Repository interacts with MySQL database
5. Data is stored or retrieved
6. Results are displayed through Thymeleaf pages

---

## Database Design

### Subscription Information

- Customer Name
- Email Address
- Subscription Plan
- Start Date
- End Date
- Status

---

## Setup Instructions

### Clone Repository

```bash
git clone https://github.com/tanbir-hsain/subscription-management.git
