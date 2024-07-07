# Finance Management API

This project demonstrates building a Finance Management API using Spring Boot, MongoDB, Kafka, JOOQ, and JWT authentication with Hexagonal Architecture principles.

## Purpose

This API serves as a learning tool for developers interested in:
- Building APIs with Spring Boot, MongoDB, Kafka, and JOOQ
- Implementing JWT authentication
- Applying Hexagonal Architecture principles

## Technologies Used

- **Spring Boot 3.3**
- **MongoDB**
- **Kafka**
- **JOOQ**
- **Spring Security**
- **JWT (JSON Web Tokens)**

## Features

- User Registration and Authentication with JWT
- CRUD Operations for Financial Transactions
- Real-time Updates with Kafka

## Getting Started

### Prerequisites

Ensure you have the following installed:
- JDK 11+
- Maven 3.6+
- MongoDB
- Kafka

### Installation

Clone the repository:
```bash
git clone https://github.com/your-username/finance-management-api.git
cd finance-management-api
```
Install dependencies:
```bash
mvn clean install
```
#### Set up MongoDB:
Ensure MongoDB is running or update application.properties.

#### Set up Kafka:
Ensure Kafka is running or update application.properties.

### Configuration

Update application.properties with:
spring.data.mongodb.uri=mongodb://localhost:27017/finance
spring.kafka.bootstrap-servers=localhost:9092

jwt.secret=your-jwt-secret-key
jwt.expirationMs=3600000

### Running the Application

Run the application:
mvn spring-boot:run
### Access the API:

API available at http://localhost:8080.
API Endpoints
```
    POST /api/users/register
    POST /api/users/login
    GET /api/transactions
    POST /api/transactions
```    
Contributing

Feel free to fork this repository and submit pull requests.

### Acknowledgements

Thanks to the open-source community for their valuable tools and frameworks.
Inspired by various online tutorials and resources.

### Contact

For any questions or feedback, please contact kamil_makowski@yahoo.com
