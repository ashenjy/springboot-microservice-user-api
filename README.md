# A Sample Spring Boot Microservice User API
A sample microservice user api written from Spring Boot.

## Instructions for Running the Sample

If you wish to build the project from source, you can use Maven. (eg: mvn clean install)
If not you can directly run the application from the jar file available in target directory.
Use following command to run the application. (you can change the port number as you wish)

```java -jar sample-1.0-SNAPSHOT.jar --server.port=8080```

Once the application starts, you can send HTTP requests to the URL http://localhost:8080/api/user for calling the user operation methods exposed.
