Employee Management System (Java)

Overview

This is a simple console-based Employee Management System developed using Java.
It allows users to perform basic CRUD operations (Create, Read, Update, Delete) on employee data.

The program demonstrates core Java concepts such as:
- Classes & Objects
- Encapsulation
- ArrayList (Collections)
- User input using Scanner
- Control statements (loops & switch-case)

Features
- Add a new employee
- View all employees
- Search employee by ID
- Update employee department
- Delete employee
- Exit the application

Project Structure

Employee.java

EmployeeManagementSystem.java

1. Employee.java

Represents the Employee object with:

- Fields: "id", "name", "department"
- Constructor for initialization
- Getters to access data
- Setter to update department
- "toString()" method for easy display

2. EmployeeManagementSystem.java

Main class that:
- Stores employees using "ArrayList"
- Provides menu-driven interface
- Handles all operations like add, search, update, delete

How to Run

Step 1: Compile the program
javac Employee.java 
EmployeeManagementSystem.java

Step 2: Run the program
java EmployeeManagementSystem

Sample Menu

--- Employee Management System ---
1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Update Employee Department
5. Delete Employee
6. Exit

Example Usage
- Add employees with ID, name, and department
- Search using ID
- Update department if employee changes role
- Delete employee records when needed

Limitations
- Data is stored only in memory (no database)
- Data will be lost once the program exits
- No validation for duplicate IDs

Future Improvements
- Add file or database storage (MySQL / SQLite)
- Implement input validation
- Add update for name and other fields
- Build GUI using JavaFX or Swing

Learning Outcome

This project is great for beginners to understand:
- Object-Oriented Programming (OOP)
- Java collections
- Building menu-driven applications

License

This project is free to use for learning purposes. 
