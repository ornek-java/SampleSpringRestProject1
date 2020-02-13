FROM java:8
WORKDIR /
ARG JAR_FILE
COPY ${JAR_FILE} . 
EXPOSE 8080
ENTRYPOINT ["java","-jar","samplespringrestproject-0.0.1.jar"]
