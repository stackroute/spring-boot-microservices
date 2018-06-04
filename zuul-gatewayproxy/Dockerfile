FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/spring-boot-zuulgatwayproxy-0.0.1-SNAPSHOT.jar /src/apigateway.jar

EXPOSE 8092

RUN sh -c 'touch /src/apigateway.jar'

ENTRYPOINT ["java", "-jar","/src/apigateway.jar"]