FROM openjdk:17-jdk-alpine

# Argumen untuk file JAR
ARG JAR_FILE=target/*.jar


COPY target/spring-boot-blog-rest-api-0.0.1-SNAPSHOT.jar springboot-blogapi-task-middle.jar

ENTRYPOINT ["java", "-jar", "springboot-blogapi-task-middle.jar"]