# 📘 Module 05: Strings & Text Processing

---

## Learning Outcomes Assessed

* String Manipulation
* Text Validation
* Input Formatting
* Substring Operations
* Pattern Recognition
* Real-World Data Processing

---

## Module Structure

This module contains:

### Coding Practice:

All questions must be completed inside:

```java id="x9k3dp"
StringExercises.java
```

Your task is to:

* Read each function carefully
* Fully understand how text should be processed
* Use Java `String` methods effectively
* Handle formatting and validation rules precisely
* Prevent index and formatting errors
* Pass all tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Manipulate strings safely
* Validate text accurately
* Handle edge cases carefully
* Follow exact formatting requirements
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="e5pk1v"
mvn test
```

### Run module tests:

```bash id="u7lm2c"
mvn test -Dtest=StringExercisesTest
```

---

# 🧠 Core String Concepts

---

## What is a String?

A `String` is a sequence of characters used to represent text.

```java id="8m2vrx"
String text = "Hello";
```

---

## Common String Methods

### `length()`

Returns the total number of characters.

```java id="f2p9bc"
text.length();
```

---

### `substring(start, end)`

Extracts part of a string.

```java id="7nt4wq"
text.substring(0, 2);
```

---

### `contains()`

Checks if text exists inside another string.

```java id="9r3vze"
text.contains("@");
```

---

### `startsWith()`

Checks how a string begins.

---

### `endsWith()`

Checks how a string ends.

---

### `equals()`

Compares exact text values.

---

## Important Reminder

Strings are immutable.

This means:

* Original strings cannot be changed directly
* New strings are created after modifications

---

# 🧪 Fundamentals Coding Practice

---

## Project Structure

```plaintext id="4jw7yb"
module05/
├── StringExercises.java
├── tests/
│   └── StringExercisesTest.java
└── README.md
```

---

# Question 1 - Extract Middle Name

## Function:

```java id="pv7j2r"
exercise1_extractMiddleName(String fullName)
```

### Detailed Objective:

Create a method that extracts the middle name or names from a full name.

A full name may contain:

* First name
* One or more middle names
* Last name

Your task is to return only the middle portion.

---

### Rules:

* Return middle name(s) only
* Exclude first and last names
* If no middle name exists, return:

```java id="g2tm4n"
""
```

---

### Input:

* Full name as a single string

---

### Output:

* Middle name(s) string

---

### Examples:

| Input                  | Output     |
| ---------------------- | ---------- |
| "John Michael Doe"     | "Michael"  |
| "Sarah Jane Ann Smith" | "Jane Ann" |
| "John Doe"             | ""         |

---

### Edge Cases:

* Only first and last name
* Multiple middle names
* Extra spaces

---

# Question 2 - Validate ID Prefix

## Function:

```java id="j6wd1x"
exercise2_validateIDPrefix(String id)
```

### Detailed Objective:

Validate whether an ID follows the correct national format.

The ID must:

* Start with:

```java id="q7m4zc"
"ZA"
```

* Be followed by exactly 4 digits

---

### Valid Format:

```java id="0y1q8k"
ZA1234
```

---

### Rules:

* Return `true` if valid
* Return `false` otherwise

---

### Input:

* String ID

---

### Output:

* Boolean validation result

---

### Examples:

| Input    | Output |
| -------- | ------ |
| "ZA1234" | true   |
| "ZA9999" | true   |
| "US1234" | false  |
| "ZA12"   | false  |

---

### Edge Cases:

* Incorrect prefix
* Too many digits
* Too few digits
* Non-digit characters

---

# Question 3 - Remove Protocol

## Function:

```java id="s8pk5m"
exercise3_removeProtocol(String url)
```

### Detailed Objective:

Remove common web protocols from a URL.

Supported protocols:

* `http://`
* `https://`

Your method should strip these prefixes and return only the remaining web address.

---

### Rules:

* Remove protocol if present
* Return unchanged string if no protocol exists

---

### Input:

* URL string

---

### Output:

* Cleaned URL string

---

### Examples:

| Input                | Output        |
| -------------------- | ------------- |
| "https://google.com" | "google.com"  |
| "http://example.org" | "example.org" |
| "openai.com"         | "openai.com"  |

---

### Edge Cases:

* No protocol
* Mixed domains
* Empty strings

---

# Question 4 - Palindrome Checker

## Function:

```java id="m9fr2b"
exercise4_isPalindrome(String s)
```

### Detailed Objective:

Determine whether a string reads the same forwards and backwards.

A palindrome remains identical when reversed.

---

### Rules:

* Return `true` if palindrome
* Return `false` otherwise

---

### Input:

* String `s`

---

### Output:

* Boolean result

---

### Examples:

| Input     | Output |
| --------- | ------ |
| "racecar" | true   |
| "level"   | true   |
| "hello"   | false  |

---

### Edge Cases:

* Single character
* Empty string
* Mixed case sensitivity depending on tests

---

# Question 5 - Format Phone Number

## Function:

```java id="k2wq8f"
exercise5_formatPhoneNumber(String phone)
```

### Detailed Objective:

Validate and format a raw 10-digit phone number into a standardized display format.

---

### Required Format:

```java id="j5yx2u"
(XXX) XXX-XXXX
```

---

### Rules:

* Must contain exactly 10 digits
* If invalid, return:

```java id="m1rq7v"
"Invalid phone number"
```

---

### Input:

* Raw phone number string

---

### Output:

* Formatted number or error string

---

### Examples:

| Input        | Output                 |
| ------------ | ---------------------- |
| "1234567890" | "(123) 456-7890"       |
| "5551234567" | "(555) 123-4567"       |
| "12345"      | "Invalid phone number" |

---

### Edge Cases:

* Too short
* Too long
* Contains letters
* Contains symbols

---

# Question 6 - Validate Email

## Function:

```java id="6pw1xm"
exercise6_validateEmail(String email)
```

### Detailed Objective:

Validate whether an email follows simplified formatting rules.

---

### Rules:

* Must contain exactly one `@`
* Must end with:

```java id="j9r6tb"
.com
```

or

```java id="c3nv8q"
.org
```

---

### Return:

* `true` if valid
* `false` otherwise

---

### Input:

* Email string

---

### Output:

* Boolean result

---

### Examples:

| Input                                         | Output |
| --------------------------------------------- | ------ |
| "[user@example.com](mailto:user@example.com)" | true   |
| "[admin@site.org](mailto:admin@site.org)"     | true   |
| "bademail.com"                                | false  |
| "user@@site.com"                              | false  |

---

### Edge Cases:

* Multiple `@`
* Missing domain
* Invalid endings
* Empty strings

---

# Question 7 - Capitalize First Letter

## Function:

```java id="h4zv7q"
exercise7_capitalizeFirstLetter(String s)
```

### Detailed Objective:

Capitalize only the first letter of a string while leaving the remaining characters unchanged.

---

### Rules:

* First character becomes uppercase
* Remaining text stays the same
* Empty string should return empty string

---

### Input:

* String `s`

---

### Output:

* Updated string

---

### Examples:

| Input   | Output  |
| ------- | ------- |
| "hello" | "Hello" |
| "java"  | "Java"  |
| ""      | ""      |

---

### Edge Cases:

* Empty string
* Already capitalized
* Single character strings

---

# Question 8 - Extract Domain

## Function:

```java id="2cqt8m"
exercise8_extractDomain(String url)
```

### Detailed Objective:

Extract only the domain name from a URL.

This requires:

* Removing protocol if present
* Returning only the domain section

---

### Rules:

* Remove `http://` or `https://`
* Return domain only

---

### Input:

* URL string

---

### Output:

* Domain string

---

### Examples:

| Input                     | Output        |
| ------------------------- | ------------- |
| "https://google.com/page" | "google.com"  |
| "http://openai.org/about" | "openai.org"  |
| "example.com/home"        | "example.com" |

---

### Edge Cases:

* Missing protocol
* Paths after domain
* Empty strings

---

# 💡 Key Developer Tips

* Always check string length before substring
* Prevent index out-of-bounds errors
* Validate inputs carefully
* Use `startsWith()`, `endsWith()`, and `contains()` effectively
* Strings are immutable
* Build defensive programming habits
* Test malformed inputs thoroughly

---

# 🚀 End Goal

By completing this module, you should:

* Manipulate strings confidently
* Process and validate user input
* Format text professionally
* Solve practical text-processing problems
* Improve debugging precision
* Prepare for more advanced parsing and backend development

---

# 🏆 Success Mindset

String processing is one of the most practical programming skills.

From user authentication to web applications to APIs, software constantly processes text.

Master string manipulation thoroughly before progressing.
