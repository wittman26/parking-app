# Parking-app

Parking-app is an API REST application example built with Spring Boot framework.

# Built With

This project is built using the following technologies:
- Java Spring framework 3.2.5
- Java 17

## Running using Maven

MongoDB should be running before starting the app.

```
mvn spring-boot:run
```

In windows systems type

```
./mvnw spring-boot:run
```

### Configuration files

Properties for configuration can be found in `/sensor-app/src/main/resources` path. The following properties files can be found:

```conf
    application-dev.yml
    application.yml
```

The following are the main properties that should be set on the **application.yml** before starting the app

```conf
# Basepath to consult the API {{base-url}}{{basepath}}/parking
basepath: /api

# Database properties
spring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: parking
server:
  port: '9091'
```

The default endpoint is: `localhost:9091/api`

# Docker Compose

First, generate `parking-management-0.0.1-SNAPSHOT.jar` file
by executing the following command:

```
./mvnw clean package
```
## Build and getting up containers

Execute the following command in root folder (where docker-compose.yml is stored):

```
docker-compose up --build
```
### Access the application

Spring Boot application will be available at http://localhost:9191.

MongoDB will be available at mongodb://localhost:27017.
 
Check container logs:

```
docker-compose logs -f
```

Stop and delete containers:

```
docker-compose down
```


Postman collection is provided in root folder to test the application.