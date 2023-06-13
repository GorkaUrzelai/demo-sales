# Define la imagen base
FROM openjdk:17-jdk-slim

# Copia el archivo JAR de la aplicación en el contenedor
COPY target/demo-sales.war app.war

# Comando para ejecutar la aplicación cuando se inicie el contenedor
ENTRYPOINT ["java","-jar","/app.war"]
