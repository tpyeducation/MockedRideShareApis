# Use lightweight Java 17 runtime
FROM eclipse-temurin:17-jdk-jammy

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8085 8081

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]