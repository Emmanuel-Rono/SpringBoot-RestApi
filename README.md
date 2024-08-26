# QuickStart Spring Boot REST API

This is a Spring Boot REST API project designed to demonstrate the basic CRUD operations using Spring Data JPA, PostgreSQL, and other key components of the Spring framework.

<p align="center">
  <img width="200" src="https://github.com/Emmanuel-Rono/SpringBoot-RestApi/blob/main/quickstart/Screenshots/PostWebview.PNG">
  <img width="200" src="https://github.com/Emmanuel-Rono/SpringBoot-RestApi/blob/main/quickstart/Screenshots/DeleteReq.jpeg">
  <img width="200" src="https://github.com/Emmanuel-Rono/SpringBoot-RestApi/blob/main/quickstart/Screenshots/PutReq.jpeg">
</p>

## Features

- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on `Student` entities.
- **Spring Boot**: Leverage the simplicity and power of Spring Boot for rapid development.
- **Spring Data JPA**: Integrate with a PostgreSQL database using Spring Data JPA for data persistence.
- **RESTful API**: Build RESTful endpoints for interacting with the application.
- **Maven**: Manage dependencies and build the project using Maven.

## Architecture

This project follows the MVM (Model - ViewModel - View) design pattern to create a well-structured, maintainable, and testable application.

## Libraries and Dependencies

The following libraries and frameworks are used in this project:

### Spring Framework
- **[Spring Boot Starter Data JPA](https://spring.io/projects/spring-boot)** - Simplifies database interactions with JPA.
- **[Spring Boot Starter Web](https://spring.io/projects/spring-boot)** - Provides core web features for building RESTful APIs.
- **[Spring Boot Starter Test](https://spring.io/projects/spring-boot)** - Includes libraries for testing Spring Boot applications.

### Database
- **[PostgreSQL JDBC Driver](https://jdbc.postgresql.org/)** - Connects the Spring Boot application to a PostgreSQL database.
  
## Prerequisites

- **Java 21** or later
- **Maven 3.8.1** or later
- **PostgreSQL 12** or later
- **IDE** of your choice (e.g., IntelliJ IDEA, Eclipse)

## Running the Application

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Emmanuel-Rono/SpringBoot-RestApi.git
   cd quickstart
