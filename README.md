# Parking-app

Parking-app is an API REST application example built with Spring Boot framework.

# Built With

This project is built using the following technologies:
- Java Spring framework 3.2.5
- Java 17
- 
## Running using Maven

MongoDB should be running before starting the app.

```
mvn spring-boot:run
```

In windows systems type

```
./mvnw spring-boot:run

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

Postman collection is provided in root folder to test the application.