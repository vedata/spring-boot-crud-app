# spring-boot-crud-app

This is a spring-boot crud appliation with jdbc authentication 

## Requirements

* Java8+
* Postgres9


## Application architecture

![screenshot from 2017-06-16 17-57-11](https://user-images.githubusercontent.com/15045220/27234448-63b94176-52bd-11e7-8a3c-9b5508a9ffb8.png)




## Usage

```
    1. Create postgres table 
        
       $ Execute the query (createdb.txt) to create customer tables
       
    2. Configure database 

       $ Configure data properties in application.properties
         spring.datasource.url=jdbc:postgresql://localhost/testdb
         spring.datasource.username=postgres_username
         spring.datasource.password=123
         
    2. Run application

      $ java -jar ./spring-boot-crud-app/mtc-api/target/mtc-api-0.0.1-SNAPSHOT.jar
