# 📘 Module 14: TCP Socket Programming

---

## 🎯 Learning Objectives

In this module, you will:

- Understand TCP communication
- Create a basic server and client
- Send and receive messages using sockets

---

## 🎥 Video Sections

https://youtu.be/c13XxZgUVj0  
https://youtu.be/MshSvgwBmU4  

### ⏱ Watch:

- First ~12 minutes (TCP basics)
- Next ~5 minutes (Client/Server example)

---

## 🧠 Key Concepts

### TCP Server

ServerSocket server = new ServerSocket(5000);
Socket socket = server.accept();

---

### TCP Client

Socket socket = new Socket("localhost", 5000);

---

### Streams

BufferedReader in = new BufferedReader(
    new InputStreamReader(socket.getInputStream())
);

PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

---

## 🧪 Exercises

Implement all methods in:

TCPSocketExercises.java

---

# 🧩 Exercise 1: Create Server

Method: exercise1_createServer()

Objective:
Create a TCP server on port 5000.

Rules:
- Use ServerSocket
- Port 5000
- Return "Server created"

---

# 🧩 Exercise 2: Create Client

Method: exercise2_createClient()

Objective:
Connect to localhost server.

Rules:
- Connect to localhost:5000
- Return "Client connected"

---

# 🧩 Exercise 3: Send Message

Method: exercise3_sendMessage()

Objective:
Simulate sending a message.

Rules:
- Message = "Hello Server"
- Return "Message sent"

---

# 🧩 Exercise 4: Receive Message

Method: exercise4_receiveMessage()

Objective:
Simulate receiving a message.

Rules:
- Return "Message received"

---

# 🧩 Exercise 5: Full Communication

Method: exercise5_fullCommunication()

Objective:
Simulate full client-server communication.

Rules:
- Client sends "Hello Server"
- Server responds
- Return "Hello Server"

---

## ✅ What You Must Do

- Implement all methods
- Understand Socket and ServerSocket conceptually
- Simulate networking (no real network required if tests are mocked)
- Handle errors safely

Run tests:

mvn test

---

## 💡 Tips

- TCP is connection-based
- localhost = your machine
- Always close sockets in real systems
- Use try-catch for safety
- Streams handle data flow

---

## 🚀 Goal

By the end of this module, you should:

- Understand TCP communication
- Build client-server logic
- Simulate message exchange
- Understand networking flow

---

# 📘 Learning Outcomes

- TCP fundamentals
- Client-server architecture
- Socket communication
- Streams (input/output)
- Message transmission flow

---

## 🏆 Final Mindset

This module teaches how real systems communicate:

- APIs
- Chat systems
- Web servers
- Distributed systems
