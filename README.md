# Student Management Microservice

A Spring Boot REST microservice that returns a fixed set of student records.

## Requirements

- Java 21 (Java 17 is also suitable if `java.version` in `pom.xml` is lowered)
- Maven 3.9+

## Run locally

```bash
mvn clean verify
mvn spring-boot:run
```

The API is available at http://localhost:8080/students. Set the `PORT`
environment variable to use a different port.

## API response

`GET /students` returns:

```json
[
  {"studentId":101,"studentName":"Dheeraj"},
  {"studentId":102,"studentName":"Rahul"},
  {"studentId":103,"studentName":"Priya"},
  {"studentId":104,"studentName":"Sneha"}
]
```

## Deploy on Render

Create a Render Web Service connected to this repository and select **Docker**
as the runtime. Render uses the root `Dockerfile` and supplies the `PORT`
environment variable. After deployment, verify:

```text
https://<your-render-service>.onrender.com/students
```
# 2400030126_insem2
