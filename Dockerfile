FROM openjdk:8-alpine
LABEL "purpose"="practice"
RUN apk add git maven bash
ADD target/bodong-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["/bin/bash", "-c", "echo container is started"]
CMD ["/bin/bash", "-c", "java -jar bodong-0.0.1-SNAPSHOT.jar"]