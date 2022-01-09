FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
COPY build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#docker build --tag=message-server:latest .
#docker run -p8080:8080 producer:latest