FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /usr/home/app
COPY /querination-server/target/*.jar querination-server.jar
ENTRYPOINT ["java", "-jar", "querination-server.jar"]
