# Java Spring Framework 6 Fundamentals

### Project Setup
Spring Framework dependency lives in pom.xml under the `dependencies` tag. Spring helps inject mock data in order to start building without needing to wait for a data source (Database, webservice, etc.) to be ready,

* Model - contains Java objects for the application
* Repository - mimics talking to a database, for this instance this functionality will be mocked
* Services - Holds the business logic for the application
* App Config - 
* Application - 

### Details
This project uses scopes to define service and repository. It also makes use of autowiring for constructor and setter injection.

#### Comparing and Contrasting using XML vs. Java Configuration
* XML has a natural separation of concerns
* applicationContext.xml (lives in /src/main/resources) <-> AppConfig
  * 