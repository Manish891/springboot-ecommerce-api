# 🛒 SpringBoot Ecommerce API

A RESTful E-Commerce backend API built with **Java 21** and **Spring Boot 3.2.5**, featuring product management, shopping cart, order processing and role-based access control.

---

## 🚀 Features

- Product management with search and filter (by name, category, price range)
- Category management
- Shopping cart (add items, view cart)
- Order placement and order history
- Role-based access control (ADMIN and USER roles)
- REST API with proper HTTP methods and status codes

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| Java 21 | Programming Language |
| Spring Boot 3.2.5 | Backend Framework |
| Spring Data JPA | Database ORM |
| Spring Security | Authentication & Authorization |
| MySQL | Relational Database |
| Hibernate | ORM Implementation |
| Lombok | Boilerplate Reduction |
| Maven | Build Tool |

---

## 📁 Project Structure

```
src/main/java/com/book/ecommerce/
├── config/          # Security configuration
├── controller/      # REST API controllers
├── dto/             # Data Transfer Objects
├── model/           # JPA Entity classes
├── repository/      # Spring Data JPA repositories
└── service/         # Business logic
```

---

## 🗄️ Database Schema

- **users** — stores user credentials and roles
- **categories** — product categories
- **products** — product details with category reference
- **cart** — user shopping cart
- **cart_items** — individual items in cart
- **orders** — placed orders
- **order_items** — individual items in each order

---

## 📌 API Endpoints

### Products
| Method | Endpoint | Access | Description |
|--------|----------|--------|-------------|
| GET | `/api/products` | Public | Get all products |
| GET | `/api/products/{id}` | Public | Get product by ID |
| GET | `/api/products/search` | Public | Search & filter products |
| POST | `/api/products` | ADMIN | Add new product |
| PUT | `/api/products/{id}` | ADMIN | Update product |
| DELETE | `/api/products/{id}` | ADMIN | Delete product |

### Categories
| Method | Endpoint | Access | Description |
|--------|----------|--------|-------------|
| GET | `/api/categories` | Public | Get all categories |
| POST | `/api/categories` | ADMIN | Create category |
| DELETE | `/api/categories/{id}` | ADMIN | Delete category |

### Cart
| Method | Endpoint | Access | Description |
|--------|----------|--------|-------------|
| GET | `/api/cart/{userId}` | USER | View cart |
| POST | `/api/cart/{userId}/add` | USER | Add item to cart |

### Orders
| Method | Endpoint | Access | Description |
|--------|----------|--------|-------------|
| POST | `/api/orders/place/{userId}` | USER | Place order |
| GET | `/api/orders/{userId}` | USER | Get order history |

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 21
- MySQL 8.0+
- Maven 3.x
- IntelliJ IDEA (recommended)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/yourusername/springboot-ecommerce-api.git
cd springboot-ecommerce-api
```

**2. Create MySQL database**
```sql
CREATE DATABASE ecommerce;
```

**3. Configure application.properties**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=your_username
spring.datasource.password=your_password
```

**4. Run the application**
```bash
mvn spring-boot:run
```

The app will start on `http://localhost:8080`

---

## 🔐 Default Credentials

| Role | Username | Password |
|------|----------|----------|
| ADMIN | `admin` | `admin123` |
| USER | `user` | `user123` |

---

## 🧪 Testing with Postman

1. Open Postman
2. Set **Authorization** → **Basic Auth**
3. Enter credentials based on the endpoint role
4. Start with creating a category, then a product, then add to cart and place an order

### Sample Request — Create Category
```
POST http://localhost:8080/api/categories
Authorization: Basic Auth (admin / admin123)
Content-Type: application/json

{
  "name": "Electronics",
  "description": "Electronic items"
}
```

### Sample Request — Create Product
```
POST http://localhost:8080/api/products
Authorization: Basic Auth (admin / admin123)
Content-Type: application/json

{
  "name": "iPhone 15",
  "description": "Apple smartphone",
  "price": 79999,
  "stockQuantity": 10,
  "imageUrl": "iphone.jpg",
  "categoryId": 1
}
```

---

## 👨‍💻 Author

**Manish Siddhantham**  
