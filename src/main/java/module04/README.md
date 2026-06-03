# 📘 Module 04: Methods (Functions)

---

## 🎯 Learning Objectives

In this module, you will:

- Understand how to define and use methods in Java
- Work with parameters and return values
- Break larger problems into smaller reusable pieces
- Write cleaner, more structured code
- Build reusable logic for scalable programs
- Strengthen problem-solving through function design

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch This Section Only:

- **00:04:04 → 00:04:19** → Methods / Functions

👉 Watch → Pause → Code → Test

---

# 📚 Learning Outcomes Assessed

- Method Design
- Parameters & Arguments
- Return Values
- Reusable Logic
- Problem Decomposition
- Function-Based Problem Solving
- Code Organization
- Java Syntax Accuracy

---

# 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
MethodExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Understand what each method is solving
- Use parameters correctly
- Return exact expected values
- Break problems into reusable logic
- Handle unusual or boundary inputs
- Follow proper Java syntax
- Pass all unit tests successfully

---

# 🧪 How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run only this module’s tests:

```bash
mvn test -Dtest=MethodExercisesTest
```

---

# 🧠 Core Method Concepts

---

## 🔹 What is a Method?

A method is a reusable block of code designed to perform one specific task.

Instead of repeating logic multiple times:

- Write once ✅
- Reuse anywhere ✅

### Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

---

## 🔹 Method Structure

```java
returnType methodName(parameters)
```

### Example:

```java
public static boolean isEven(int number)
```

---

## 🔹 Return vs `void`

### `return`

Returns a value back to the caller.

### `void`

Performs actions but returns nothing.

---

## 🔹 Why Methods Matter

Methods help developers:

- Reuse code
- Avoid duplication
- Improve readability
- Simplify debugging
- Build scalable applications
- Organize software effectively

---

# 🧪 Exercises

---

# 🧩 Question 1 - CheckEven

## Function:

```java
exercise1_checkEven(int num)
```

---

### Objective:

Determine whether a number is even.

---

### Rules:

- Return `true` if divisible by 2
- Otherwise return `false`

---

### Input:

- `int num`

---

### Output:

- `boolean`

---

### Examples:

| Input | Output |
|------|--------|
| `4` | `true` |
| `7` | `false` |
| `0` | `true` |
| `-8` | `true` |

---

### Edge Cases:

- Zero is even
- Negative values may be even
- Large values

---

# 🧩 Question 2 - GreetUser

## Function:

```java
exercise2_greetUser(String name)
```

---

### Objective:

Return a personalized greeting.

---

### Rules:

Return:

```java
"Hello, name!"
```

---

### Input:

- `String name`

---

### Output:

- `String`

---

### Examples:

| Input | Output |
|------|--------|
| `"John"` | `"Hello, John!"` |
| `"Sarah"` | `"Hello, Sarah!"` |
| `"Ben"` | `"Hello, Ben!"` |

---

### Edge Cases:

- Empty string
- Single-character names
- Proper punctuation required

---

# 🧩 Question 3 - CalculateSum

## Function:

```java
exercise3_calculateSum(int a, int b)
```

---

### Objective:

Return the sum of two integers.

---

### Rules:

- Return `a + b`

---

### Inputs:

- `int a`
- `int b`

---

### Output:

- `int`

---

### Examples:

| Input | Output |
|------|--------|
| `5, 3` | `8` |
| `-2, 4` | `2` |
| `0, 0` | `0` |
| `-5, -5` | `-10` |

---

### Edge Cases:

- Negative values
- Zero
- Large numbers

---

# 🧩 Question 4 - FindMax

## Function:

```java
exercise4_findMax(int a, int b)
```

---

### Objective:

Return the larger of two numbers.

---

### Rules:

- Return larger number
- If equal, return either

---

### Inputs:

- `int a`
- `int b`

---

### Output:

- `int`

---

### Examples:

| Input | Output |
|------|--------|
| `5, 3` | `5` |
| `2, 8` | `8` |
| `7, 7` | `7` |
| `-3, -1` | `-1` |

---

### Edge Cases:

- Equal values
- Negative comparisons
- Zero

---

# 🧩 Question 5 - IsPrime

## Function:

```java
exercise5_isPrime(int num)
```

---

### Objective:

Determine whether a number is prime.

---

### Prime Number Definition:

A prime number:

- Must be greater than `1`
- Divisible only by:
  - `1`
  - Itself

---

### Rules:

- Return `true` if prime
- Return `false` otherwise

---

### Important Notes:

- `0` is NOT prime
- `1` is NOT prime
- Negative numbers are NOT prime

---

### Input:

- `int num`

---

### Output:

- `boolean`

---

### Examples:

| Input | Output |
|------|--------|
| `2` | `true` |
| `7` | `true` |
| `9` | `false` |
| `1` | `false` |
| `-5` | `false` |

---

### Edge Cases:

- `0`
- `1`
- Negative values
- Large primes
- Large composites

---

# 💡 Key Developer Tips

- Keep methods focused on one task
- Use clear return logic
- Validate unusual inputs
- Reuse logic whenever possible
- Prime checking usually requires loops
- Always test boundary conditions
- Practice writing clean signatures
- Ensure exact output formatting

---

# 🚀 End Goal

By completing this module, you should:

- Understand how methods work deeply
- Build reusable programming logic
- Structure software more effectively
- Break larger problems into smaller components
- Write cleaner, maintainable Java code
- Prepare for advanced object-oriented programming

---

# 🏆 Success Mindset

Methods are one of the core foundations of software engineering.

They power:

- APIs
- Automation systems
- Backend architectures
- Game systems
- Data pipelines
- Enterprise applications

Master methods thoroughly — reusable logic is essential for professional development.
