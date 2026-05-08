# 📘 Module 01 — Practice Session: Java Basics & Data Types

> **How to use this guide:** Each exercise explains exactly what the method must do, gives a real-life analogy, shows sample inputs & expected outputs, and ends with tips. Write your answers inside `BasicConversionExercises.java`. No solutions are shown here — attempt each one before checking.

---

## 🎯 Learning Objectives

- Understand the four core Java data types: `int`, `double`, `boolean`, and `String`
- Translate simple Python logic into equivalent Java method bodies
- Get comfortable declaring correct return types and using basic operators
- Practise reading method signatures and understanding what each parameter represents

---

## 🧩 Exercise 1 — `exercise1_addNumbers(int a, int b)`

### 📖 What this method must do
This method takes two whole numbers and returns their sum. Think of it like a cashier at a shop adding the price of two items together to give you the total — the cashier needs both prices (the inputs) and hands back one final total (the output).

> 🌍 **Real-life example:** You bought a burger for R45 and a cooldrink for R20. The till adds both amounts and tells you: **R65**.

### ✍️ Method signature
```java
public static int exercise1_addNumbers(int a, int b) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)            | Expected Output |
|---------------------|-----------------|
| a = 3,   b = 7      | 10              |
| a = 0,   b = 0      | 0               |
| a = -5,  b = 10     | 5               |
| a = 100, b = 250    | 350             |

### 💡 Tips
- Just add the two parameters together using the `+` operator.
- Java handles negative numbers automatically — no special case needed.

---

## 🧩 Exercise 2 — `exercise2_isEven(int number)`

### 📖 What this method must do
This method checks whether a given whole number is even (divisible by 2 with no remainder) and returns `true` if it is, or `false` if it is not. Imagine a traffic system that only lets cars with even-numbered plates through on certain days — it checks each plate and decides yes or no.

> 🌍 **Real-life example:** A school timetable alternates: even-numbered weeks get extra sport, odd-numbered weeks get extra art. The system checks the week number and decides which schedule to show.

### ✍️ Method signature
```java
public static boolean exercise2_isEven(int number) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)    | Expected Output |
|-------------|-----------------|
| number = 4  | true            |
| number = 7  | false           |
| number = 0  | true            |
| number = -6 | true            |
| number = -3 | false           |

### 💡 Tips
- Use the modulo operator `%` to find the remainder after dividing by 2.
- If `number % 2 == 0` the number is even.
- Zero is considered even.

---

## 🧩 Exercise 3 — `exercise3_greet(String name)`

### 📖 What this method must do
This method takes a person's name as text and returns a personalised greeting message. Think of it like a hotel receptionist who greets you by name when you arrive — they use your name (the input) to produce a warm welcome (the output).

> 🌍 **Real-life example:** A banking app displays a personalised message when you log in: *"Hello, Sipho"* — it takes your account name and slots it into a greeting template.

### ✍️ Method signature
```java
public static String exercise3_greet(String name) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)        | Expected Output  |
|-----------------|------------------|
| name = "Alice"  | "Hello, Alice"   |
| name = "Bob"    | "Hello, Bob"     |
| name = "Lerato" | "Hello, Lerato"  |
| name = ""       | "Hello, "        |

### 💡 Tips
- Use the `+` operator to join (concatenate) Strings in Java.
- The exact format must be: `"Hello, " + name`
- This is similar to Python f-strings but uses `+` instead.

---

## 🧩 Exercise 4 — `exercise4_calculateArea(double radius)`

### 📖 What this method must do
This method takes the radius of a circle as a decimal number and returns the area of that circle using the formula: **area = π × radius²**. Think of it like a landscaper who needs to know the area of a circular flower bed before buying grass seeds — they measure the radius and calculate how much space needs to be covered.

> 🌍 **Real-life example:** A pizza restaurant calculates the area of their circular pizzas to figure out cost of ingredients per cm². They pass in the radius (e.g. 15 cm) and get back the surface area.

### ✍️ Method signature
```java
public static double exercise4_calculateArea(double radius) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)      | Expected Output |
|---------------|-----------------|
| radius = 1.0  | 3.14159         |
| radius = 5.0  | 78.53975        |
| radius = 0.0  | 0.0             |
| radius = 2.5  | ~19.6349        |

### 💡 Tips
- Use the value `3.14159` for pi (as given in the Python version).
- To square a number: `radius * radius` (or `Math.pow(radius, 2)`).
- Your return type is `double` — Java will keep the decimal places.

---

## 🧩 Exercise 5 — `exercise5_maxOfTwo(int a, int b)`

### 📖 What this method must do
This method compares two whole numbers and returns whichever is larger. If both are equal, returning either is acceptable. Think of it like a referee in a competition who looks at two athletes' scores and announces the highest one — the referee needs both scores (inputs) and announces one winner (output).

> 🌍 **Real-life example:** A job application system compares two candidates' test scores and advances the one with the higher score to the next round.

### ✍️ Method signature
```java
public static int exercise5_maxOfTwo(int a, int b) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)         | Expected Output |
|------------------|-----------------|
| a = 10,  b = 20  | 20              |
| a = 55,  b = 30  | 55              |
| a = 7,   b = 7   | 7               |
| a = -3,  b = -10 | -3              |

### 💡 Tips
- Use an `if/else` statement to compare `a` and `b`.
- You can also use the ternary operator: `return a > b ? a : b;`
- Java has `Math.max(a, b)` too — but try the `if` statement first to practise.

---

## 🧩 Exercise 6 — `exercise6_isPositive(int number)`

### 📖 What this method must do
This method checks whether a given whole number is greater than zero and returns `true` if it is, or `false` otherwise. Think of it like a bank account alert system — if your balance is above zero you get a green light; if it is zero or below, you get a warning.

> 🌍 **Real-life example:** A stock trading app checks if a share's daily change is positive. If it is, the price shows in green. If zero or negative, it shows in orange or red.

### ✍️ Method signature
```java
public static boolean exercise6_isPositive(int number) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)     | Expected Output |
|--------------|-----------------|
| number = 5   | true            |
| number = -1  | false           |
| number = 0   | false           |
| number = 100 | true            |

### 💡 Tips
- Zero is **not** positive — your condition must be strictly greater than 0.
- A simple one-liner works: `return number > 0;`

---

## 🧩 Exercise 7 — `exercise7_getFirstChar(String text)`

### 📖 What this method must do
This method takes a piece of text and returns the very first character as a `String`. If the text is empty (has no characters at all), it returns an empty String instead. Think of it like an index system in a library — the librarian reads only the first letter of a book's title to decide which shelf it goes on. If there is no title, there is nothing to file.

> 🌍 **Real-life example:** A contact list app groups names alphabetically. It reads the first letter of each contact's name to place it under the right letter heading — e.g. "S" for "Sipho".

### ✍️ Method signature
```java
public static String exercise7_getFirstChar(String text) {
    // TODO: write your code here
}
```

### 🔢 Sample inputs & expected outputs

| Input(s)       | Expected Output      |
|----------------|----------------------|
| text = "Hello" | "H"                  |
| text = "Java"  | "J"                  |
| text = ""      | ""  (empty String)   |
| text = "abc"   | "a"                  |

### 💡 Tips
- Use `text.length()` to check if the String is empty (length == 0).
- Use `text.substring(0, 1)` to extract the first character as a String.
- `text.charAt(0)` gives a `char`, not a `String` — use `substring()` to match the return type.
- Always check for an empty String **before** accessing a character or you will get a `StringIndexOutOfBoundsException`.

---

## 🚀 Running your tests

```bash
mvn test
```

Run this after completing each method. Fix failing tests one at a time — getting it wrong on the first try is completely normal. That is the whole point of practice!
