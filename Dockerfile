FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

# Copy the JAR file from the target directory to the root of the image
COPY target/crm-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8083