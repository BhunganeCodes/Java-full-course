# 📘 Module 15: UDP Socket Programming

---

## 🎯 Learning Objectives / Outcomes

In this module, you will learn:

* UDP Networking Fundamentals
* Datagram Communication
* Connectionless Protocol Behavior
* DatagramSocket Usage
* DatagramPacket Usage
* Sending and Receiving Packets
* Network Communication Models
* TCP vs UDP Comparison
* Lightweight Network Messaging
* Real-time system communication principles

---

## 🎥 Video Section

https://youtu.be/A5fFxs_DUsQ

### ⏱ Watch Instructions:

* First ~5 minutes
* Focus on:
  * UDP basics
  * Connectionless communication
  * Datagram behavior

---

## 🧠 Core UDP Concepts

### 🔹 What is UDP?

UDP (User Datagram Protocol) is a fast, connectionless protocol used for lightweight communication.

---

### Key Characteristics:

* Connectionless
* Fast
* No delivery guarantee
* No ordering guarantee

---

### Real-World Uses:

* Gaming
* Streaming
* VoIP
* DNS requests

---

## 🔹 UDP vs TCP

| Feature | TCP | UDP |
|--------|-----|-----|
| Connection | Yes | No |
| Reliability | High | Low |
| Speed | Slower | Faster |

---

## 🔹 Java UDP Components

### Socket:
    DatagramSocket

### Packet:
    DatagramPacket

### Example:
    DatagramSocket socket = new DatagramSocket();

    DatagramPacket packet =
        new DatagramPacket(data, data.length, address, port);

    socket.send(packet);
    socket.receive(packet);

---

## 📁 Project Structure

    module15/
    ├── UDPSocketExercises.java
    ├── tests/
    │   └── UDPSocketExercisesTest.java
    └── README.md

---

## 🧪 Exercises

Implement:

    UDPSocketExercises.java

---

### 🧩 Exercise 1
Return:
    Socket created

---

### 🧩 Exercise 2
Return:
    Packet sent

---

### 🧩 Exercise 3
Return:
    Packet received

---

### 🧩 Exercise 4
Return:
    No connection needed

---

### 🧩 Exercise 5
Return:
    Hello UDP

---

## 🚀 Goal

Understand UDP, DatagramSocket, and connectionless communication.

---

## 🧪 Run Tests

    mvn test

or

    mvn test -Dtest=UDPSocketExercisesTest
