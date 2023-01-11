FROM amazoncorretto:18-alpine-jdk

MAINTAINER Kibbax

COPY target/mec-0.0.1-SNAPSHOT.jar mec-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/mec-0.0.1-SNAPSHOT.jar"]