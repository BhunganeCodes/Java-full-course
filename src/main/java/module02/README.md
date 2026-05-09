# 📘 Module 02: Conditionals (`if / else`)

---

## 🎯 Learning Objectives

By the end of this module, you should be able to:

- Understand how decision-making works in Java
- Use `if`, `else if`, and `else`
- Apply logical comparisons correctly
- Handle boundary conditions properly
- Solve real-world problems using conditional logic
- Produce correctly formatted program output

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only

- **00:01:09 → 00:01:22** → Basic `if` statements
- **00:01:27 → 00:01:56** → `if`, `else if`, and `else`

👉 Watch a small section, pause, code the examples yourself, and test them before moving on.

---

# 📚 Learning Outcomes Assessed

- Conditional Logic
- Decision Making
- Comparison Operators
- Boolean Expressions
- Boundary Handling
- String Output Formatting
- Problem Decomposition

---

# 🛠 Module Structure

This module contains:

### Coding Practice

Complete all functions inside:

```java
ConditionExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Read each question carefully
- Determine the condition(s) required
- Use `if`, `else if`, and `else` appropriately
- Return the exact expected output
- Handle all boundary cases correctly
- Pass all unit tests successfully

---

# 🧠 Core Conditional Concepts

---

## 🔹 `if`

Executes code only when a condition is true.

```java
if (temperature > 35) {
    return "Heat warning!";
}
```

---

## 🔹 `if / else`

Chooses between two possibilities.

```java
if (age >= 18) {
    return "Adult";
} else {
    return "Minor";
}
```

---

## 🔹 `if / else if / else`

Used when there are multiple possible outcomes.

```java
if (score >= 80) {
    return "Distinction";
} else if (score >= 50) {
    return "Pass";
} else {
    return "Fail";
}
```

---

## 🔹 Comparison Operators

| Operator | Meaning |
|----------|---------|
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |
| `==` | Equal to |
| `!=` | Not equal to |

---

# 🧪 Exercises

---

# 🧩 Question 1 – Temperature Alert

## Function

```java
exercise1_temperatureAlert(int temperature)
```

### Objective

Determine whether the temperature is dangerously high.

### Rules

- If temperature is greater than `35`, return `"Heat warning!"`
- Otherwise, return `"Temperature normal"`

### Input

- `int temperature`

### Output

- `String`

### Examples

| Input | Output |
|------|------|
| `40` | `"Heat warning!"` |
| `35` | `"Temperature normal"` |
| `20` | `"Temperature normal"` |

### Edge Cases

- Exactly `35` is considered normal.

---

# 🧩 Question 2 – Age Verification

## Function

```java
exercise2_ageVerification(int age)
```

### Objective

Check whether a person is old enough to vote.

### Rules

- If age is `18` or older, return `"Eligible to vote"`
- Otherwise, return `"Not eligible"`

### Input

- `int age`

### Output

- `String`

### Examples

| Input | Output |
|------|------|
| `20` | `"Eligible to vote"` |
| `18` | `"Eligible to vote"` |
| `17` | `"Not eligible"` |

### Edge Cases

- Exactly `18` is eligible.

---

# 🧩 Question 3 – Even or Odd

## Function

```java
exercise3_evenOrOdd(int number)
```

### Objective

Determine whether a number is even or odd.

### Rules

- If the number is divisible by `2`, return `"Even"`
- Otherwise, return `"Odd"`

### Input

- `int number`

### Output

- `String`

### Examples

| Input | Output |
|------|------|
| `8` | `"Even"` |
| `7` | `"Odd"` |
| `0` | `"Even"` |

### Edge Cases

- `0` is even.
- Negative numbers work the same way.

---

# 🧩 Question 4 – Discount Calculator

## Function

```java
exercise4_discountCalculator(double price)
```

### Objective

Determine whether a customer qualifies for a discount.

### Rules

- If price is greater than or equal to `100`, return `"Discount applied"`
- Otherwise, return `"No discount"`

### Input

- `double price`

### Output

- `String`

### Examples

| Input | Output |
|------|------|
| `150.0` | `"Discount applied"` |
| `100.0` | `"Discount applied"` |
| `99.99` | `"No discount"` |

### Edge Cases

- Exactly `100` qualifies for the discount.

---

# 🧩 Question 5 – Weather Advisor

## Function

```java
exercise5_weatherAdvisor(int temperature)
```

### Objective

Recommend what to wear based on the temperature.

### Rules

- If temperature is less than `15`, return `"Wear a jacket"`
- Otherwise, return `"T-shirt weather"`

### Input

- `int temperature`

### Output

- `String`

### Examples

| Input | Output |
|------|------|
| `10` | `"Wear a jacket"` |
| `14` | `"Wear a jacket"` |
| `15` | `"T-shirt weather"` |
| `25` | `"T-shirt weather"` |

### Edge Cases

- Exactly `15` is warm enough for a T-shirt.

---

# 🧩 Question 6 – Age Group

## Function

```java
exercise6_ageGroup(int age)
```

### Objective

Classify a person into an age category.

### Rules

- If age is less than `13`, return `"Child"`
- Else if age is less than `20`, return `"Teenager"`
- Otherwise, return `"Adult"`

### Input

- `int age`

### Output

- `String`

### Examples

| Input | Output |
|------|------|
| `8` | `"Child"` |
| `13` | `"Teenager"` |
| `17` | `"Teenager"` |
| `20` | `"Adult"` |
| `45` | `"Adult"` |

### Edge Cases

- `12` → `"Child"`
- `13` → `"Teenager"`
- `19` → `"Teenager"`
- `20` → `"Adult"`

---

# 🧪 How to Run Your Tests

### Run all tests

```bash
mvn test
```

### Run only this module’s tests

```bash
mvn test -Dtest=ConditionExercisesTest
```

---

# 💡 Key Developer Tips

- Start by identifying the condition to test.
- Use `>=` and `<=` carefully.
- Check boundary values like `18`, `35`, `100`, and `20`.
- Return the exact strings shown in the examples.
- String comparisons in tests are case-sensitive.
- Use `else if` when there are more than two outcomes.

---

# 🚀 End Goal

By completing this module, you should be able to:

- Write simple decision-making programs
- Choose between multiple outcomes
- Handle boundary conditions correctly
- Return properly formatted results
- Build the foundation for more advanced logic

---

# 🏆 Success Mindset

Conditional statements are fundamental to all software:

- Login systems
- Banking applications
- Game rules
- Input validation
- Business logic
- AI decision systems

Master conditionals thoroughly — they are the building blocks of intelligent programs.
