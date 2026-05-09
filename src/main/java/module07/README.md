# 📘 Module 07: Arrays + Strings (Combined Logic)

---

## 🎯 Learning Objectives

In this module, you will:

- Combine arrays and strings into unified solutions
- Process structured data step-by-step using loops
- Handle edge cases carefully
- Strengthen logical problem-solving
- Build confidence solving layered programming tasks
- Think more like a software engineer than an isolated coder

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch This Section:

- **05:03:26 → 05:28:07** (Review if needed)

👉 Focus on applying logic, not passive watching.

---

# 📚 Learning Outcomes Assessed

- Array Processing
- String Manipulation
- Combined Data Logic
- Iterative Problem Solving
- Pattern Recognition
- Real-World Text Analysis
- Boundary Safety
- Algorithmic Thinking

---

# 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
ArrayStringExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Understand how arrays and strings interact
- Use loops safely
- Handle indexing and substring boundaries correctly
- Solve multi-step logic problems
- Return exact expected outputs
- Handle unusual inputs carefully
- Pass all unit tests successfully

---

# 🧪 How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run only this module’s tests:

```bash
mvn test -Dtest=ArrayStringExercisesTest
```

---

# 🧠 Core Combined Concepts

---

## 🔹 Why Combine Arrays + Strings?

Real-world software often requires:

- Splitting text
- Processing collections of words
- Searching patterns
- Counting frequencies
- Parsing structured input
- Multi-stage logic

---

## 🔹 String Iteration

```java
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
}
```

---

## 🔹 Array Traversal

```java
for (String word : arr) {
    // process each word
}
```

---

## 🔹 Combined Logic

Programming often requires:

- Loop + condition
- String manipulation
- Array processing
- Boundary validation
- `break` / `continue`

---

## 🔹 Important Reminder

- Check boundaries carefully
- Avoid index errors
- Validate substring ranges
- Normalize case when needed
- Think step-by-step

---

# 🧪 Exercises

---

# 🧩 Question 1 - splitString

## Function:

```java
exercise1_splitString(String s, int length)
```

---

### Objective:

Split a string into chunks of specified length.

---

### Rules:

- Split into sections of `length`
- Preserve all characters
- Include smaller final chunk if needed
- Return as `String[]`

---

### Examples:

| Input | Output |
|------|--------|
| `"hello world", 3` | `["hel", "lo ", "wor", "ld"]` |
| `"abcdefg", 2` | `["ab", "cd", "ef", "g"]` |
| `"short", 10` | `["short"]` |

---

### Edge Cases:

- Length larger than string
- Exact division
- Empty strings
- Length of 1
- Boundary safety

---

# 🧩 Question 2 - findLongestWord

## Function:

```java
exercise2_findLongestWord(String[] arr)
```

---

### Objective:

Return the longest valid word from an array.

---

### Rules:

- Ignore empty strings
- Return longest word
- If tie → return first longest

---

### Examples:

| Input | Output |
|------|--------|
| `["cat", "elephant", "dog"]` | `"elephant"` |
| `["", "hello", "world"]` | `"hello"` |
| `["one", "two", "six"]` | `"one"` |

---

### Edge Cases:

- Empty strings
- Equal lengths
- Single item arrays
- Multiple ties

---

# 🧩 Question 3 - countVowels

## Function:

```java
exercise3_countVowels(String s)
```

---

### Objective:

Count vowel frequency in text.

---

### Vowels:

- `a`
- `e`
- `i`
- `o`
- `u`

---

### Return Format:

```java
[aCount, eCount, iCount, oCount, uCount]
```

---

### Rules:

- Ignore non-letters
- Ignore consonants
- Count vowels only
- Normalize case if needed

---

### Examples:

| Input | Output |
|------|--------|
| `"hello world"` | `[0,1,0,2,0]` |
| `"aeiou"` | `[1,1,1,1,1]` |
| `"bcdfg"` | `[0,0,0,0,0]` |

---

### Edge Cases:

- Empty strings
- Uppercase vowels
- No vowels
- Only vowels
- Symbols/spaces

---

# 💡 Key Developer Tips

- Validate substring ranges carefully
- Prevent index-out-of-bounds errors
- Normalize case consistently
- Track counters clearly
- Use loops methodically
- Handle malformed inputs safely
- Break larger problems into smaller steps
- Debug step-by-step

---

# 🚀 End Goal

By completing this module, you should:

- Combine multiple programming concepts effectively
- Process text and structured data confidently
- Solve layered logic problems
- Improve practical coding ability
- Strengthen debugging precision
- Build real-world development readiness

---

# 🏆 Success Mindset

Professional software development rarely uses isolated concepts.

Real systems combine:

- Arrays
- Strings
- Loops
- Validation
- Pattern matching
- Multi-step logic

Mastering combined logic is a major leap toward becoming a stronger developer.
