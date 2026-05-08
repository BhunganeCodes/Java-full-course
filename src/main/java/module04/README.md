# 📘 Module 04: Methods (Functions)

---

## Learning Outcomes Assessed

* Method Design
* Parameters & Arguments
* Return Values
* Reusable Logic
* Problem Decomposition
* Function-Based Problem Solving

---

## Module Structure

This module contains:

### Coding Practice:

All questions must be completed inside:

```java id="t4g2mc"
MethodExercises.java
```

Your task is to:

* Read each function carefully
* Fully understand what problem each method is solving
* Break each problem into reusable logic
* Implement each method correctly
* Return exact expected values
* Handle edge cases properly
* Pass all tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Write clean reusable methods
* Use parameters correctly
* Return proper values
* Handle unusual or boundary inputs
* Follow exact expected outputs
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="aj6d8k"
mvn test
```

### Run module tests:

```bash id="q1n8ve"
mvn test -Dtest=MethodExercisesTest
```

---

# 🧠 Core Method Concepts

---

## What is a Method?

A method is a reusable block of code designed to perform one specific task whenever it is called.

Instead of rewriting the same logic repeatedly, developers create methods once and reuse them whenever needed.

```java id="5rua3s"
public static int add(int a, int b) {
    return a + b;
}
```

---

## Method Structure

```java id="y0e8zp"
returnType methodName(parameters)
```

### Example:

```java id="yo6w2j"
public static boolean isEven(int number)
```

---

## Return vs `void`

### `return`

Returns a value back to whoever called the method.

### `void`

Executes instructions without returning data.

---

## Why Methods Matter

Methods help developers:

* Reuse code efficiently
* Avoid duplication
* Improve readability
* Simplify debugging
* Build scalable software
* Organize programs into manageable pieces

---

# 🧪 Fundamentals Coding Practice

---

## Project Structure

```plaintext id="4rvxk9"
module04/
├── MethodExercises.java
├── tests/
│   └── MethodExercisesTest.java
└── README.md
```

---

# Question 1 - CheckEven

## Function:

```java id="ix4w9s"
exercise1_checkEven(int num)
```

### Detailed Objective:

Create a method that determines whether a given integer is evenly divisible by 2.

This function should evaluate the provided number and return a boolean value indicating whether the number is even.

A number is considered even if dividing it by 2 leaves no remainder.

---

### Rules:

* Return `true` if the number is even
* Return `false` if the number is odd

---

### Input:

* Integer `num`

---

### Output:

* Boolean value:

  * `true`
  * `false`

---

### Examples:

| Input | Output |
| ----- | ------ |
| 4     | true   |
| 7     | false  |
| 0     | true   |
| -8    | true   |

---

### Edge Cases:

* Zero is even
* Negative numbers may also be even
* Large numbers should still evaluate correctly

---

# Question 2 - GreetUser

## Function:

```java id="3ujf9h"
exercise2_greetUser(String name)
```

### Detailed Objective:

Create a method that accepts a user's name and returns a personalized greeting message.

The greeting must include the exact provided name inserted into the correct sentence structure.

This exercise focuses on working with method parameters and string construction.

---

### Rules:

* Return:

```java id="8g4w1l"
"Hello, name!"
```

* Replace `name` with the actual input

---

### Input:

* String `name`

---

### Output:

* Formatted greeting string

---

### Examples:

| Input   | Output          |
| ------- | --------------- |
| "John"  | "Hello, John!"  |
| "Sarah" | "Hello, Sarah!" |
| "Ben"   | "Hello, Ben!"   |

---

### Edge Cases:

* Empty strings
* Single-character names
* Proper punctuation must always be included

---

# Question 3 - CalculateSum

## Function:

```java id="9m2q7t"
exercise3_calculateSum(int a, int b)
```

### Detailed Objective:

Create a method that accepts two integers and returns their mathematical sum.

This exercise teaches how methods process multiple parameters and return calculated values.

The method should simply add both numbers together and return the result.

---

### Rules:

* Return `a + b`

---

### Input:

* Integer `a`
* Integer `b`

---

### Output:

* Integer sum

---

### Examples:

| Input  | Output |
| ------ | ------ |
| 5, 3   | 8      |
| -2, 4  | 2      |
| 0, 0   | 0      |
| -5, -5 | -10    |

---

### Edge Cases:

* Negative numbers
* Zero values
* Large positive values
* Large negative values

---

# Question 4 - FindMax

## Function:

```java id="p6e8tx"
exercise4_findMax(int a, int b)
```

### Detailed Objective:

Create a method that compares two integers and returns the larger value.

This exercise focuses on decision-making within reusable methods.

The method should determine which value is greater and return it.

If both values are equal, returning either is acceptable.

---

### Rules:

* Return the larger number
* If equal, return either number

---

### Input:

* Integer `a`
* Integer `b`

---

### Output:

* Integer maximum value

---

### Examples:

| Input  | Output |
| ------ | ------ |
| 5, 3   | 5      |
| 2, 8   | 8      |
| 7, 7   | 7      |
| -3, -1 | -1     |

---

### Edge Cases:

* Equal values
* Negative comparisons
* Zero comparisons

---

# Question 5 - IsPrime

## Function:

```java id="5xv0ae"
exercise5_isPrime(int num)
```

### Detailed Objective:

Create a method that determines whether a given number is prime.

A prime number is a number greater than 1 that can only be divided evenly by:

* 1
* Itself

This means prime numbers have exactly two divisors.

Your method must check whether the number meets this mathematical requirement.

This exercise introduces more advanced logical validation and may require loops for divisor checking.

---

### Rules:

* Return `true` if the number is prime
* Return `false` otherwise

---

### Prime Number Definition:

A prime number:

* Must be greater than 1
* Cannot have additional divisors

---

### Important Rules:

* `0` is NOT prime
* `1` is NOT prime
* Negative numbers are NOT prime

---

### Input:

* Integer `num`

---

### Output:

* Boolean value:

  * `true`
  * `false`

---

### Examples:

| Input | Output |
| ----- | ------ |
| 2     | true   |
| 7     | true   |
| 9     | false  |
| 1     | false  |
| -5    | false  |

---

### Edge Cases:

* 0
* 1
* Negative values
* Large prime numbers
* Large composite numbers

---

# 💡 Key Developer Tips

* Keep methods focused on one task
* Use descriptive logic
* Return precise outputs
* Reuse methods whenever possible
* Validate unusual inputs
* Prime checking usually requires loops
* Always test boundary cases

---

# 🚀 End Goal

By completing this module, you should:

* Understand how methods work deeply
* Build reusable programming logic
* Break large problems into smaller tasks
* Improve software structure
* Write cleaner code
* Prepare for object-oriented programming

---

# 🏆 Success Mindset

Methods are foundational to professional software development.

Every major application relies on reusable functions to remain scalable, readable, and maintainable.

Master methods thoroughly before progressing.
