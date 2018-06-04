FROM java:8

RUN mkdir /src

WORKDIR /src

ADD target/restaurant-springboot-0.0.1-SNAPSHOT.jar /src/restaurantapp.jar

EXPOSE 8080

RUN sh -c 'touch /src/restaurantapp.jar'

ENTRYPOINT ["java","-jar","/src/restaurantapp.jar"]