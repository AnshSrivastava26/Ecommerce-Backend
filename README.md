# Ecommerce-Backend

Scalable RESTful E-Commerce backend built with Spring Boot, JWT authentication, JPA, and MySQL.

## Features

- **User Authentication & Authorization**: JWT-based authentication with role-based access control
- **Product Management**: CRUD operations for products with category support
- **Category Management**: Organize products into categories
- **Order Management**: Complete order processing with status tracking
- **User Management**: User profile and account management
- **MySQL Database**: Persistent storage with JPA/Hibernate
- **Security**: Spring Security with JWT tokens
- **RESTful API**: Well-structured REST endpoints

## Technology Stack

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Security**: Authentication and authorization
- **Spring Data JPA**: Database operations
- **MySQL**: Relational database
- **JWT (JSON Web Tokens)**: Secure authentication
- **Lombok**: Reduce boilerplate code
- **Maven**: Dependency management and build tool

## Project Structure

```
src/main/java/com/ecommerce/backend/
├── config/              # Configuration classes
│   └── SecurityConfig.java
├── controller/          # REST API controllers
│   ├── AuthController.java
│   ├── CategoryController.java
│   ├── OrderController.java
│   ├── ProductController.java
│   └── UserController.java
├── dto/                 # Data Transfer Objects
│   ├── JwtResponse.java
│   ├── LoginRequest.java
│   ├── MessageResponse.java
│   └── RegisterRequest.java
├── entity/              # JPA entities
│   ├── Category.java
│   ├── Order.java
│   ├── OrderItem.java
│   ├── Product.java
│   └── User.java
├── repository/          # Data access layer
│   ├── CategoryRepository.java
│   ├── OrderItemRepository.java
│   ├── OrderRepository.java
│   ├── ProductRepository.java
│   └── UserRepository.java
├── security/            # Security components
│   ├── CustomUserDetailsService.java
│   ├── JwtAuthenticationEntryPoint.java
│   ├── JwtAuthenticationFilter.java
│   └── JwtUtil.java
├── service/             # Business logic layer
│   ├── AuthService.java
│   ├── CategoryService.java
│   ├── OrderService.java
│   ├── ProductService.java
│   └── UserService.java
└── EcommerceBackendApplication.java
```

## Database Configuration

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db?createDatabaseIfNotExist=true
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - Login and get JWT token

### Users (Authenticated)
- `GET /api/users` - Get all users (Admin only)
- `GET /api/users/{id}` - Get user by ID
- `GET /api/users/username/{username}` - Get user by username
- `PUT /api/users/{id}` - Update user
- `DELETE /api/users/{id}` - Delete user (Admin only)

### Products
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `GET /api/products/category/{categoryId}` - Get products by category
- `GET /api/products/search?name={name}` - Search products by name
- `GET /api/products/active` - Get active products
- `POST /api/products` - Create product (Admin only)
- `PUT /api/products/{id}` - Update product (Admin only)
- `PATCH /api/products/{id}/stock` - Update stock (Admin only)
- `DELETE /api/products/{id}` - Delete product (Admin only)

### Categories
- `GET /api/categories` - Get all categories
- `GET /api/categories/{id}` - Get category by ID
- `POST /api/categories` - Create category (Admin only)
- `PUT /api/categories/{id}` - Update category (Admin only)
- `DELETE /api/categories/{id}` - Delete category (Admin only)

### Orders (Authenticated)
- `GET /api/orders` - Get all orders (Admin only)
- `GET /api/orders/{id}` - Get order by ID
- `GET /api/orders/user/{userId}` - Get orders by user
- `GET /api/orders/status/{status}` - Get orders by status (Admin only)
- `POST /api/orders/user/{userId}` - Create order
- `PATCH /api/orders/{id}/status` - Update order status (Admin only)
- `DELETE /api/orders/{id}/cancel` - Cancel order

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher

### Installation

1. Clone the repository:
```bash
git clone https://github.com/AnshSrivastava26/Ecommerce-Backend.git
cd Ecommerce-Backend
```

2. Configure MySQL database in `application.properties`

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## Authentication

The API uses JWT for authentication. To access protected endpoints:

1. Register a new user or login
2. Copy the JWT token from the response
3. Include the token in the Authorization header:
```
Authorization: Bearer <your-jwt-token>
```

## Security

- Passwords are encrypted using BCrypt
- JWT tokens expire after 24 hours (configurable)
- Role-based access control (USER, ADMIN)
- CORS enabled for cross-origin requests

**Note**: For production environments:
- Configure CORS to allow only specific trusted origins instead of "*"
- Use environment variables for database credentials and JWT secret
- Generate a secure JWT secret using: `openssl rand -base64 64`
- Set `spring.jpa.hibernate.ddl-auto=validate` or `none` to prevent schema changes

## License

This project is licensed under the MIT License - see the LICENSE file for details.
