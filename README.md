# Kotlin Spring Boot Bank Application

A Backend Project for manipulating Bank Data using Kotlin and Spring Boot.

### Implemented APIs
`GET`       `/api/banks/`
> get all banks

`GET`       `/api/banks/{accountNumber}`
> get the bank with the `accountNumber`

`POST`      `/api/banks/` 
> add a bank

`PATCH`     `/api/banks/`
> update a bank

`DELETE`    `/api/banks/`
> delete a bank

### Unit Test with `JUnit5`
Each API endpoint is created with at least 1 Unit Test with `JUnit5`