# 📘 Module 09: Object-Oriented Programming (OOP)

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

This module contains:

### Coding Practice:

You will complete multiple Java class files:

```java id="z4m8cv"
Person.java
Student.java
Animal.java
Playable.java
```

---

## Your task is to:

* Build real Java classes
* Understand object creation deeply
* Apply constructor logic properly
* Use inheritance and `super`
* Protect data using encapsulation
* Override methods professionally
* Work with abstraction and interfaces
* Understand how polymorphism works in larger systems
* Pass all tests successfully

---

## Your Goal

For each class:

* Use valid Java syntax
* Follow true OOP design principles
* Build scalable reusable code
* Handle edge cases
* Keep code structured
* Follow exact required formats
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="n8x2pq"
mvn test
```

### Run module tests:

```bash id="k3v7tr"
mvn test -Dtest=Module09Test
```

---

# 🧠 Core OOP Concepts

---

# 🔹 What is a Class?

A class is a blueprint for creating objects.

---

### Example:

```java id="x7p4md"
Person person = new Person("John", 25);
```

---

### Real Purpose:

Classes help developers model real-world entities such as:

* People
* Students
* Cars
* Bank accounts
* Animals

---

# 🔹 What is a Constructor?

A constructor initializes an object when it is created.

---

### Example:

```java id="t5q9wn"
public Person(String name, int age)
```

---

### Why It Matters:

Constructors ensure objects start with valid data.

---

# 🔹 What is Constructor Overloading?

Multiple constructors with different parameters.

---

### Why:

Allows flexible object creation.

---

### Example:

```java id="v2m8ky"
new Person()
new Person("John")
new Person("John", 25)
```

---

# 🔹 What is Encapsulation?

Encapsulation protects object data.

---

### Standard Practice:

* Fields → `private`
* Access → getters/setters

---

### Benefit:

Prevents invalid data entry.

---

# 🔹 What is Inheritance?

Inheritance allows one class to reuse another class’s properties and methods.

---

### Example:

```java id="j8x4rf"
Student extends Person
```

---

### Benefit:

Reduces duplicated code.

---

# 🔹 What is Method Overriding?

A child class replaces parent behavior.

---

### Example:

```java id="p4k7sz"
toString()
```

---

# 🔹 What is Abstraction?

Abstract classes define required behavior without full implementation.

---

# 🔹 What are Interfaces?

Interfaces define behaviors multiple classes can implement.

---

# 🔹 What is Polymorphism?

One parent type can represent multiple child forms.

---

# 🧪 Project Structure

```plaintext id="u6q3lv"
module09/
├── Animal.java
├── Person.java
├── Student.java
├── Playable.java
├── tests/
│   └── Module09Test.java
└── README.md
```

---

# 🔹 Part 1: Classes & Constructors

# Question 1 - Person Class

## Class:

```java id="w9z2ct"
Person
```

---

### Detailed Objective:

Create a `Person` class that represents a human being with:

* `name`
* `age`

This exercise teaches:

* Class creation
* Constructors
* Object initialization
* Overloading

---

### Required Fields:

* `private String name`
* `private int age`

---

### Constructors Required:

---

### Default Constructor:

```java id="f3v8qp"
Person()
```

Rules:

* Name should default appropriately
* Age should default to `0`

---

### Parameterized Constructor:

```java id="r7m4tk"
Person(String name, int age)
```

Rules:

* Set both values directly

---

### Overloaded Constructor:

```java id="c2x9wn"
Person(String name)
```

Rules:

* Set name
* Age defaults to `0`

---

### Example:

| Code                   | Result         |
| ---------------------- | -------------- |
| new Person()           | Default values |
| new Person("John")     | Name only      |
| new Person("John", 25) | Full object    |

---

# 🔹 Part 2: Encapsulation

# Question 2 - Getters & Setters

---

### Detailed Objective:

Protect `Person` data properly.

---

### Rules:

* Age cannot be negative
* If negative → set age to `0`

---

### Methods:

```java id="m8q5pv"
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

### Developer Importance:

This prevents invalid object states.

---

# 🔹 Part 3: Inheritance

# Question 3 - Student Class

## Class:

```java id="d7x4km"
Student extends Person
```

---

### Detailed Objective:

Create a `Student` class that inherits from `Person`.

---

### New Field:

* `grade`

---

### Constructor:

```java id="b4v9qp"
Student(String name, int age, String grade)
```

---

### Rules:

* Use `super(name, age)`
* Set grade

---

### Why This Matters:

Teaches:

* Inheritance
* Constructor chaining
* Code reuse

---

# 🔹 Part 4: Method Overriding

# Question 4 - Override `toString()`

---

### Detailed Objective:

Customize object printing.

---

### Required Format:

```java id="k2m7zr"
Name: John, Age: 20, Grade: A
```

---

### Why:

Readable object output is essential for:

* Debugging
* Logging
* Professional development

---

# 🔹 Part 5: Abstraction

# Question 5 - Abstract Class `Animal`

## Class:

```java id="h5x8vn"
Animal
```

---

### Detailed Objective:

Create an abstract class that defines behavior but leaves implementation to child classes.

---

### Required Method:

```java id="y4q7pt"
makeSound()
```

---

### Rules:

* Must be abstract
* Returns `String`

---

### Why:

This teaches:

* Shared design
* Required implementation
* Software architecture

---

# 🔹 Part 6: Interfaces

# Question 6 - Interface `Playable`

---

### Detailed Objective:

Create an interface for playable objects.

---

### Required Method:

```java id="g8v3rm"
play()
```

---

### Why:

Interfaces enforce consistent behavior across unrelated classes.

---

# 🔹 Part 7: Polymorphism

# Question 7 - Demonstrate Polymorphism

---

### Detailed Objective:

Understand how parent references can store child objects.

---

### Example:

```java id="q6m9xt"
Animal[] animals
```

---

### Rules:

* Store multiple child types
* Call `makeSound()`
* Observe unique behavior

---

### Why:

Polymorphism is foundational for:

* Scalable systems
* Enterprise software
* Framework development

---

# 💡 Key Developer Tips

* Use `this` for fields
* Use `super` for parent constructors
* Keep fields private
* Validate data
* Override methods carefully
* Follow naming conventions
* Design for reuse
* Think like a software architect

---

# 🚀 End Goal

By completing this module, you should:

* Build Java classes confidently
* Understand professional OOP architecture
* Use constructors properly
* Apply inheritance and polymorphism
* Protect object integrity
* Write scalable maintainable code
* Strengthen real-world software engineering ability

---

# 🏆 Success Mindset

Object-Oriented Programming is one of the most important foundations in software engineering.

Mastering OOP prepares you for:

* Backend development
* Enterprise systems
* Android development
* Frameworks
* APIs
* Large-scale architecture

This module represents a major step from beginner programming into professional software development.
