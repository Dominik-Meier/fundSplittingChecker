# Fund splitting checker
A console application for ZKB to check if the positions of a fund add up to 100%. The fund can be provided as a list of funds in an xml file.

## General info
* The application is managed by Maven to use tools like CI/CD or easy dependency management.
* SpringBoot, jaxb and lombok are used as additional libraries to get the job done.
* It is assumed that an error log is sufficient in case of failure (not 100% +-0.01). Therefore the exception is caught.


## How to use the application
1. Build the application with Maven ex. Run `mvn clean install` in the root directory of the project. If you want to skip the tests use `mvn clean install -DskipTests`.
2. To use the application, use the `.jar'` from step 1 with the following command in the root dir `java -jar .\target\fundSplittingChecker-0.0.1-SNAPSHOT.jar .\src\main\resources\input_valid.xml`.
3. If you need to change the input file (application argument 1), update the path of the file accordingly.


## Tests
1. To test the app us `mvn test`