## Spring Web JPA Starter

Simple Spring Boot Web JPA Starter Application.
* Uses Maven directory structure
* Runs under embedded Tomcat as Java application
* JPA with Hibernate.
* Embedded HDBSQL database.
* JSP page
* Rest service.

**Requires Java 1.7 or later.**

**To use from releases:** 
* Download the jar directly from the [releases](https://github.com/karlnicholas/springwebjpastarter/releases) directory. 
* run the application `java -jar springwebjpastarter-0.0.1.war`
* open web browser to `http://localhost:8080`

**To build :** 
* clone the repository `git clone https://github.com/karlnicholas/springwebjpastarter.git`
* build the jar `mvn package` 
* run the application with `mvn spring-boot:run`
* open web browser to `http://localhost:8080`

**Rest Service API**
* `GET` `http://localhost:8080/api/user` -- list all users
* `GET` `http://localhost:8080/api/user?id={id}` -- return specific user by id
* `POST` `http://localhost:8080/api/user?name=XXX` -- create user named XXX

