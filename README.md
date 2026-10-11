# Employee Salary Management System (Java)

## 📌 Project Overview

The **Employee Salary Management System** is a Java-based project that demonstrates important Object-Oriented Programming (OOP) concepts. It calculates employee salaries based on their employment type, such as full-time employees, part-time employees, and managers.

This project uses an abstract class, inheritance, method overriding, constructor overloading, and encapsulation to implement salary calculation efficiently.

## 🚀 Features

* **Abstract Class:** Uses an abstract `Employee` class to define common employee properties and salary calculation behavior.
* **Encapsulation:** Keeps employee details private and provides getter methods to access them.
* **Inheritance:** Extends the `Employee` class to create `FullTimeEmployee` and `PartTimeEmployee` classes. The `Manager` class extends `FullTimeEmployee`.
* **Method Overriding:** Implements `calculateSalary()` differently for each employee type.
* **Constructor Overloading:** Provides multiple constructors for `FullTimeEmployee`, allowing employees to be created with or without a bonus.
* **Polymorphism:** Uses an `Employee` array to store different employee types and calls their overridden methods dynamically.
* **Salary Calculation:** Calculates salaries according to the employee's role and compensation details.

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Concepts:** Object-Oriented Programming (OOP)
* **IDE:** IntelliJ IDEA / Visual Studio Code
* **Version Control:** Git and GitHub

## 📂 Project Structure

```text
Employee-Salary-Management/
│
├── Main.java
└── README.md
```

## 💻 Classes and Their Responsibilities

### 1. Employee (Abstract Class)

* Stores employee name and ID.
* Provides getter methods for employee details.
* Declares the abstract method `calculateSalary()`.
* Defines the concrete method `display()` to print employee information and salary.

### 2. FullTimeEmployee

* Extends the `Employee` class.
* Stores base salary and bonus.
* Supports two constructors: one without a bonus and another with a bonus.
* Calculates salary using the following formula:

**Salary = Base Salary + Bonus**

### 3. PartTimeEmployee

* Extends the `Employee` class.
* Stores hours worked and hourly rate.
* Calculates salary using the following formula:

**Salary = Hours Worked × Hourly Rate**

### 4. Manager

* Extends the `FullTimeEmployee` class.
* Includes an additional incentive.
* Overrides `calculateSalary()` to calculate the manager's total salary.

**Salary = Base Salary + Bonus + Incentive**

### 5. Main

* Creates full-time and part-time employee objects.
* Stores them in an `Employee` array.
* Uses a `for-each` loop to display employee details and salaries.

## ▶️ How to Run the Project

### Step 1: Install Java

Install the Java Development Kit (JDK) on your computer.

### Step 2: Create the Java File

Save the complete source code in a file named `Main.java`.

### Step 3: Open the Terminal

Navigate to the directory containing `Main.java`.

### Step 4: Compile the Program

```bash
javac Main.java
```

### Step 5: Run the Program

```bash
java Main
```

## 📊 Sample Output

```text
Employee Name : John
Employee ID   : 101
Salary        : 55000.0

Employee Name : Jane
Employee ID   : 102
Salary        : 3000.0
```

## 🧠 OOP Concepts Demonstrated

| OOP Concept             | Implementation                                        |
| ----------------------- | ----------------------------------------------------- |
| Abstraction             | Abstract `Employee` class                             |
| Encapsulation           | Private fields and getter methods                     |
| Inheritance             | `FullTimeEmployee`, `PartTimeEmployee`, and `Manager` |
| Polymorphism            | `Employee` references and overridden methods          |
| Method Overriding       | `calculateSalary()`                                   |
| Constructor Overloading | Multiple `FullTimeEmployee` constructors              |

## 🎯 Learning Outcomes

After completing this project, you will understand how to:

* Design an abstract class in Java.
* Implement inheritance between classes.
* Use method overriding to provide specialized behavior.
* Apply runtime polymorphism.
* Implement encapsulation using private fields and getter methods.
* Calculate salaries using different employee compensation structures.
* Organize a Java program using OOP principles.

## 🔮 Future Improvements

* Add user input to enter employee details dynamically.
* Include additional employee types.
* Implement tax and deduction calculations.
* Store employee records using a database.
* Develop a graphical user interface (GUI).
* Add functionality to update and search employee records.

## 👨‍💻 Author

**Sourav Kumar**

B.Tech Computer Science Engineering (Artificial Intelligence and Machine Learning)

## 📄 License

This project is available for educational and learning purposes. You may use and modify the code to practice Java programming and Object-Oriented Programming concepts.
