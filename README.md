# 📚 Library Management System

### Java | Spring Boot | MySQL | JUnit 5 | Maven | Git

A backend-driven Library Management System built using Java and Spring Boot to manage books efficiently through REST APIs and MySQL database integration. This project demonstrates practical implementation of the Software Development Life Cycle (SDLC) and Software Testing Life Cycle (STLC).

## 🚀 Project Overview

The Library Management System provides a structured way to manage library book records, including book details, categories, ISBN numbers, and available copies. It follows a layered architecture using Controller, Service, Repository, and Entity components.

The project also focuses on software quality through test planning, test case design, API verification, and automated testing with JUnit.

## ✨ Key Features

- Add new books to the library.
- Retrieve all available book records.
- Search for a book by its ID.
- Update existing book information.
- Delete book records.
- Store and retrieve book data using MySQL.
- Generate sample book records using a PowerShell script.
- Organize application logic using a layered architecture.
- Support functional testing and defect tracking workflows.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Core programming language |
| Spring Boot | Application development |
| Spring Web | REST API development |
| Spring Data JPA | Database access |
| MySQL | Relational database |
| JUnit 5 | Automated testing |
| Maven | Dependency management and build |
| Git & GitHub | Version control and collaboration |
| PowerShell | Sample data generation and API execution |

## 🏗️ Project Architecture

```text
Client / PowerShell
        |
        v
BookController
        |
        v
BookService
        |
        v
BookRepository
        |
        v
MySQL Database
```

### Main Components

- **Entity:** Represents the Book data model.
- **Repository:** Performs database operations using Spring Data JPA.
- **Service:** Contains business logic for book management.
- **Controller:** Exposes REST API endpoints.
- **Configuration:** Maintains database connection and application settings.

## 📡 REST API Endpoints

Base URL: `http://localhost:8080/api/books`

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/books` | Add a new book |
| GET | `/api/books` | Retrieve all books |
| GET | `/api/books/{id}` | Retrieve a book by ID |
| PUT | `/api/books/{id}` | Update book details |
| DELETE | `/api/books/{id}` | Delete a book |

### Example Request

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "category": "Programming",
  "isbn": "LIB1001",
  "totalCopies": 5,
  "availableCopies": 5,
  "coverImage": "/images/clean-code.jpg"
}
```

## 🔄 Software Development Life Cycle (SDLC)

The project follows these development phases:

1. **Requirement Analysis:** Identify book management requirements and application functionality.
2. **System Design:** Design the layered architecture and database structure.
3. **Implementation:** Develop REST APIs using Java and Spring Boot.
4. **Database Integration:** Connect the application to MySQL using Spring Data JPA.
5. **Testing:** Verify API functionality and database operations.
6. **Maintenance:** Identify defects, implement fixes, and improve application quality.

## 🧪 Software Testing Life Cycle (STLC)

Testing activities planned for the project include:

- **Test Planning:** Define testing scope, objectives, and approach.
- **Test Case Design:** Prepare positive, negative, and boundary test scenarios.
- **Test Execution:** Verify book creation, retrieval, updates, and deletion.
- **Defect Reporting:** Document failures with reproduction steps and expected results.
- **Retesting:** Verify fixes after defects are resolved.
- **Regression Testing:** Check that changes do not break existing functionality.

### Sample Test Scenarios

| Test Scenario | Expected Result |
|---|---|
| Add a book with valid details | Book is saved successfully |
| Retrieve all books | Saved book records are returned |
| Retrieve a valid book ID | Corresponding book is returned |
| Retrieve a nonexistent book ID | Appropriate not-found response |
| Submit a book with a missing title | Validation error |
| Submit a duplicate ISBN | Duplicate record is rejected |

*Note: These are intended test scenarios. Mark them as executed only after implementing and verifying the corresponding validations and error handling.*

## ⚙️ Installation and Execution

### Prerequisites

- Java JDK 21
- MySQL Server
- MySQL Workbench
- Git
- VS Code or IntelliJ IDEA

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
cd library-management-system
```

Replace the placeholder with your actual GitHub repository URL.

### Step 2: Configure MySQL

Create the database:

```sql
CREATE DATABASE library_management;
```

Configure the database connection in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_management
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

Use your local database credentials and do not commit real passwords to GitHub.

### Step 3: Run the Application

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

The application runs at:

`http://localhost:8080`

### Step 4: Test the API

Retrieve all books:

```powershell
Invoke-RestMethod `
  -Uri "http://localhost:8080/api/books"
```

To add a book, send a POST request to `/api/books` with the example JSON request body shown above.

### Step 5: Run Automated Tests

```powershell
.\mvnw.cmd test
```

Review the test results in the terminal and the Maven reports under `target/surefire-reports/`.

## 📊 Sample Data

The project includes a PowerShell script, `generate-books.ps1`, to generate sample book records through the REST API. Ensure the Spring Boot application and MySQL database are running before executing the script.

```powershell
.\generate-books.ps1
```

## 🎯 Learning Outcomes

- Practical experience with Java and Spring Boot.
- Understanding REST API design and CRUD operations.
- Database integration using MySQL and Spring Data JPA.
- Application of SDLC and STLC concepts.
- Test case preparation and automated testing fundamentals.
- Version control using Git and GitHub.
- Debugging, defect analysis, and regression testing practices.

## 🔮 Future Enhancements

- Admin and student authentication with role-based authorization.
- Library member profiles and profile images.
- Book cover image display and upload.
- Book issue and return workflows.
- Borrowing history and due-date tracking.
- Advanced input validation and centralized exception handling.
- Comprehensive JUnit unit and integration tests.
- Frontend dashboard with search and filtering.

## 👨‍💻 Author

**Surendra Kartheek**

Java Developer | Spring Boot | MySQL | Software Testing

---

⭐ If you find this project useful, consider giving the repository a star.
