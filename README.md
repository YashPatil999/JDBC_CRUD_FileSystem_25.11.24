Student Management System:

This project is a Java-based Student Management System that interacts with a MySQL database to perform CRUD (Create, Read, Update, Delete) operations on student data. Below is an explanation of the project structure, functionality, and usage.

Project Structure:
Controller:

StudentController: Acts as the entry point of the application, allowing you to invoke various service methods.

Service:

StudentService: Provides a layer between the controller and data access, encapsulating the logic for database operations.

DAO (Data Access Object):

StudentDAO: Directly interacts with the database to execute SQL commands for creating tables, inserting data, updating records, deleting records, and fetching data.
