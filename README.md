# Spring Boot CRUD Operations with MySQL

This project demonstrates fundamental concepts of Java, Spring Boot, and MySQL by creating a simple application that interacts with a relational database.

**Key Features:**

* **Spring Boot:** Leverages the Spring Boot framework for rapid application development, including dependency injection, auto-configuration, and embedded servers.
* **MySQL:** Utilizes MySQL as the underlying database for data storage and retrieval.
* **JPA and Hibernate:** Employs Java Persistence API (JPA) and Hibernate as the Object-Relational Mapping (ORM) layer to interact with the database using Java objects.
* **CRUD Operations:** Implements core CRUD (Create, Read, Update, Delete) operations on a chosen entity (e.g., a User, Product) through a RESTful API.
* **RESTful API:** Exposes endpoints (e.g., GET, POST, PUT, DELETE) for interacting with the data using HTTP requests.

**Technical Steps:**

1. **Project Setup:**

   * Create a Spring Boot project using Spring Initializr.
   * Use Java version 17 or higher and Maven.
   * Add dependencies for:
       * Spring Web
       * Spring Data JPA
       * MySQL Driver
       * Lombok

2. **Project Setup (After Cloning):**

   * Run `mvn clean install` in the terminal to download all dependencies.

3. **Database Setup:**

   * Create a database named `newdb` using the following SQL command:

     ```sql
     create database newdb;
     ```

   * Important: Update the `username` and `password` in the `application.properties` file with your MySQL credentials.

4. **Run the Application:**

   * Start the Spring Boot application using your preferred IDE or by running `mvn spring-boot:run` in the terminal.

5. **Explore and Experiment:**

   * Use a tool like Postman to interact with the exposed RESTful endpoints.
   * Test the CRUD operations using Postman.
   * Modify the entity, service, and controller classes to explore different functionalities.

**Getting Started with Postman:**

1. Install Postman: https://www.getpostman.com/
2. Create a new collection for your project.
3. **Create Operation:**
   * Set the request method to `POST`.
   * Set the URL to `http://localhost:8080/addStd` (assuming the application runs on port 8080).
   * In the Body tab, select `raw` and set the content type to `application/json`.
   * Provide a JSON object representing the student data you want to create (e.g.,
   *   
   *        ```json
     { "name": "John Doe", "mark": 90 }
     ```
   * Send the request.
5. **Read Operation:**
   * Set the request method to `GET`.
   * Set the URL to `http://localhost:8080/getAllData` to retrieve all students.
   * You can also use `http://localhost:8080/getStdById/{id}` to retrieve a specific student by ID, replacing `{id}` with the actual student ID.
   * Send the request.
6. **Update Operation:**
   * Set the request method to `PUT`.
   * Set the URL to `http://localhost:8080/updStd`.
   * In the Body tab, provide a JSON object representing the updated student data.
   * Send the request.
7. **Delete Operation:** (**Not implemented in this example project**):
   * You can implement a DELETE endpoint to remove students from the database. Refer to Spring Data JPA documentation for guidance.

This project provides a solid foundation for understanding core Spring Boot concepts and building more complex applications with database interactions.
 **Result**

Student database:
![student_newdb](https://github.com/user-attachments/assets/a125d86e-cfce-413c-b541-7c58575f4667)

Spring Starting:
![student_vs](https://github.com/user-attachments/assets/82535cf7-5af1-40d4-be24-ad84f082abb0)

Post student data in database using postman:
![post_req_student](https://github.com/user-attachments/assets/ec4df98b-2966-4132-bb75-142639e714ab)

Get Student data by ID in postman:
![get_studentbyid](https://github.com/user-attachments/assets/e10a76cf-4d45-4312-bf8d-3837de157a72)


 
**Note:**

* This README file provides a basic overview. For detailed instructions and implementation specifics, refer to the project's source code and comments.
* This project is intended for educational and learning purposes.

**I hope this enhanced README file is more informative and appealing!**
