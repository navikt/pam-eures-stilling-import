FROM navikt/java:8
WORKDIR /app
COPY war/target/euresapi.jar /app/app.jar