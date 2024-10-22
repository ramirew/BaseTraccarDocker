FROM gradle:8.10.0-jdk22 AS build

WORKDIR /app

COPY . /app

RUN apt update
RUN apt install dos2unix
RUN dos2unix gradlew

RUN ./gradlew assemble

CMD ["java -jar target/tracker-server.jar" ]