# Hoen Scanner — Dropwizard REST API learning project

The repository currently contains a small Java / Dropwizard REST API prototype. Despite the repository name, the current source code does **not** scan files, detect malware or perform hotel/flight searches against a live provider.

The implemented endpoint accepts a city and returns two fixed demonstration records: a hotel entry and a rental-car entry. This is a simple API exercise that can be extended with real service integrations and validation.

## Current functionality

- Dropwizard application entry point and configuration.
- `POST /search` endpoint accepting JSON with a `city` field.
- JSON response containing two hard-coded sample results.
- Dropwizard health check endpoint.

Example request:

~~~bash
curl -X POST http://localhost:8080/search \
  -H "Content-Type: application/json" \
  -d '{"city":"Bengaluru"}'
~~~

The response values are illustrative and are not retrieved from an external API.

## Technology

- Java 11 (configured in `pom.xml`)
- Dropwizard 4.0.5
- Maven
- Jersey / JAX-RS
- Jackson

## Project layout

~~~text
hoen-scanner/
└── hoen-scanner/
    ├── pom.xml
    ├── config.yml
    └── src/main/java/com/skyscanner/
        ├── HoenScannerApplication.java
        ├── HoenScannerConfiguration.java
        ├── Search.java
        ├── SearchResource.java
        └── SearchResult.java
~~~

## Build and run

Prerequisites: JDK 11 and Maven.

~~~bash
cd hoen-scanner
mvn clean package
java -jar target/hoen-scanner-1.0-SNAPSHOT.jar server config.yml
~~~

The application listens on port 8080 by default. The health check is available at:

~~~text
http://localhost:8081/healthcheck
~~~

## Improvements needed

- Validate that the request contains a non-blank city.
- Replace hard-coded response entries with a well-defined service or provider integration.
- Add unit and resource tests for valid, empty and malformed requests.
- Add structured error responses and request logging.
- Rename the project or expand its implementation if the intent is to become a real scanner.

## Author

Akash V Hiremath — [GitHub](https://github.com/AkashVH5500)
