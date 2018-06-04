# setting the base image required to run your app
FROM java:8

#create a directory 
RUN mkdir /src

# setting the work directory in docker container
WORKDIR /src

# copy / add contents from current dir to container
ADD target/eureka-server-demo-0.0.1-SNAPSHOT.jar /src/eureka.jar

# Make port 9090 available to others
EXPOSE 9090

RUN sh -c 'touch /src/eureka.jar'

ENTRYPOINT ["java","-jar","/src/eureka.jar"]