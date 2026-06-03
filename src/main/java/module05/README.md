# 📘 Module 05: Strings & Text Processing

---

## 🎯 Learning Objectives

In this module, you will:

- Work with Java `String` methods effectively
- Use `substring`, `length`, indexing, and validation methods
- Validate and format text accurately
- Solve real-world string manipulation problems
- Prevent common index and formatting errors
- Build confidence handling user input and text processing

---

## 🎥 Video Learning Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only:

- **02:10:20 → 02:27:00**
- **02:35:19 → 02:41:10**

👉 Watch in parts and practice immediately after each concept.

---

# 📚 Learning Outcomes Assessed

- String Manipulation
- Text Validation
- Input Formatting
- Substring Operations
- Pattern Recognition
- Real-World Data Processing
- Defensive Programming
- Java String API Usage

---

# 🛠 Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
StringExercises.java
```

---

# ✅ What You Must Do

For this module, you must:

- Understand how each string problem works
- Use Java `String` methods correctly
- Handle formatting precisely
- Prevent index errors
- Validate inputs carefully
- Handle all edge cases
- Return exact expected outputs
- Pass all unit tests successfully

---

# 🧪 How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run only this module’s tests:

```bash
mvn test -Dtest=StringExercisesTest
```

---

# 🧠 Core String Concepts

---

## 🔹 What is a String?

A `String` is a sequence of characters representing text.

```java
String text = "Hello";
```

---

## 🔹 Common String Methods

### `length()`

Returns total character count.

```java
text.length();
```

---

### `substring(start, end)`

Extracts part of a string.

```java
text.substring(0, 2);
```

---

### `contains()`

Checks if specific text exists.

```java
text.contains("@");
```

---

### `startsWith()`

Checks beginning of string.

---

### `endsWith()`

Checks ending of string.

---

### `equals()`

Checks exact equality.

---

## 🔹 Important Reminder

Strings are immutable:

- Original strings are unchanged
- New strings are created after modifications

---

# 🧪 Exercises

---

# 🧩 Question 1 - Extract Middle Name

## Function:

```java
exercise1_extractMiddleName(String fullName)
```

---

### Objective:

Return only the middle name(s) from a full name.

---

### Rules:

- Exclude first and last names
- Return middle portion only
- If no middle name exists, return:

```java
""
```

---

### Input:

- `String fullName`

---

### Output:

- `String`

---

### Examples:

| Input | Output |
|------|--------|
| `"John Michael Doe"` | `"Michael"` |
| `"Sarah Jane Ann Smith"` | `"Jane Ann"` |
| `"John Doe"` | `""` |

---

### Edge Cases:

- Only first and last names
- Multiple middle names
- Extra spaces

---

# 🧩 Question 2 - Validate ID Prefix

## Function:

```java
exercise2_validateIDPrefix(String id)
```

---

### Objective:

Validate national ID format.

---

### Rules:

- Must start with `"ZA"`
- Must be followed by exactly 4 digits

---

### Valid Example:

```java
ZA1234
```

---

### Return:

- `true` if valid
- `false` otherwise

---

### Examples:

| Input | Output |
|------|--------|
| `"ZA1234"` | `true` |
| `"ZA9999"` | `true` |
| `"US1234"` | `false` |
| `"ZA12"` | `false` |

---

### Edge Cases:

- Wrong prefix
- Too many digits
- Too few digits
- Non-digit characters

---

# 🧩 Question 3 - Remove Protocol

## Function:

```java
exercise3_removeProtocol(String url)
```

---

### Objective:

Remove `http://` or `https://` from URLs.

---

### Rules:

- Remove protocol if present
- Return unchanged string if absent

---

### Examples:

| Input | Output |
|------|--------|
| `"https://google.com"` | `"google.com"` |
| `"http://example.org"` | `"example.org"` |
| `"openai.com"` | `"openai.com"` |

---

### Edge Cases:

- Missing protocol
- Empty string
- Mixed domains

---

# 🧩 Question 4 - Palindrome Checker

## Function:

```java
exercise4_isPalindrome(String s)
```

---

### Objective:

Determine whether text reads the same forward and backward.

---

### Rules:

- Return `true` if palindrome
- Return `false` otherwise

---

### Examples:

| Input | Output |
|------|--------|
| `"racecar"` | `true` |
| `"level"` | `true` |
| `"hello"` | `false` |

---

### Edge Cases:

- Empty string
- Single character
- Case sensitivity depending on tests

---

# 🧩 Question 5 - Format Phone Number

## Function:

```java
exercise5_formatPhoneNumber(String phone)
```

---

### Objective:

Validate and format a 10-digit phone number.

---

### Required Format:

```java
(XXX) XXX-XXXX
```

---

### Rules:

- Must contain exactly 10 digits
- If invalid, return:

```java
"Invalid phone number"
```

---

### Examples:

| Input | Output |
|------|--------|
| `"1234567890"` | `"(123) 456-7890"` |
| `"5551234567"` | `"(555) 123-4567"` |
| `"12345"` | `"Invalid phone number"` |

---

### Edge Cases:

- Too short
- Too long
- Letters
- Symbols

---

# 🧩 Question 6 - Validate Email

## Function:

```java
exercise6_validateEmail(String email)
```

---

### Objective:

Validate simplified email format.

---

### Rules:

- Exactly one `@`
- Must end with:
  - `.com`
  - `.org`

---

### Return:

- `true` if valid
- `false` otherwise

---

### Examples:

| Input | Output |
|------|--------|
| `"user@example.com"` | `true` |
| `"admin@site.org"` | `true` |
| `"bademail.com"` | `false` |
| `"user@@site.com"` | `false` |

---

### Edge Cases:

- Multiple `@`
- Missing domain
- Invalid suffix
- Empty string

---

# 🧩 Question 7 - Capitalize First Letter

## Function:

```java
exercise7_capitalizeFirstLetter(String s)
```

---

### Objective:

Capitalize only the first character.

---

### Rules:

- First character uppercase
- Remaining characters unchanged
- Empty string returns empty string

---

### Examples:

| Input | Output |
|------|--------|
| `"hello"` | `"Hello"` |
| `"java"` | `"Java"` |
| `""` | `""` |

---

### Edge Cases:

- Empty string
- Already capitalized
- Single character

---

# 🧩 Question 8 - Extract Domain

## Function:

```java
exercise8_extractDomain(String url)
```

---

### Objective:

Extract only the domain name from a URL.

---

### Rules:

- Remove protocol if present
- Return domain only
- Ignore path after domain

---

### Examples:

| Input | Output |
|------|--------|
| `"https://google.com/page"` | `"google.com"` |
| `"http://openai.org/about"` | `"openai.org"` |
| `"example.com/home"` | `"example.com"` |

---

### Edge Cases:

- Missing protocol
- Paths
- Empty string

---

# 💡 Key Developer Tips

- Always check string length before using `substring`
- Prevent index out-of-bounds errors
- Validate input before processing
- Use:
  - `startsWith()`
  - `endsWith()`
  - `contains()`
  - `equals()`
- Remember strings are immutable
- Test malformed inputs thoroughly
- Build defensive coding habits

---

# 🚀 End Goal

By completing this module, you should:

- Manipulate strings confidently
- Validate user input effectively
- Format text professionally
- Solve real-world text problems
- Improve debugging precision
- Strengthen backend and API development readiness

---

# 🏆 Success Mindset

String processing powers:

- User authentication
- APIs
- Web applications
- Form validation
- Search engines
- Data cleaning systems

Master string manipulation thoroughly — text processing is one of the most practical programming skills.
