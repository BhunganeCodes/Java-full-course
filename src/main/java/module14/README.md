# 📘 Module 14: TCP Socket Programming

---

## 🎯 Learning Objectives

In this module, you will:

* Understand TCP communication
* Create a basic server and client
* Send and receive messages using sockets

---

## 🎥 Video Sections
 
* https://youtu.be/c13XxZgUVj0

* https://youtu.be/MshSvgwBmU4

### ⏱ Watch:

* First ~12 minutes (TCP basics)
* Next ~5 minutes (Client/Server example)

---

## 🧠 Key Concepts

### 🔹 TCP Socket (Server)

```java
ServerSocket server = new ServerSocket(5000);
Socket socket = server.accept();
```

### 🔹 TCP Socket (Client)

```java
Socket socket = new Socket("localhost", 5000);
```

### 🔹 Streams

```java
BufferedReader in = new BufferedReader(
    new InputStreamReader(socket.getInputStream())
);
PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
```

---

## 🧪 Exercises

👉 Implement all methods in:

TCPSocketExercises.java

---

### 🧩 Exercise 1: Create Server

* Create a ServerSocket on port 5000
* Return: "Server created"

---

### 🧩 Exercise 2: Create Client

* Connect to localhost:5000
* Return: "Client connected"

---

### 🧩 Exercise 3: Send Message

* Simulate sending "Hello Server"
* Return: "Message sent"

---

### 🧩 Exercise 4: Receive Message

* Simulate receiving a message
* Return: "Message received"

---

### 🧩 Exercise 5: Full Communication

* Simulate client-server interaction
* Return: "Hello Server"

---

## ✅ What You Must Do

* Implement all methods
* Use Socket and ServerSocket
* Keep code simple

Run:
mvn test

---

## 💡 Tips

* Use try-catch
* Close sockets
* Simulation is allowed

---

## 🚀 Goal

* Understand TCP client-server communication
