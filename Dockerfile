# Usa una imagen de Java para compilar y ejecutar la aplicación
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado por Maven o Gradle
COPY target/parking-management-0.0.1-SNAPSHOT.jar app.jar

# Define el puerto en el que la aplicación se ejecutará
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
