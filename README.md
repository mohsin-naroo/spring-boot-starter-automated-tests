# spring-boot-starter-automated-tests

![Build Workflow](https://github.com/mohsin-naroo/spring-boot-starter-automated-tests/actions/workflows/maven.yml/badge.svg)

Spring Boot starter application for automated tests using [Cucumber](https://cucumber.io/docs/guides/browser-automation/?lang=java)

## Requirements

- [Java 17](https://www.oracle.com/pk/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

## Running the automated tests

- Execute `io.github.meritepk.cucumber.CucumberTest` as JUnit test from IDE

or

- Use maven command like `mvn test` to execute tests in Google Chrome by default or `mvn test -Dwebdriver.driver=firefox` for Firefox


- Supported browsers `chrome`, `firefox`, `edge`, `safari`, `iexplorer`

- Open `target/cucumber.html` for detailed report when tests are executed
