# trade_bridge_26668

## A Spring Boot project demonstrating database relationships and JPA functionalities

## Overview
RESTful API service demonstrating One-to-One, One-to-Many, and Many-to-Many relationships with sorting, pagination, and location-based queries.

## Tech Stack
Framework: Spring Boot 3.x

Database: PostgreSQL

ORM: Spring Data JPA

Validation: Spring Validation

Documentation: Springdoc OpenAPI

## Quick Start
 
Prerequisites:

Java 17+

PostgreSQL 13+

Maven 3.6+

## API Documentation
Once running, you can access the API docs at:

Swagger UI: http://localhost:8081/swagger-ui.html

## Key Features

- Five (5) entity tables with clear relationships
- Location saving and retrieval
- Sorting and Pagination implementation
- Many-to-Many relationship (User-Store)
- One-to-Many relationships (Store-Product, Product-Review)
- One-to-One relationship (User-Location)
- existBy() method implementation
- Retrieve users by province code or province name

## ERD Diagram

<img width="579" height="1452" alt="CLASS d33 drawio" src="https://github.com/user-attachments/assets/739a315e-0e96-4f5a-8740-7832925fdad8" />


