# Travel_management_system
## Project Description
The Tourism Management System aims to efficiently manage customer information, hotel bookings, cancellations, and tourist destinations. It is designed to streamline administrative tasks and reduce manual effort in managing tourists, bookings, and destinations.

Tourists can register by providing personal details, make reservations, book hotels and packages, and make cancellations. The project is built using Java programming language and utilizes MySQL for backend database management.
![image](https://github.com/kusum0001/travel_management_system/assets/69834578/08dd0dbc-599e-4e58-a38c-a21d3a7eaa7e)

![image](https://github.com/kusum0001/travel_management_system/assets/69834578/db139551-5350-4c6a-ba21-12e98df03356)


## Software Specification
1)Integrated Development Environment: Netbeans

2)Database Management: MySQL Command Line Client

3)Programming Language: Java

## Schema Diagram
A database schema is the skeleton structure that represents the logical view of the entire database. It defines how the data is organized and how the relations among them are associated. It formulates all the constraints that are to be applied on the data.

![image](https://github.com/kusum0001/travel_management_system/assets/69834578/c83f9fc6-775a-4943-b4a1-ad34476268c1)

## Description of Tables

ACCOUNT

username: VARCHAR(30) (Primary Key)

Name: VARCHAR(30)

password: VARCHAR(30)

security: VARCHAR(30)

Answer: VARCHAR(30)

CUSTOMER

username: VARCHAR(30) (Foreign Key)

id: VARCHAR(30) (Primary Key)

id_number: VARCHAR(30)

name: VARCHAR(30)

gender: VARCHAR(30)

country: VARCHAR(30)

address: VARCHAR(30)

phone: VARCHAR(30)

email: VARCHAR(30)

BOOK PACKAGE

username: VARCHAR(30) (Foreign Key)

package: VARCHAR(30)

persons: INT(10)

id: VARCHAR(30) (Foreign Key)

id_number: VARCHAR(30)

phone: VARCHAR(30) (Primary Key)

price: VARCHAR(30)

BOOK HOTEL

username: VARCHAR(30) (Foreign Key)

hotel: VARCHAR(30) (Foreign Key)

persons: INT(10)

days: INT(10)

Ac: VARCHAR(30)

food: VARCHAR(30)

Id: VARCHAR(30) (Foreign Key)

id_number: VARCHAR(30)

phone: VARCHAR(30) (Foreign Key)

price: VARCHAR(30)

HOTEL

hotel: VARCHAR(30) (Primary Key)

cost_per_day: INT(10)

food_charges: INT(10)

ac_charges: INT(10)

## CONCLUSION AND FUTURE ENHANCEMENT 
The process of the system we can consider here, can maintain the databases of the system. We can insert to the databases and retrieve all the information. 
The main aim of this project is to help the tourists to manage their trip. It makes all operation of the tour company easy and accurate. The standalone platform makes tourism management easy by handling requests and providing servers for the customers located at different parts of the various cities. Different modules have been incorporated in this project to handle different parts and sector of the tour management field.

