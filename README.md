# Expense Tracker

A simple **Spring Boot 3** project to manage daily expenses.  
This project demonstrates **CRUD operations** using **Spring Boot**, **Spring Data JPA**, **H2 in-memory database**, and **Lombok**, making it beginner-friendly and perfect for learning full-stack Java development basics.

---

## **Features**
- Add, view, update, and delete expenses (CRUD)
- RESTful API endpoints for easy integration
- H2 in-memory database (no installation required)
- Clean code with Lombok for reducing boilerplate
- Fully compatible with Java 17

---

## **Tech Stack**
- **Backend:** Java 17, Spring Boot 3
- **Database:** H2 (in-memory)
- **ORM:** Spring Data JPA
- **Utilities:** Lombok
- **Build Tool:** Maven

---

## **Project Structure**
expense-tracker/
 ├─ src/main/java/com/expensetracker/
 │    ├─ controller/ExpenseController.java
 │    ├─ entity/Expense.java
 │    ├─ repository/ExpenseRepository.java
 │    ├─ service/ExpenseService.java
 │    └─ ExpenseTrackerApplication.java
 ├─ src/main/resources/
 │    └─ application.properties
 └─ pom.xml
