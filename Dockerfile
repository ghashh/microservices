FROM java:8
EXPOSE 8089
ADD /target/livraison-0.0.1-SNAPSHOT.jar livraison.jar
ENTRYPOINT ["java","-jar","livraison.jar"]