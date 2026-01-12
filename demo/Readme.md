# 📝 Notes Management System (Spring Boot Backend)

A robust RESTful API built with Spring Boot for managing personal notes. This project demonstrates clean architecture, unit testing with Mockito, and automated API documentation using Swagger.

## 🚀 Features

- **Full CRUD Support:** Create, Read, Update, and Delete notes.
- **Data Persistence:** Integrated with MySQL using Spring Data JPA.
- **Unit Testing:** Comprehensive service layer testing using **Mockito** and **JUnit 5**.
- **API Documentation:** Interactive UI via **Swagger/OpenAPI** for real-time API testing.
- **Global Deployment Ready:** Configured with environment variables for platforms like Railway or Render.

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA** (Hibernate)
- **MySQL** (Database)
- **Mockito & JUnit 5** (Testing Frameworks)
- **Maven** (Dependency Management)

## 📋 Prerequisites

To run this project locally, ensure you have:
- **JDK 17** or higher installed.
- **MySQL Server** running.
- **Maven** installed (or use the provided `./mvnw` wrapper).

## ⚙️ Local Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/shekharkumar15india/notes.git](https://github.com/shekharkumar15india/notes.git)
   cd notes/Note/demo


2. 
   Configure Database: Update src/main/resources/application.properties with your MySQL details:

Application Properties

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

📖 API Documentation
Once the application is running, access the Swagger UI to explore and test the endpoints: 👉 http://localhost:8080/swagger-ui/index.html


📂 Project Structure
com.example.demo.entity: Contains the notes.java entity model.

com.example.demo.repository: Data access layer using JpaRepository.

com.example.demo.service: Business logic layer (tested with Mockito).

com.example.demo.controller: REST Controllers for handling HTTP requests.

src/test/java: Contains the serviceTest.java file.