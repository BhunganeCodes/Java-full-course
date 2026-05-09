# 📘 Module 11: Wrapper Classes, Collections, HashMaps, BiMaps & Advanced Data Structures

---

## 🎯 Learning Objectives

In this module, you will:

* Understand Java wrapper classes (`Integer`, `Double`, etc.)
* Learn autoboxing and unboxing
* Handle `null` values safely
* Use `ArrayList` for dynamic collections
* Use `HashMap` for structured key-value storage
* Build advanced `ArrayList` logic
* Perform advanced `HashMap` operations
* Understand BiMap (bidirectional mapping) concepts
* Practice reverse lookups and grouped data structures
* Use enums for fixed safe values
* Strengthen real-world data processing skills
* Improve enterprise-level Java development foundations

---

## 🎥 Video Learning Resources

### Main Java Course:

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections in Order:

### 1️⃣ Wrapper Classes + ArrayList

* **08:45:17 → 08:55:51**

### 2️⃣ HashMap + Enums

* **10:52:09 → 11:02:38**

---

### 🎁 Bonus Advanced Collections Video:

https://youtu.be/pJNUDXzmBCE?si=zGn9KfVBO9VDtM9I

### ⏱ Watch:

* Full 5-minute lesson

---

### 📚 Recommended Study Method:

* Watch one concept at a time
* Pause frequently
* Code immediately after learning
* Test each concept manually
* Focus on safe data handling
* Build confidence through repetition

---

# 📚 Learning Outcomes Assessed

* Wrapper Classes
* Null Safety
* Autoboxing / Unboxing
* ArrayList
* Advanced ArrayList Processing
* HashMap
* Advanced HashMap Processing
* Reverse Mapping
* BiMap Concepts
* Frequency Counting
* Enum Usage
* Structured Data Transformation
* Software Scalability
* Collection-Based Problem Solving

---

# 🛠 Module Structure

This module contains:

### Coding Practice Files:

```java
CollectionsExercises.java
Day.java
Grade.java
```

---

# ✅ What You Must Do

For this module, you must:

* Use wrapper classes safely
* Handle `null` values properly
* Build dynamic collections using `ArrayList`
* Store structured data using `HashMap`
* Apply reverse mapping concepts
* Practice grouped data processing
* Understand enum safety
* Return exact expected outputs
* Pass all tests successfully

---

# 🧪 How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run only this module’s tests:

```bash
mvn test -Dtest=CollectionsExercisesTest
```

---

# 🧠 Core Java Data Structure Concepts

---

## 🔹 What Are Wrapper Classes?

Wrapper classes convert Java primitives into objects.

### Examples:

```java
Integer x = 5;
Double y = 3.14;
Boolean flag = true;
```

---

### Why They Matter:

Wrapper classes allow:

* Object storage in collections
* Null values
* Utility methods
* Modern API compatibility
* Safer enterprise development

---

### Important:

Unlike primitives, wrappers can be:

```java
null
```

Always validate accordingly.

---

## 🔹 What is ArrayList?

`ArrayList` is a dynamic resizable array.

### Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

---

### Benefits:

* Flexible sizing
* Dynamic storage
* Easy iteration
* Fast access
* Common real-world usage

---

### Common Methods:

```java
add()
get()
size()
remove()
contains()
```

---

## 🔹 What is HashMap?

`HashMap` stores data as key-value pairs.

### Example:

```java
HashMap<String, Integer> scores = new HashMap<>();
```

---

### Benefits:

* Fast lookups
* Structured data storage
* Frequency counting
* Reverse indexing
* Scalable software systems

---

### Common Methods:

```java
put()
get()
containsKey()
remove()
keySet()
```

---

## 🔹 What is BiMap?

A BiMap (bidirectional map) allows reverse lookup of values back to keys.

---

### Example Concept:

```java
"A" → 1
1 → "A"
```

---

### Why It Matters:

BiMap concepts help with:

* Reverse searches
* Data transformations
* Identifier mapping
* Real-world backend systems

---

## 🔹 What Are Enums?

Enums represent fixed constant values.

### Example:

```java
enum Day {
    MONDAY, TUESDAY
}
```

---

### Benefits:

* Type safety
* Prevent invalid values
* Cleaner architecture
* Better maintainability

---

# 🧪 Project Structure

```plaintext
module11/
├── CollectionsExercises.java
├── Day.java
├── Grade.java
├── tests/
│   └── CollectionsExercisesTest.java
└── README.md
```

---

# 🧩 Exercises

---

# 🧩 Question 1 - Wrapper Sum

## Function:

```java
exercise1_sumWrapper(Integer a, Integer b)
```

---

### Objective:

Safely add two wrapper integers.

---

### Rules:

* If either value is `null`, treat it as `0`
* Return total sum

---

### Examples:

| Input        | Output |
| ------------ | ------ |
| (5, 10)      | 15     |
| (null, 7)    | 7      |
| (null, null) | 0      |

---

### Key Focus:

* Null safety
* Defensive programming
* Wrapper handling

---

# 🧩 Question 2 - Filter Even Numbers

## Function:

```java
exercise2_filterEven(ArrayList<Integer> list)
```

---

### Objective:

Return only even numbers from a list.

---

### Rules:

* Preserve original order
* Return a new filtered list
* Include only numbers divisible by `2`

---

### Examples:

| Input     | Output  |
| --------- | ------- |
| [1,2,3,4] | [2,4]   |
| [5,7]     | []      |
| [2,4,6]   | [2,4,6] |

---

# 🧩 Question 3 - List to String

## Function:

```java
exercise3_listToString(ArrayList<Integer> list)
```

---

### Objective:

Convert a list into a properly formatted comma-separated string.

---

### Rules:

* Preserve order
* Separate values with commas
* No extra commas
* Empty list → `""`

---

### Examples:

| Input   | Output    |
| ------- | --------- |
| [1,2,3] | "1, 2, 3" |
| [5]     | "5"       |
| []      | ""        |

---

# 🧩 Question 4 - HashMap Lookup

## Function:

```java
exercise4_mapLookup(HashMap<String, Integer> map, String key)
```

---

### Objective:

Safely retrieve a value from a map.

---

### Rules:

* Return matching value
* Missing key → `-1`

---

### Examples:

| Input        | Output |
| ------------ | ------ |
| {"A":1}, "A" | 1      |
| {"A":1}, "B" | -1     |

---

# 🧩 Question 5 - Count Word Frequencies

## Function:

```java
exercise5_countFrequencies(ArrayList<String> words)
```

---

### Objective:

Count how many times each word appears.

---

### Rules:

* Return `HashMap<String, Integer>`
* Each word = key
* Frequency = value

---

### Example:

| Input                      | Output                 |
| -------------------------- | ---------------------- |
| ["apple","banana","apple"] | {"apple":2,"banana":1} |

---

### Real-World Applications:

* Search engines
* Analytics
* Text processing
* Data pipelines

---

# 🧩 Question 6 - Enum Day Type

## Function:

```java
exercise6_dayType(Day day)
```

---

### Objective:

Determine whether a day is a weekday or weekend.

---

### Rules:

* MONDAY–FRIDAY → `"Weekday"`
* SATURDAY–SUNDAY → `"Weekend"`

---

### Examples:

| Input    | Output    |
| -------- | --------- |
| MONDAY   | "Weekday" |
| SATURDAY | "Weekend" |

---

# 🧩 Question 7 - Enum Grade Description

## Function:

```java
exercise7_gradeDescription(Grade grade)
```

---

### Objective:

Convert grade enums into readable descriptions.

---

### Rules:

* A → Excellent
* B → Good
* C → Average
* D → Poor
* F → Fail

---

---

# 🚀 ADVANCED COLLECTIONS SECTION

---

# 🧩 Question 8 - Remove Duplicates from ArrayList

## Function:

```java
exercise8_removeDuplicates(ArrayList<Integer> list)
```

---

### Objective:

Return a new list with duplicate values removed.

---

### Rules:

* Preserve original order
* Keep first occurrence only

---

### Examples:

| Input       | Output  |
| ----------- | ------- |
| [1,2,2,3,1] | [1,2,3] |

---

# 🧩 Question 9 - Find Largest Value in ArrayList

## Function:

```java
exercise9_findLargest(ArrayList<Integer> list)
```

---

### Objective:

Return the largest integer in the list.

---

### Rules:

* Empty list → `Integer.MIN_VALUE`

---

### Examples:

| Input   | Output            |
| ------- | ----------------- |
| [3,8,2] | 8                 |
| []      | Integer.MIN_VALUE |

---

# 🧩 Question 10 - Reverse an ArrayList

## Function:

```java
exercise10_reverseList(ArrayList<Integer> list)
```

---

### Objective:

Return a reversed copy of the list.

---

### Rules:

* Preserve original list
* Return new reversed list

---

### Examples:

| Input   | Output  |
| ------- | ------- |
| [1,2,3] | [3,2,1] |

---

# 🧩 Question 11 - Merge Two HashMaps

## Function:

```java
exercise11_mergeMaps(HashMap<String,Integer> map1, HashMap<String,Integer> map2)
```

---

### Objective:

Combine two maps into one.

---

### Rules:

* Include all entries
* If duplicate key exists → second map overrides first

---

### Examples:

| Input                  | Output        |
| ---------------------- | ------------- |
| {"A":1}, {"A":2,"B":3} | {"A":2,"B":3} |

---

# 🧩 Question 12 - Invert HashMap (BiMap Concept)

## Function:

```java
exercise12_invertMap(HashMap<String,Integer> map)
```

---

### Objective:

Reverse key-value pairs.

---

### Output:

```java
HashMap<Integer,String>
```

---

### Examples:

| Input   | Output  |
| ------- | ------- |
| {"A":1} | {1:"A"} |

---

### Key Focus:

* Reverse lookups
* Data transformation
* BiMap understanding

---

# 🧩 Question 13 - Find Most Frequent Word

## Function:

```java
exercise13_mostFrequentWord(ArrayList<String> words)
```

---

### Objective:

Return the most frequent word.

---

### Rules:

* Tie → first encountered
* Empty list → `""`

---

### Examples:

| Input         | Output |
| ------------- | ------ |
| ["a","b","a"] | "a"    |

---

# 🧩 Question 14 - Group Words by Length

## Function:

```java
exercise14_groupByLength(ArrayList<String> words)
```

---

### Objective:

Group words by word length.

---

### Output:

```java
HashMap<Integer, ArrayList<String>>
```

---

### Example:

```java
["cat","dog","elephant"]
```

Returns:

```java
{
3: ["cat","dog"],
8: ["elephant"]
}
```

---

# 🧩 Question 15 - Safe Integer Parsing

## Function:

```java
exercise15_safeParse(String s)
```

---

### Objective:

Safely parse a string into an Integer.

---

### Rules:

* Valid integer → parsed value
* Invalid input → `null`

---

### Examples:

| Input | Output |
| ----- | ------ |
| "123" | 123    |
| "abc" | null   |

---

# 💡 Key Developer Tips

* Always validate wrapper `null`s
* Preserve order when required
* Use defensive coding practices
* HashMaps are ideal for structured lookups
* BiMap logic improves reverse indexing
* Grouping data strengthens architecture
* Think carefully about scalability
* Practice clean reusable code
* Test unusual edge cases

---

# 🚀 End Goal

By completing this expanded module, you should:

* Master wrapper classes
* Build advanced ArrayList solutions
* Use HashMaps professionally
* Understand BiMap concepts
* Build reverse lookup systems
* Process structured datasets effectively
* Improve enterprise software readiness
* Strengthen practical Java engineering confidence

---

# 🏆 Success Mindset

Collections are foundational to modern software engineering.

Mastering advanced collections prepares you for:

* Backend systems
* APIs
* Data engineering
* Enterprise Java
* Search engines
* Automation
* Real-world scalable software systems

This expanded module represents a major step toward professional-level Java development.
