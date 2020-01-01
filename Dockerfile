FROM alpine
LABEL "purpose"="practice"
RUN apk add openjdk11 git maven bash
RUN rm -rf bodong_kotlin
RUN git clone https://github.com/DaehoKing/bodong_kotlin.git
RUN mvn -f bodong_kotlin/pom.xml package
EXPOSE 8020
CMD ["/bin/bash", "-c", "echo container is started"]
CMD ["/bin/bash", "-c", "java -jar bodong_kotlin/target/bodong-0.0.1-SNAPSHOT.jar"]