

# Spring Boot

> On Mac with homebrew, maven

## Installation

- Install maven: `brew install maven`

- Get spring-starter-web template: start.spring.io

- Change xxxApplication.java file:

    ```java
    @RestController
    @SpringBootApplication
    public class WebDemoApplication {
    
    	@RequestMapping("/")
    	String home() {
    		return "Hello World!";
    	}
    
    	public static void main(String[] args) {
    		SpringApplication.run(WebDemoApplication.class, args);
    	}
    }
    ```

- Start up spring boot project with maven: `mvn spring-boot:run` 

    - Set os env: *export MAVEN_OPTS=-Xmx1024m* 

- Start up spring boot project with gradle: `gradle bootRun` 

    - Set os env: *export *JAVA*_OPTS=-Xmx1024m* 

## Spring Boot Application Execution Process

![image-20220822173637072](image-20220822173637072.png)

## Deploy

### Deploy Spring Boot App without Embedded Server

- **Install Java**
- **Download and Set up Web Server (tomcat)**
- **Package App as War file**
    - Selecting *War Packaging* when create Spring Boot Project
    - Run as *Maven Build*, Goal as *clean install*
    - When complete, refresh the project directory
- **Deploy a Web Server (tomcat)**
    - Copy "xxx.war" file to tomcat/webapps directory
    - `cd bin/`
    - `chmod +x catalina.sh`
    - startup: `sh startup.sh`
    - Shutdown: `sh shutdown.sh`

### Deploy Spring Boot App with Embedded Server

- **Install Java**
- **Package App as Jar file and Run as Java app**

## Run Using Command-Line

- Using `java -jar`
    1. Build: `mvn package`
    2. Run: `java -jar target/xxx.jar`

- Using `mvn spring-boot:run`
    - or `mvnw spring-boot:run`

## Spring Dev Tool

> Restart the application when any file is changed

## Some important Concepts in Spring

### `BeanFactory` and `ApplicationContext` represent the Spring IoC container.

- `BeanFactory` provides basic functionslities to manage beans.
- `ApplicationContext` is a *sub-interface* of the `BeanFactory`. It provides more enterprise-specific functionalities: resolving message, supporting internationalization, publishing events, add application-layer specific contexts.

### `Bean` is an object that the Spring container instantiates, assembles, and manages.

- Configuring Beans in the Container
    - Java-Based Configuration: uses **@Bean-annotated methods within a @Configuration class**.  The *@Bean* annotation on a method indicates that the method creates a Spring bean. Moreover, a class annotated with *@Configuration* indicates that it contains Spring bean configurations.
- Annotation-Based Configuration
- XML-Based Configuration

### JPA, Spring Data JPA, Hibernate ORM Framework

- JPA: some interfaces specifies how to map Java object to Database Table
- Spring Data JPA: is optional, use it can reduce the code in Hibernate ORM Framework
- Hibernate ORM Framework: the implementation of JPA

## Develop a Restful API Application

![image-20220823143339776](image-20220823143339776.png)

![image-20220823143422535](image-20220823143422535.png)

## Spring Boot Testing

### Unit Testing using JUnit 5 and Mockito

### Integration Testing the DB Layer using Test Containers

### Testing REST APIs using Spring MockMvc
