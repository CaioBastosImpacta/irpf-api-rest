FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD app/irpf-rest/target/irpf-rest-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]