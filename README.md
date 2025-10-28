# Java Bank Account System - Polymorphism Example

A Java application demonstrating object-oriented programming principles, particularly **polymorphism** and **inheritance**, through a simple bank account management system.

## 📁 Project Structure

This project consists of three Java classes that form an inheritance hierarchy:

- **`Account.java`** - Base class containing common account properties
- **`Savings.java`** - Derived class representing a savings account with minimum balance
- **`Credit.java`** - Derived class representing a credit account with overdraft limit

## 🏦 Class Hierarchy


## 🔧 Polymorphism Demonstrated

### 1. **Method Overriding**
- Both `Savings` and `Credit` classes override the `toString()` method from the `Account` class
- Each subclass provides its own specific implementation while maintaining the same method signature

### 2. **Inheritance**
- Subclasses inherit common properties (`accountNumber`, `balance`) and methods from the base `Account` class
- Subclasses extend functionality with specialized properties (`minBalance`, `overdraftLim`)

### 3. **"is-a" Relationship**
- A `Savings` account **is-a** `Account`
- A `Credit` account **is-a** `Account`

## 📋 Code Features

### Account Class (Base Class)
- Core account properties: `accountNumber` and `balance`
- Constructor overloading (default and parameterized)
- Getter and setter methods
- Basic `toString()` implementation

### Savings Class (Derived Class)
- Extends `Account` class
- Adds `minBalance` property
- Overrides `toString()` to include minimum balance information
- Includes main method for demonstration

### Credit Class (Derived Class)
- Extends `Account` class
- Adds `overdraftLim` property
- Overrides `toString()` to include overdraft limit information
- Includes main method for demonstration

## 🚀 How to Run

### Compile All Classes:

This project demonstrates:

Inheritance - Creating specialized classes from a general base class

Polymorphism - Same method (toString()) behaving differently in subclasses

Encapsulation - Using private fields with public getters/setters

Method Overriding - Subclasses providing specific implementations

Constructor Chaining - Using super() to call parent constructors
```bash
javac Account.java Savings.java Credit.java
