# Expense Tracker

A simple **Spring Boot 3** project to manage daily expenses.  
This project demonstrates **CRUD operations** using **Spring Boot**, **Spring Data JPA**, **H2 in-memory database**, and **Lombok**, making it beginner-friendly and perfect for learning full-stack Java development basics.

---

## Features
- Add, view, update, and delete expenses (CRUD)
- RESTful API endpoints for easy integration
- H2 in-memory database (no installation required)
- Clean code with Lombok for reducing boilerplate
- Fully compatible with Java 17

---

## Tech Stack
- **Backend:** Java 17, Spring Boot 3  
- **Database:** H2 (in-memory)  
- **ORM:** Spring Data JPA  
- **Utilities:** Lombok  
- **Build Tool:** Maven  

---

## Architecture / Flow
Postman / REST Client-->ExpenseController (REST APIs)-->ExpenseService (Business Logic)-->ExpenseRepository (JPA / H2 Database)-->Expense Entity (Represents expenses table)


---

## API Workflow
| Component  | Responsibility |
|-----------|----------------|
| Controller | Handles HTTP requests and responses |
| Service    | Contains business logic for CRUD operations |
| Repository | Interacts with H2 database using Spring Data JPA |
| Entity     | Represents Expense table in the database |

---

## API Endpoints

| Operation        | Method | Endpoint                  | Body (JSON) Example |
|-----------------|--------|--------------------------|------------------|
| Create Expense   | POST   | `/api/expenses`          | `{ "title": "Groceries", "category": "Food", "amount": 1200, "date": "2025-10-20" }` |
| Get All Expenses | GET    | `/api/expenses`          | — |
| Get Expense by ID| GET    | `/api/expenses/{id}`     | — |
| Update Expense   | PUT    | `/api/expenses/{id}`     | `{ "title": "Dinner", "category": "Food", "amount": 800, "date": "2025-10-21" }` |
| Delete Expense   | DELETE | `/api/expenses/{id}`     | — |

---


