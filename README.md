# Freshworks
A Rest APIs User Database

GET, POST, PUT, DEL is to be used on Postman.

GET: http://localhost:8080/api/v1/employees/ <br>

POST: http://localhost:8080/api/v1/employees <br>
{
"firstName": "Kai",
"lastName": "Three",
"emailId": "kai3@mail.com"
} <br>

DEL: http://localhost:8080/api/v1/employees/5 <br>
Where '5' refers to with Id of 5.

PUT: http://localhost:8080/api/v1/employees/5 <br>
Which updates Id '5' to the following: <br>
{
"firstName": "Kai",
"lastName": "Four",
"emailId": "kai4@mail.com"
} <br>

For database, refer to Dump20220924.sql file to create database for this system to work.