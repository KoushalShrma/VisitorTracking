
## 🛠️ How to Run This Spring Boot Project

Follow these simple steps to run the project locally on your machine.

---

### ✅ Prerequisites

Make sure you have the following installed:

- 🔹 **Java JDK 17+**
- 🔹 **Maven** (comes with STS or can be installed separately)
- 🔹 **Spring Tool Suite (STS)** or **Eclipse IDE**
- 🔹 **MySQL** database
- 🔹 Git (optional, but recommended)

---

### 🔧 Steps to Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/KoushalShrma/your-repo-name.git

2. **Open the Project in STS/Eclipse**

   * File → Import → Maven → Existing Maven Projects → Select the cloned folder
   * Wait for Maven dependencies to load

3. **Configure the Database**

   * Create a MySQL database (e.g., `springboot_demo`)
   * Open `src/main/resources/application.properties`
   * Update DB credentials:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/springboot_demo
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

4. **Run the Application**

   * Right-click the main class with `@SpringBootApplication`
   * Select **Run As → Spring Boot App**

---

### 🌐 Access the Application

Open your browser and visit:

```
http://localhost:8080/
```

Use tools like **Postman** to test your API endpoints (GET, POST, PUT, DELETE).

---

### 💡 Tip

If you get a `Whitelabel Error Page`, make sure:

* You're using the correct HTTP method (`GET`, `POST`, etc.)
* Your controller mappings (`@GetMapping`, `@PostMapping`, etc.) are set correctly
* The requested URL is correct

