FROM openjdk
COPY ./target/docker-test-2-0.0.1-SNAPSHOT.jar src/docker-test.jar
WORKDIR src
CMD ["java", "-jar", "docker-test.jar"]