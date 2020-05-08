**Changing The Java Version**
  
- Change \<release\> in backend > pom.xml.
- Change $JAVA_HOME environment variable
- 

Frameworks
------
**Spring Boot**  
The backend is written using the Spring Boot framework to minimize boilerplate Java code and because it allows for
lightweight development with Plain-Old-Java-Objects. The spring-boot-web-starter dependency provides an embedded Apache 
Tomcat server which is used in this application.

Database 
------
**Why JPA?**  
JPA provides standard interfaces which needs to be implemented. It doesn't lock you into a vendor's implementation.
You can switch between vendor implementations when you're coding against the JPA standard interfaces.  

**MariaDB**  
This application connects to a MariaDB database. MariaDB is very similar to MySQL, but provides some useful performance
improvements.

Frontend
------
**Thymeleaf**  
Thymeleaf is used as a template engine to generate HTML views, and it is also more extendable than JSP. In this 
application Thymeleaf will pass information to the templates while Vue.js will render it in a single page view.  
  
**Vue**  
The frontend view is generated using the Vue.js Javascript framework as it is easy to work with, scalable, and makes 
for some good looking frontend pages.

CRUD
------
Album REST Controller | Album Service | Album DAO | mariadb

Project Structure
------
Every class except the main class is in a sub-package because spring will automatically scan for components this way.
There is no need to reference specific packages.
Other packages can be added via the scanBasePackages variable for automatic component scanning.

Additional Info
------
Static content like HTML, JavaScript, images etc. go into the /static directory.

src/main/webapp should only be used if the application is packaged as a .war file as opposed to a .jar file.

If you're using the IntelliJ IDE the spring boot devtool dependency requires some tweaking for reloading to work

Packaging the application
------
Navigate to the project directory

`mvn package`

or, without Maven installed

`./mvnw package`

Running the application
------
Navigate to `/target/`

`java -jar webapp.jar`

or from the directory in which `pom.xml` resides

`mvn clean compile test`

If you don't have Maven installed, this will automatically download and run the correct version

`./mvnw spring-boot:run webapp.jar`