# Spring Boot E-commerce API

## Overview

This project is a simple E-commerce API built with Spring Boot. It provides RESTful CRUD operations for **Categories** and **Products** with a **one-to-many relationship** between Category and Product. Server-side pagination is implemented for both entities.

## Features

1. **Category CRUD Operations:**
   - **GET** `/api/categories?page={page}`: Fetch all categories with pagination.
   - **POST** `/api/categories`: Create a new category.
   - **GET** `/api/categories/{id}`: Get a category by ID.
   - **PUT** `/api/categories/{id}`: Update a category by ID.
   - **DELETE** `/api/categories/{id}`: Delete a category by ID.

2. **Product CRUD Operations:**
   - **GET** `/api/products?page={page}`: Fetch all products with pagination.
   - **POST** `/api/products`: Create a new product.
   - **GET** `/api/products/{id}`: Get a product by ID, including the respective category details.
   - **PUT** `/api/products/{id}`: Update a product by ID.
   - **DELETE** `/api/products/{id}`: Delete a product by ID.

3. **Relation:**
   - A **One-to-Many** relationship exists between Category and Product. Each category can have multiple products.

 4. **Pagination:**
   - Server-side pagination is implemented for both categories and products.

## Technology Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or any other RDB)
- **REST API**

## Configuration

### Database Configuration

In the `application.properties`, you can configure your database connection as follows:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

### Clone the repository:
git clone https://github.com/vaishalimogal/Spring-Boot-Ecommerce-API.git


This `README.md` provides an overview of the project's purpose, how to run it, and details about the APIs. Make sure to replace any database credentials in the `application.properties` section with actual values, and adjust the content according to your specific project setup.

