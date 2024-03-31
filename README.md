# Travel_management_system
Project Description
The Tourism Management System aims to efficiently manage customer information, hotel bookings, cancellations, and tourist destinations. It is designed to streamline administrative tasks and reduce manual effort in managing tourists, bookings, and destinations.

Tourists can register by providing personal details, make reservations, book hotels and packages, and make cancellations. The project is built using Java programming language and utilizes MySQL for backend database management.

Software Specification
Integrated Development Environment: Netbeans
Database Management: MySQL Command Line Client
Programming Language: Java
Schema Diagram
The database schema outlines the structure and organization of the system's data, including tables and their relationships.

Implementation
Description of Tables
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
Conclusion and Future Enhancement
The Tourism Management System efficiently manages tourist information, bookings, and destinations. It simplifies administrative tasks and enhances the overall tourist experience. Future enhancements may include integrating additional features such as online payment, real-time availability updates, and advanced reporting functionalities.
