FROM openjdk:12-alpine

COPY target/DesignPatterns-1.0-SNAPSHOT-jar-with-dependencies.jar /DesignPatterns.jar

CMD ["java", "-jar", "/DesignPatterns.jar"]