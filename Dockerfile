FROM openjdk:17-jdk-slim
ARG JAR_FILE="target/app_microservices_delete_inventory-0.0.1.jar"
COPY ${JAR_FILE} app_iventory_delete.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","app_iventory_delete.jar"]
