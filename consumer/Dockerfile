FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
EXPOSE 8081
COPY build/libs/consumer-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#docker build --tag=message-server:latest .
#docker run -p8081:8081 producer:latest