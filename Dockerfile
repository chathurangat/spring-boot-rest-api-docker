FROM java:8
LABEL maintainer=“chathuranga.t@gmail.com”
WORKDIR /app
COPY target/spring-boot-rest-api-docker-0.0.1-SNAPSHOT.jar /app/spring-boot-app.jar
ENTRYPOINT ["java","-jar","spring-boot-app.jar"]