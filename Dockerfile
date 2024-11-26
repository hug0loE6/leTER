FROM maven:3.8.1-jdk-11-openj9
WORKDIR /agl-lightter24-fork
COPY . .
EXPOSE 8080
CMD ["java", "-jar", "./target/lightter24-0.0.1-SNAPSHOT.jar"]