# Task Management Application

This is a simple task management application built using Spring Boot and Spring Data JPA. The application provides endpoints for CRUD (Create, Read, Update, Delete) operations on tasks.

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (in-memory database for development)
- Thymeleaf (for form-based UI, if applicable)
- ...

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```

## Build and run the application:
```bash
./mvnw spring-boot:run
```

## Access the application:

Open your web browser and navigate to http://localhost:8080

## Initial Data
If there are no tasks in the database when the application starts, it will automatically populate the database with 5 sample tasks. This is implemented using a CommandLineRunner bean.

## Adding Tasks
You can add tasks using cURL or Postman. Send a POST request to the /tasks endpoint with a JSON payload like this:
```bash
{
"title": "New Task",
"description": "Description for new task"
}
```
Using cURL

```bash
curl -X POST -H "Content-Type: application/json" -d '{"title":"New Task", "description":"Description for new task"}' http://localhost:8080/tasks
```

## Using Postman
1. Set the request URL to http://localhost:8080/tasks
2. Set the request method to POST
3. Add a header with Content-Type as application/json
4. In the request body, provide the JSON payload as shown above

License
This project is licensed under the MIT License. See the LICENSE file for details.