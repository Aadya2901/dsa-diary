
/*
 * ### ✅ Polymorphism in Java – Explained Clearly
 * 
 * ---
 * 
 * ### 🔹 **Definition:**
 ** 
 * Polymorphism** means **“many forms”**.
 * In Java, it allows **the same method name** to behave **differently**
 * depending on:
 * 
 * The **object type** it is acting on
 * The **parameters** passed to it
 * 
 * ---
 * 
 * ### 🔸 Java Supports Two Types of Polymorphism:
 * 
 * | Type | Also Called | When Resolved |
 * | ----------------------------- | ------------------ | --------------- |
 * | **Compile-time polymorphism** | Method Overloading | At compile time |
 * | **Runtime polymorphism** | Method Overriding | At runtime |
 * 
 * ---
 * 
 * ## 🧪 1. Compile-time Polymorphism (Method Overloading)
 * 
 * ### 📌 Definition:
 * 
 * Method with **same name** but **different parameters** (type or count).
 * 
 * ---
 * 
 * ### ✅ Example:
 * 
 * ```java
 * class Calculator {
 * int add(int a, int b) {
 * return a + b;
 * }
 * 
 * double add(double a, double b) {
 * return a + b;
 * }
 * 
 * int add(int a, int b, int c) {
 * return a + b + c;
 * }
 * }
 * 
 * public class OverloadingExample {
 * public static void main(String[] args) {
 * Calculator c = new Calculator();
 * System.out.println(c.add(2, 3)); // int version
 * System.out.println(c.add(2.5, 3.5)); // double version
 * System.out.println(c.add(1, 2, 3)); // three-arg version
 * }
 * }
 * ```
 * 
 * ### ✅ Output:
 * 
 * ```
 * 5
 * 6.0
 * 6
 * ```
 * 
 * ---
 * 
 * ## 🧪 2. Runtime Polymorphism (Method Overriding)
 * 
 * ### 📌 Definition:
 * 
 * Subclass **overrides** a method of the superclass with the **same
 * signature**.
 * 
 * Method to be called is decided **at runtime**, depending on the **object
 * type**, not the reference type.
 * 
 * ---
 * 
 * ### ✅ Example:
 * 
 * ```java
 * class Animal {
 * void sound() {
 * System.out.println("Animal makes a sound");
 * }
 * }
 * 
 * class Dog extends Animal {
 * void sound() {
 * System.out.println("Dog barks");
 * }
 * }
 * 
 * class Cat extends Animal {
 * void sound() {
 * System.out.println("Cat meows");
 * }
 * }
 * 
 * public class OverridingExample {
 * public static void main(String[] args) {
 * Animal a;
 * 
 * a = new Dog(); // Animal reference to Dog object
 * a.sound(); // Dog's sound()
 * 
 * a = new Cat(); // Animal reference to Cat object
 * a.sound(); // Cat's sound()
 * }
 * }
 * ```
 * 
 * ### ✅ Output:
 * 
 * ```
 * Dog barks
 * Cat meows
 * ```
 * 
 * ---
 * 
 * ## 🔍 Key Differences
 * 
 * | Feature | Method Overloading | Method Overriding |
 * | --------------------- | ------------------ | ---------------------- |
 * | Based on | Method parameters | Object type at runtime |
 * | Resolved at | Compile time | Runtime |
 * | Same class? | Yes | Inheritance needed |
 * | Access via reference? | No effect | Polymorphic behavior |
 * 
 * ---
 * 
 * ## 🧠 Real-Life Analogy:
 * 
 * Imagine a method `draw()`:
 * 
 * For a `Circle`, it draws a circle.
 * For a `Rectangle`, it draws a rectangle.
 * 
 * Though the **method name is same**, behavior **varies by object** → that’s
 * **runtime polymorphism**.
 * 
 * ---
 * 
 * ### ✅ Summary:
 * 
 * | Type | Technique | Example
 * | Compile-time | Method Overloading | `add(int, int)` and `add(double,
 * double)` |
 * | Runtime | Method Overriding | `Dog extends Animal` and overrides `sound()`
 * |
 * 
 */