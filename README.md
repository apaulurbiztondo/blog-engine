# Basic Blog Engine

This is a basic blog engine web application built using Java 17, Spring Framework, and FreeMarker. The application displays a list of blog posts on the homepage, and allows users to view detailed pages for each blog post. The project also includes basic styling with CSS and Bootstrap 3 for a modern blog page.

## Features

1. Load the blog posts from JSON file to in-memory database(h2).
2. Fetch the list of blog post from the database and display on the homepage.
3. Each blog post has a title, content, and publication date.
4. Allow users to view a detailed page for each blog post.
5. Implement a simple controller to handle requests and serve templates.
6. Basic error handling for invalid requests or missing data.
7. Styling with CSS and Bootstrap 3.

## Project structure
![image](https://github.com/apaulurbiztondo/blog-engine/assets/19607548/56bfa23e-71f1-4f07-be6b-7482ee1fd433)



## Getting Started

1. Clone the repository.
2. Open the project in your preferred IDE.
3. Run mvn clean install.
4. Change the schema.sql SQL Dialect to h2. ![image](https://github.com/apaulurbiztondo/blog-engine/assets/19607548/fd5489aa-4ae1-4238-b2b1-5d2f9796208a)
5. Build and run the application.
6. Access the application at `http://localhost:8080/blog/home`.
7. Access the in-memory database at `http://localhost:8080/h2-console`.(Optional)

## Tools and Dependencies

- Java 17
- Maven
- Git
- Intellij IDEA
- Bootstrap 3
- Spring Boot Starter Data JDBC
- Spring Boot Starter Freemarker
- Spring Boot Starter Web
- Spring Boot DevTools
- H2 Database
- Lombok
- Spring Boot Starter Test
