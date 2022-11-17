FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
RUN apk --no-cache add curl
RUN curl -u admin:123 -o achat-1.0.jar "http://198.168.1.19:8081/repository/maven releases/tn/esprit/rh/achat/1.0/achat-1.0.jar" -L
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/achat.jar"]
EXPOSE 8089