FROM navikt/java:12
WORKDIR /app
COPY target/euresapi.jar /app/app.jar