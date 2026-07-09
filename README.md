Career Journey API

A basic Spring Boot backend application built to track and learn core Java backend engineering concepts. This project serves as an introductory sandbox for understanding RESTful APIs, Spring MVC architecture, and Maven dependency management.

Project Overview

This API exposes several basic endpoints to provide information about the developer's learning journey and goals.

Technologies Used

Java (JDK 17+)

Spring Boot (Spring Web)

Maven (Build automation and dependency management)

Embedded Tomcat (Web server)

API Endpoints

The application runs locally on port 8080 by default. You can access the following endpoints via a web browser or API testing tools (like Postman or cURL).

HTTP Method

Endpoint

Description

Expected Response

GET

/

Root endpoint welcoming the user.

Hello Raj! Welcome to your backend journey.

GET

/about

Information about current learning progress.

I am Raj. Learning Spring Boot Day 3.

GET

/goal

The primary career objective.

Become a Product Software Engineer.

GET

/motivation

A core guiding principle.

Consistency beats motivation.

How to Run

Clone the repository:
(If this project were on GitHub, you would include the clone command here).

Navigate to the project directory:

cd career.journey


Run the application using Maven Wrapper:

On Windows:

mvnw.cmd spring-boot:run


On macOS/Linux:

./mvnw spring-boot:run


Access the application:
Open your browser and navigate to http://localhost:8080.
