# 📘 Module 02: Conditionals (`if / else`)

---

## Learning Outcomes Assessed

* Conditional Logic
* Decision Making in Programs
* Comparison Operators
* Boolean Expressions
* Boundary Handling
* String Output Formatting
* Basic Problem Decomposition

---

## Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
ConditionExercises.java
```

Your task is to:

* Read each function specification carefully
* Apply correct conditional logic
* Handle all edge cases
* Return exact expected outputs
* Pass all unit tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Apply `if`, `else if`, and `else` correctly
* Use comparison operators appropriately
* Ensure boundary conditions are handled correctly
* Return outputs in the exact required format
* Avoid extra spaces or incorrect wording
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run module tests:

```bash
mvn test -Dtest=ConditionExercisesTest
```

---

# 🧠 Core Conditional Concepts

---

## `if` Statement

Used when a block of code should only execute if a condition is true.

```java
if (condition) {
    // executes when condition is true
}
```

---

## `if / else`

Used when there are exactly two possible outcomes.

```java
if (condition) {
    // true case
} else {
    // false case
}
```

---

## `if / else if / else`

Used when multiple conditions must be evaluated in order.

```java
if (condition1) {
    // first case
} else if (condition2) {
    // second case
} else {
    // fallback case
}
```

---

## Comparison Operators

| Operator | Meaning               |
| -------- | --------------------- |
| `>`      | greater than          |
| `<`      | less than             |
| `>=`     | greater than or equal |
| `<=`     | less than or equal    |
| `==`     | equal                 |
| `!=`     | not equal             |

---

# 🧪 Exercises

---

# Question 1 - Temperature Alert

## Function:

```java
exercise1_temperatureAlert(int temperature)
```

### Description:

Determine whether a temperature value is considered hot based on a fixed threshold.

### Rules:

* If temperature is greater than 30 → return `"It's hot!"`
* Otherwise → return `"It's not hot."`

### Constraints:

* Boundary value 30 is NOT considered hot
* Output must match exactly

---

# Question 2 - Age Verification

## Function:

```java
exercise2_ageVerification(int age)
```

### Description:

Determine whether a user meets the minimum age requirement.

### Rules:

* If age is 18 or above → return `"Access granted"`
* Otherwise → return `"Access denied"`

### Constraints:

* Age 18 is valid
* Negative values must be denied

---

# Question 3 - Even or Odd

## Function:

```java
exercise3_evenOrOdd(int number)
```

### Description:

Determine whether a number is even or odd.

### Rules:

* If number is divisible by 2 → `"X is even"`
* Otherwise → `"X is odd"`

Where `X` is the input number.

---

### Constraints:

* Zero is considered even
* Negative numbers are valid inputs

---

# Question 4 - Discount Calculator

## Function:

```java
exercise4_discountCalculator(double price)
```

### Description:

Apply a discount based on purchase amount and calculate final price.

### Rules:

* price > 1000 → 20% discount
* 500 to 1000 → 10% discount
* less than 500 → 0% discount

### Output Format:

```
Discount: X%, Final price: RXXXX.XX
```

---

### Constraints:

* 500 and 1000 are included in the 10% category
* Final price must be formatted to 2 decimal places

---

# Question 5 - Weather Advisor

## Function:

```java
exercise5_weatherAdvisor(int temperature)
```

### Description:

Classify weather conditions based on temperature ranges.

### Rules:

* temperature > 30 → `"It's hot!"`
* 15 to 30 → `"It's mild."`
* below 15 → `"It's cold."`

---

### Constraints:

* 15 and 30 are included in mild range

---

# Question 6 - Age Group

## Function:

```java
exercise6_ageGroup(int age)
```

### Description:

Categorize a person into an age group.

### Rules:

* age < 13 → `"Child"`
* 13 to 19 → `"Teen"`
* 20 and above → `"Adult"`

---

### Constraints:

* 13 and 19 are included in Teen category
* 20 starts Adult category

---

# 💡 Key Developer Tips

* Always check boundary conditions carefully
* Use correct comparison operators
* Match output strings exactly
* Avoid extra spaces or formatting errors
* Test edge cases explicitly
* Follow condition order carefully

---

# 🚀 End Goal

By completing this module, you should:

* Write correct conditional logic
* Handle multiple decision paths
* Understand boundary-sensitive logic
* Produce accurate program outputs
* Build strong foundational programming discipline
