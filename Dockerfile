FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY . /app
RUN ./mvnw clean install
CMD ["java", "-jar", "target/clientes-0.0.1-SNAPSHOT.jar"]
