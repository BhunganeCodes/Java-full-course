# 📘 Module 01: Java Basics & Data Types
---
## 🎯 Learning Objectives
In this module, you will:
* Understand basic Java data types
* Learn how Java differs from Python
* Practice converting Python code into Java
* Get comfortable reading and writing method signatures
---
## 🎥 Videos
### 1. Java Introduction
https://youtu.be/7ui0IusGTEI
### 2. Data Types in Java
https://youtu.be/WQ7mvQFSmYc?si=bn6YM5_SEtaGKXHb
**Focus on these data types:**
* `int` → integers
* `double` → decimal numbers (like Python `float`)
* `boolean` → true/false
* `String` → text
* `char` → single character
---
## 🧠 Key Concepts (Quick Guide)
### 🔹 Java is strongly typed
Every variable must have a type:
```java
int age = 25;
double price = 19.99;
boolean isActive = true;
String name = "John";
char grade = 'A';
```
---
### 🔹 Methods must declare return types
```java
public static int add(int a, int b) {
    return a + b;
}
```
---
### 🔹 No dynamic typing like Python
**Python:**
```python
x = 10
x = "hello"
```
**Java:**
```java
// ❌ Not allowed
```
---
## 🧪 Exercises: Python → Java Conversion
Below are Python functions.
👉 Your task: Convert each into Java inside `BasicConversionExercises.java`
---
### 🧩 Exercise 1
```python
def add_numbers(a: int, b: int) -> int:
    return a + b
```
---
### 🧩 Exercise 2
```python
def is_even(number: int) -> bool:
    return number % 2 == 0
```
---
### 🧩 Exercise 3
```python
def greet(name: str) -> str:
    return f"Hello, {name}"
```
---
### 🧩 Exercise 4
```python
def calculate_area(radius: float) -> float:
    pi: float = 3.14159
    return pi * radius * radius
```
---
### 🧩 Exercise 5
```python
def max_of_two(a: int, b: int) -> int:
    return a if a > b else b
```
---
### 🧩 Exercise 6
```python
def is_positive(number: int) -> bool:
    return number > 0
```
---
### 🧩 Exercise 7
```python
def get_first_char(text: str) -> str:
    return text[0] if len(text) > 0 else ""
```
---
## ✅ What You Must Do
1. Open:
   ```
   BasicConversionExercises.java
   ```
2. Implement all methods:
   * `exercise1_addNumbers`
   * `exercise2_isEven`
   * `exercise3_greet`
   * etc.
3. Run tests:
   ```bash
   mvn test
   ```
---
## 💡 Tips
* Java uses `String`, not `str`
* Use `.length()` instead of `len()`
* Use `Math` when needed
* Be careful with return types
---
## 🚀 Goal
By the end of this module, you should:
* Understand Java syntax basics
* Be able to convert simple Python logic into Java
