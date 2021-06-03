FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /usr/home/app
COPY /querination-web/target/querination-web.war querination-web.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "querination-web.war"]
