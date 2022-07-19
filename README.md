# JDBC: POJOs and DAOs to save, update and delete entries

### Description
This project combines "Project setup", "POJOs with Lombok and generating test data with JavaFaker" and POJOs and DAOs.


#### Theory:
1. Data Access Object (DAO) Pattern
2. Java Generics


#### Practical tasks:
**Task 1**
**Create a DAO Interface**

Description:  create an interface that the Customer DAO class will implement. The following methods should be included:
* save() - saves the record to the database
* update() - updates the record in the database
* delete() - deletes the record from the database
* deleteAll() - deletes all records in the table
* getRandomId() - returns a random record id
* getRandomIds(X) - returns a list of X random records' id
* getRecordsCount() - get the count of all records in the table
* getByID() - to extract a single object from the database by ID
* getByIDs() - to extract a list of objects from the database by a List of IDs

The getByID() and getByIDs() methods will be implemented in the next stories.

**Task 2**
**Create Customer DAO**

Description: Create a DAO for the customers table that implements the CRUD DAO interface.
 
### Instruction
#### Prerequisites
1. SQL: Local database environment setup.
2. customers table with example data
##### Useful links:
1. https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
2. https://www.baeldung.com/java-generics
