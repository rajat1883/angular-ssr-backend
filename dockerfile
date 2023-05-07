FROM openjdk:18

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/angularssrbackend-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} angularssrbackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/angularssrbackend-0.0.1-SNAPSHOT.jar"]