
## Tests
Integration Tests class name must ends with "IT" to allow failsafe plugin to recognize it as Integration Test.
We are not running IT with every build (we will run in that case unit tests instead), if we want to run integration tests we need to add profile
"integration-tests" to maven command (ex. mvn verify -Pintegration-tests).