FROM openjdk:11
EXPOSE 8081
ADD target/javaproject.jar javaproject.jar
ENTRYPOINT ["java","-jar","/javaproject.jar"]