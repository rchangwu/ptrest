# Prueba Tecnica de INNOCV

Built using Java 8 and Spring Boot 2.2.4.

Dependencies:
 - Spring Web
 - Spring Data JPA
 - H2 Database

## Instructions

 1. Run PtrestApplication.java
 2. Access through http://localhost:8080/api/v1

## Endpoints

GET - /users  
Get the list of all the users.

GET - /users/{id}  
Get user by id number.

POST - /users  
Create a new user with name and birthdate. birthdate must be in "yyyy-MM-dd" format.

PUT - /users/{id}  
Update user by id number. Must update both name and birthdate or empty field will be *null*.

DELETE - /users/{id}  
Delete user by id number.