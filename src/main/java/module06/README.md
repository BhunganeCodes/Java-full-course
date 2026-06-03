# 📘 Module 06: Advanced Loops & Method Overloading

---

## 🎯 Learning Objectives

In this module, you will:

- Understand method overloading
- Use `break` and `continue` effectively
- Work confidently with arrays inside loops
- Build cleaner and more flexible reusable methods
- Strengthen loop precision and control-flow logic
- Improve software design through flexible function structures

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only:

- **04:19:51 → 04:30:57**
- **05:03:26 → 05:28:07**

👉 Watch in parts and practice after each section.

---

# 📚 Learning Outcomes Assessed

- Method Overloading
- Advanced Loop Control
- `break` & `continue`
- Array Traversal
- Flexible Function Design
- Iterative Problem Solving
- Output Formatting
- Java Syntax Precision

---

# 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
AdvancedLoopExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Understand overloaded methods clearly
- Apply correct loop structures
- Use `break` and `continue` strategically
- Process arrays safely
- Handle formatting carefully
- Reuse logic where possible
- Handle edge cases
- Pass all unit tests successfully

---

# 🧪 How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run only this module’s tests:

```bash
mvn test -Dtest=AdvancedLoopExercisesTest
```

---

# 🧠 Core Advanced Concepts

---

## 🔹 What is Method Overloading?

Method overloading allows multiple methods to share the same name while using different parameter lists.

### Example:

```java
printNumbers(int n)
printNumbers(int start, int end)
printNumbers(int n, String prefix)
```

---

## 🔹 Why Overloading Matters

Method overloading helps developers:

- Reuse logical naming
- Improve readability
- Handle multiple scenarios
- Build cleaner APIs
- Reduce unnecessary method duplication

---

# 🔁 Loop Control Tools

---

## 🔹 `break`

Stops loop execution immediately.

---

## 🔹 `continue`

Skips the current iteration and moves to the next.

---

## 🔹 Enhanced For Loop

Useful for arrays:

```java
for (int num : arr) {
    // process elements
}
```

---

# 🧪 Exercises

---

# 🧩 Question 1 - printNumbers(int n)

## Function:

```java
exercise1_printNumbers(int n)
```

---

### Objective:

Print numbers from `1` to `n`, skipping multiples of `3`.

---

### Rules:

- Use loop
- Skip numbers divisible by `3`
- Use `continue`
- Return comma-separated string

---

### Examples:

| Input | Output |
|------|--------|
| `7` | `"1, 2, 4, 5, 7"` |
| `3` | `"1, 2"` |
| `10` | `"1, 2, 4, 5, 7, 8, 10"` |

---

### Edge Cases:

- `n < 3`
- Exact multiples
- Proper formatting

---

# 🧩 Question 2 - printNumbers(int start, int end)

## Function:

```java
exercise2_printNumbers(int start, int end)
```

---

### Objective:

Print numbers from `start` to `end`, stopping at first multiple of `5`.

---

### Rules:

- Include first multiple of `5`
- Stop immediately after
- Use `break`

---

### Examples:

| Input | Output |
|------|--------|
| `1, 10` | `"1, 2, 3, 4, 5"` |
| `6, 12` | `"6, 7, 8, 9, 10"` |
| `11, 14` | `"11, 12, 13, 14"` |

---

### Edge Cases:

- First number multiple of `5`
- No multiples
- Invalid ranges depending on tests

---

# 🧩 Question 3 - printNumbers(int n, String prefix)

## Function:

```java
exercise3_printNumbers(int n, String prefix)
```

---

### Objective:

Print odd numbers from `1` to `n` with prefix.

---

### Rules:

- Skip even numbers
- Prefix each valid number
- Return comma-separated string

---

### Examples:

| Input | Output |
|------|--------|
| `5, "#"` | `"#1, #3, #5"` |
| `6, "Num-"` | `"Num-1, Num-3, Num-5"` |

---

### Edge Cases:

- Empty prefix
- `n < 1`
- Formatting

---

# 🧩 Question 4 - printArray(int[] arr)

## Function:

```java
exercise4_printArray(int[] arr)
```

---

### Objective:

Print all non-negative numbers in array.

---

### Rules:

- Skip negatives
- Include zero
- Return comma-separated string

---

### Examples:

| Input | Output |
|------|--------|
| `[1, -2, 3, 4]` | `"1, 3, 4"` |
| `[-1, -5, 2]` | `"2"` |
| `[0, 5]` | `"0, 5"` |

---

### Edge Cases:

- Empty array
- All negatives
- Zero values

---

# 🧩 Question 5 - printArray(int[] arr, int threshold)

## Function:

```java
exercise5_printArray(int[] arr, int threshold)
```

---

### Objective:

Print values below threshold until threshold reached.

---

### Rules:

- Stop at first value `>= threshold`
- Do not include stopping value
- Use `break`

---

### Examples:

| Input | Output |
|------|--------|
| `[1, 2, 3, 7, 4], threshold = 5` | `"1, 2, 3"` |
| `[2, 4, 6], threshold = 6` | `"2, 4"` |
| `[10, 1], threshold = 5` | `""` |

---

### Edge Cases:

- Immediate threshold
- No threshold hit
- Empty array

---

# 🧩 Question 6 - printArray(String[] arr, String prefix)

## Function:

```java
exercise6_printArray(String[] arr, String prefix)
```

---

### Objective:

Print strings while skipping entries starting with `"ignore"`.

---

### Rules:

- Skip strings beginning with `"ignore"`
- Add prefix to valid strings
- Return formatted string

---

### Examples:

| Input | Output |
|------|--------|
| `["apple", "ignoreBanana", "carrot"], "*"` | `"*apple, *carrot"` |
| `["ignoreThis", "hello"], "#"` | `"#hello"` |

---

### Edge Cases:

- All ignored
- Empty arrays
- Empty prefix
- Mixed capitalization depending on tests

---

# 💡 Key Developer Tips

- Understand overload signatures clearly
- Use `continue` for skipping
- Use `break` for stopping
- Be careful with comma placement
- Validate array boundaries
- Reuse logic strategically
- Test each overloaded version independently
- Practice formatting precision

---

# 🚀 End Goal

By completing this module, you should:

- Understand method overloading deeply
- Control loops with precision
- Process arrays confidently
- Build flexible reusable functions
- Improve software architecture habits
- Strengthen real-world programming skills

---

# 🏆 Success Mindset

Advanced loops and method overloading are used heavily in:

- Backend systems
- APIs
- Automation tools
- Data pipelines
- Enterprise software
- Large-scale applications

Mastering these concepts greatly improves your versatility as a developer.
