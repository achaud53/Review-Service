FROM openjdk:17-jdk-slim-buster
VOLUME /tmp
EXPOSE 8095
ARG JAR_FILE=target/event-service.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]