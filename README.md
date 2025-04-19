# Task Manager API

A simple RESTful API built with **Java 21** and **Spring Boot 3**, designed for task management with basic CRUD functionality.  
Containerized using **Docker** for easy deployment and environment replication.

---

## Features

- Add / view / delete tasks
- JSON-based API
- In-memory task storage (no DB)
- Clean, minimal structure
- Docker support

---

## Tech Stack

- Java 21
- Spring Boot 3.4.4
- Maven
- Docker

---

## Local Run (no Docker)

```bash
./mvnw clean package
java -jar target/taskmanager-0.0.1-SNAPSHOT.jar
```

Then go to: `http://localhost:8080/tasks`

---

## Run with Docker

```bash
docker build -t taskmanager-api .
docker run -p 8080:8080 taskmanager-api
```

---

## API Endpoints

| Method | Endpoint      | Description       |
| ------ | ------------- | ----------------- |
| GET    | `/tasks`      | Get all tasks     |
| POST   | `/tasks`      | Add a new task    |
| DELETE | `/tasks/{id}` | Delete task by ID |

---

## Example (cURL)

```bash
# Add a task
curl -X POST http://localhost:8080/tasks \
-H "Content-Type: application/json" \
-d '{"title":"Apply to Swisscom internship","completed":false}'

# Get all tasks
curl http://localhost:8080/tasks
```

---

## License

MIT License – free to use and modify for learning or personal projects.
