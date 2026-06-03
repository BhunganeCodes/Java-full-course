# 📘 Module 09: Object-Oriented Programming (OOP)

---

## 🎯 Learning Objectives

In this module, you will:

* Understand classes and objects
* Use constructors (including overloaded constructors)
* Apply inheritance and method overriding
* Use encapsulation with getters and setters
* Work with abstraction and interfaces
* Understand and apply polymorphism
* Build structured, scalable Java applications

---

## 🎥 Video Learning Resource

[Java Full Course for Beginners by Bro Code](https://youtu.be/xTtL8E4LzTQ)

### ⏱ Watch These Sections in Order (VERY IMPORTANT):

### 1️⃣ Classes + Constructors

* **06:41:47 → 07:01:45**

### 2️⃣ Constructor Overloading + Arrays of Objects

* **07:01:45 → 07:14:07**

### 3️⃣ Static + Inheritance

* **07:14:07 → 07:31:09**

### 4️⃣ `super`, Overriding, `toString()`

* **07:31:09 → 07:46:08**

### 5️⃣ Abstraction + Interfaces

* **07:51:58 → 08:07:44**

### 6️⃣ Polymorphism

* **08:07:44 → 08:19:35**

---

### 📚 Study Method:

* Watch section-by-section
* Pause frequently
* Build each class yourself
* Test every concept
* Focus on understanding architecture

---

## Learning Outcomes Assessed

* Classes & Objects
* Constructors
* Constructor Overloading
* Encapsulation
* Getters & Setters
* Inheritance
* Method Overriding
* Abstraction
* Interfaces
* Polymorphism
* Software Design Principles

---

## Module Structure

### Coding Practice Files:

```java
Person.java
Student.java
Animal.java
Playable.java
```

---

## Your Task

You must:

* Build proper Java classes
* Understand object creation deeply
* Apply constructor logic correctly
* Use overloaded constructors
* Protect data with encapsulation
* Implement inheritance professionally
* Override methods properly
* Use abstract classes and interfaces
* Demonstrate polymorphism
* Pass all tests successfully

---

## How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run module-specific tests:

```bash
mvn test -Dtest=Module09Test
```

---

# 🧠 Core OOP Concepts

---

# 🔹 What is a Class?

A class is a blueprint for creating objects.

### Example:

```java
Person person = new Person("John", 25);
```

### Real-World Use:

Classes model entities like:

* People
* Students
* Vehicles
* Bank Accounts
* Animals

---

# 🔹 What is a Constructor?

A constructor initializes an object when it is created.

### Example:

```java
public Person(String name, int age)
```

### Why It Matters:

* Ensures valid initialization
* Sets object state
* Reduces setup errors

---

# 🔹 What is Constructor Overloading?

Multiple constructors with different parameter lists.

### Example:

```java
new Person()
new Person("John")
new Person("John", 25)
```

### Benefit:

Allows flexible object creation.

---

# 🔹 What is Encapsulation?

Encapsulation protects data using:

* `private` fields
* Public getters
* Public setters

### Benefit:

* Prevents invalid data
* Improves security
* Makes code maintainable

---

# 🔹 What is Inheritance?

Inheritance allows one class to extend another.

### Example:

```java
Student extends Person
```

### Benefit:

* Code reuse
* Cleaner architecture
* Shared functionality

---

# 🔹 What is Method Overriding?

A child class replaces inherited behavior.

### Example:

```java
toString()
```

---

# 🔹 What is Abstraction?

Abstract classes define required behavior without full implementation.

---

# 🔹 What are Interfaces?

Interfaces enforce required behaviors.

---

# 🔹 What is Polymorphism?

One parent type can represent many child forms.

---

# 🧪 Project Structure

```plaintext
module09/
├── Person.java
├── Student.java
├── Animal.java
├── Playable.java
├── tests/
│   └── Module09Test.java
└── README.md
```

---

# 🧩 Part 1: Classes & Constructors

# Question 1 - Person Class

## Class:

```java
Person
```

---

### Objective:

Create a `Person` class with:

### Fields:

* `private String name`
* `private int age`

---

### Required Constructors:

### Default Constructor:

```java
Person()
```

Rules:

* Default name
* Age = `0`

---

### Parameterized Constructor:

```java
Person(String name, int age)
```

Rules:

* Set both values

---

### Overloaded Constructor:

```java
Person(String name)
```

Rules:

* Set name
* Age = `0`

---

### Examples:

| Code                   | Result         |
| ---------------------- | -------------- |
| new Person()           | Default object |
| new Person("John")     | Name only      |
| new Person("John", 25) | Full object    |

---

# 🧩 Part 2: Encapsulation

# Question 2 - Getters & Setters

---

### Rules:

* Age cannot be negative
* Negative values become `0`

---

### Methods:

```java
getName()
setName()
getAge()
setAge()
```

---

### Example:

| Input      | Output   |
| ---------- | -------- |
| setAge(-5) | age = 0  |
| setAge(20) | age = 20 |

---

# 🧩 Part 3: Inheritance

# Question 3 - Student Class

## Class:

```java
Student extends Person
```

---

### New Field:

* `private String grade`

---

### Constructor:

```java
Student(String name, int age, String grade)
```

### Rules:

* Use `super(name, age)`
* Set grade

---

# 🧩 Part 4: Method Overriding

# Question 4 - Override `toString()`

### Required Format:

```java
Name: John, Age: 20, Grade: A
```

---

# 🧩 Part 5: Abstraction

# Question 5 - Abstract Class `Animal`

## Class:

```java
Animal
```

---

### Required Method:

```java
makeSound()
```

### Rules:

* Must be abstract
* Returns `String`

---

# 🧩 Part 6: Interfaces

# Question 6 - Interface `Playable`

---

### Required Method:

```java
play()
```

---

# 🧩 Part 7: Polymorphism

# Question 7 - Demonstrate Polymorphism

---

### Rules:

* Create `Animal[]`
* Store multiple child classes
* Call `makeSound()`

---

### Goal:

Understand:

* Dynamic behavior
* Shared interfaces
* Enterprise architecture principles

---

# 💡 Key Developer Tips

* Use `this` for object fields
* Use `super` for parent constructors
* Keep fields private
* Validate setter inputs
* Override methods carefully
* Follow Java naming conventions
* Think about scalability
* Prioritize clean architecture

---

# 🚀 End Goal

By completing this module, you should:

* Build Java classes confidently
* Understand professional OOP design
* Use constructors properly
* Apply inheritance correctly
* Protect object data
* Implement abstraction
* Use interfaces effectively
* Demonstrate polymorphism
* Write scalable maintainable software

---

# 🏆 Success Mindset

Object-Oriented Programming is foundational for professional software development.

Mastering OOP prepares you for:

* Backend systems
* Enterprise applications
* APIs
* Android development
* Frameworks
* Large-scale software engineering

This module is your transition from beginner programming into real software architecture.
