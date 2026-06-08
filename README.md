## Intern ID : CITS1037
# Student Management System

A console-based Student Management System built using Java and Object-Oriented Programming (OOP) principles.

This application allows users to manage student records by performing CRUD (Create, Read, Update, Delete) operations through a menu-driven interface. It also includes input validation and duplicate ID prevention to ensure data consistency.

## Features

* Add Student
* Delete Student
* Update Student Details
* View All Students
* Search Student by ID
* Input Validation
* Duplicate Student ID Prevention
* Menu-Driven Console Interface

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Exception Handling
* Git & GitHub

## Project Structure

```text
StudentManagementSystem
│
├── src
│   ├── Main.java
│   ├── StudentDetails.java
│   └── StudentSystem.java
│
└── README.md
```

## How It Works

Each student record contains:

* Student ID
* Name
* Age
* Course
* Marks

The system allows users to:

1. Add a new student
2. Delete an existing student
3. Update student details
4. Display all students
5. Search for a student by ID
6. Exit the application

## Validation Rules

* Student ID must be unique.
* Age must be greater than 0.
* Marks must be between 0 and 100.
* Name cannot be empty.
* Course cannot be empty.
* Numeric fields accept numbers only.

## Sample Menu

```text
============= Student Management System =============

1. Add Student
2. Delete Student
3. Update Student
4. Show All Students Details
5. Show Specific Student Details
6. Exit
```

## Future Improvements

* File Handling for permanent data storage
* Database integration (MySQL)
* Course management system
* Student grade calculation
* Graphical User Interface (GUI)
* Search by name and course

## Author

Rishabh

GitHub Project: Student Management System
