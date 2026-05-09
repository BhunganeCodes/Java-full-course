# 📘 Module 12: Exception Handling & File I/O

---

## 🎯 Learning Objectives

In this module, you will:

- Understand how exceptions occur in Java programs  
- Learn how to prevent program crashes using `try-catch`  
- Work with safe input parsing  
- Read data from external files  
- Write data into files  
- Build robust, fault-tolerant applications  
- Handle real-world runtime errors gracefully  

---

## 🎥 Learning Resources

https://youtu.be/xTtL8E4LzTQ  
https://youtu.be/pJNUDXzmBCE?si=zGn9KfVBO9VDtM9I  

### ⏱ Watch These Sections:

- Exception Handling → 09:05:29 → 09:13:28  
- File Writing → 09:13:28 → 09:21:58  
- File Reading → 09:21:58 → 09:30:00  
- Collections/Review → 5 min video above  

---

## 📚 Learning Outcomes Assessed

- Exception Handling  
- Try-Catch Logic  
- Defensive Programming  
- Input Validation  
- File Writing  
- File Reading  
- Resource Management  
- Data Parsing  
- Robust System Design  

---

## 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all methods inside:

FileExercises.java

---

## ✅ What You Must Do

For this module, you must:

- Understand how runtime errors occur  
- Prevent program crashes using exception handling  
- Safely convert and validate input  
- Read and write files correctly  
- Handle missing or invalid data  
- Return exact expected outputs  
- Follow Java best practices  
- Pass all unit tests  

---

## 🧠 Core Concepts

---

### 🔹 What is an Exception?

An exception is an unexpected error that occurs during program execution.

It interrupts normal program flow.

Examples:

- Division by zero  
- Invalid number format  
- Missing file  
- Broken input data  

---

### 🔹 Why Exception Handling Matters

Without handling errors:

- Programs crash ❌  

With handling:

- Programs recover safely ✅  
- User experience remains stable  

---

### 🔹 try-catch Concept

Used to safely handle risky operations:

- try → code that may fail  
- catch → what happens if it fails  

---

### 🔹 File I/O (Input & Output)

Used to:

- Store data permanently  
- Read saved information  
- Process logs or reports  
- Handle external data sources  

---

## 🧪 Exercises

---

## 🧩 Question 1 — Safe Division

### Method:
safeDivide(int a, int b)

### Objective:

Create a method that safely performs division.

### Requirements:

- Return the result of a ÷ b  
- If division by zero occurs, return 0  
- Program must never crash  

### What is being tested:

- Arithmetic safety  
- Error prevention  
- Defensive programming  

---

## 🧩 Question 2 — Safe Integer Parsing

### Method:
parseInteger(String value)

### Objective:

Convert a string into an integer safely.

### Requirements:

- If input is valid → return converted value  
- If invalid → return -1  
- Must not crash on bad input  

### What is being tested:

- Input validation  
- Exception handling  
- Data parsing safety  

---

## 🧩 Question 3 — Write to File

### Method:
writeFile(String fileName, String content)

### Objective:

Write text data into a file.

### Requirements:

- Save provided content into file  
- Return true if successful  
- Return false if failure occurs  
- Must handle file errors safely  

### What is being tested:

- File writing  
- Exception handling  
- Resource management  

---

## 🧩 Question 4 — Read from File

### Method:
readFile(String fileName)

### Objective:

Read the full content of a file.

### Requirements:

- Return file content as a string  
- If error occurs → return empty string ""  
- Must handle all errors safely  

### What is being tested:

- File reading  
- Error handling  
- Resource safety  

---

## 🧩 Question 5 — Count Lines in File

### Method:
countLines(String fileName)

### Objective:

Count how many lines exist in a file.

### Requirements:

- Return number of lines  
- If file cannot be read → return 0  
- Must not crash under any condition  

### What is being tested:

- File processing  
- Iteration over data  
- Robust error handling  

---

## 💡 Key Developer Tips

- Always assume input can fail  
- Never trust external data  
- Use try-catch for risky operations  
- Close file resources properly  
- Handle null and invalid values  
- Prefer safe defaults over crashes  
- Think defensively like production systems  

---

## 🚀 Goal of This Module

By the end of this module, you should:

- Understand Java exceptions deeply  
- Write safe and stable programs  
- Work with files confidently  
- Prevent crashes in real-world scenarios  
- Build professional-grade Java applications  

---

## 🏆 Final Mindset

Good developers write code that works.

Great developers write code that **doesn’t break when things go wrong**.

This module builds production-level reliability thinking.
