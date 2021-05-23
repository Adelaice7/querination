FROM openjdk:11-jdk

COPY target/*.war querination-web.war

ENTRYPOINT ["java", "-jar", "querination-web.war"]