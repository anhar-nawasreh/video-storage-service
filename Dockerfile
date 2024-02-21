FROM bellsoft/liberica-runtime-container:jre-17-stream-musl

WORKDIR /app

COPY target/video-storage-service-0.0.1-SNAPSHOT.jar /app/video-storage-service-0.0.1-SNAPSHOT.jar

EXPOSE 8084

CMD ["java", "-jar", "video-storage-service-0.0.1-SNAPSHOT.jar"]
