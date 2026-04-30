# 🔐 Auth API — Spring Boot + JWT + PostgreSQL

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.5-6DB33F?style=flat-square&logo=spring-boot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-316192?style=flat-square&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Auth-black?style=flat-square&logo=jsonwebtokens)
![Docker](https://img.shields.io/badge/Docker-Compose-2496ED?style=flat-square&logo=docker&logoColor=white)

A production-ready REST API implementing JWT authentication with role-based access control (RBAC), built with Spring Boot 3 and Spring Security 6.

---

## ✨ Features

- ✅ User registration and login
- ✅ JWT token generation and validation
- ✅ Role-based access control (`USER` / `ADMIN`)
- ✅ Password encryption with BCrypt
- ✅ Input validation with meaningful error messages
- ✅ Global exception handling
- ✅ API documentation with Swagger UI
- ✅ PostgreSQL with Docker Compose

---

## 🏗️ Architecture

```
src/
├── controller/       # HTTP layer — AuthController, UserController
├── service/          # Business logic — AuthService, UserService
├── repository/       # Data access — UserRepository (JPA)
├── model/            # Entities — User, Role
├── dto/              # Request/Response objects
├── security/         # JWT logic — JwtService, JwtFilter, SecurityConfig
└── exception/        # Global error handling
```

---

## 🚀 Getting Started

### Prerequisites
- Java 21+
- Maven 3.9+
- Docker & Docker Compose

### 1. Clone the repo

```bash
git clone https://github.com/jereinerortega2p13-netizen/auth-api.git
cd auth-api
```

### 2. Start the database

```bash
docker-compose up -d
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

---

## 📡 Endpoints

| Method | Endpoint | Auth | Description |
|--------|----------|------|-------------|
| POST | `/api/auth/register` | ❌ | Register new user |
| POST | `/api/auth/login` | ❌ | Login and get JWT |
| GET | `/api/users/me` | ✅ USER | Get current user info |
| GET | `/api/users/all` | ✅ ADMIN | Get all users |

### Register
```http
POST /api/auth/register
Content-Type: application/json

{
  "name": "Jereiner Castiblanco",
  "email": "jereinerortega2p13example.com",
  "password": "secret123"
}
```

### Login
```http
POST /api/auth/login
Content-Type: application/json

{
  "email": "jereinerortega2p13@example.com",
  "password": "secret123"
}
```

**Response:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "type": "Bearer",
  "email": "jereiner@example.com",
  "role": "USER"
}
```

### Protected endpoint
```http
GET /api/users/me
Authorization: Bearer <your_token>
```

---

## 📖 API Documentation

Swagger UI available at:
```
http://localhost:8080/swagger-ui.html
```

---

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|------------|---------|---------|
| Java | 21 | Language |
| Spring Boot | 3.2.5 | Framework |
| Spring Security | 6 | Security layer |
| JJWT | 0.12.5 | JWT handling |
| PostgreSQL | 16 | Database |
| Spring Data JPA | — | ORM |
| Lombok | — | Boilerplate reduction |
| SpringDoc OpenAPI | 2.5.0 | API docs |
| Docker Compose | — | Local database |

---

## 👤 Author

**Jereiner Castiblanco Calderon**  
Backend Developer · Medellín, Colombia 🇨🇴  
[GitHub](https://github.com/jereinerortega2p13-netizen)
