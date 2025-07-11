interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Class C implements two interfaces: Multiple Inheritance
class Bird implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Bird can fly");
    }

    public void swim() {
        System.out.println("Bird can swim");
    }

    void chirp() {
        System.out.println("Bird chirps");
    }
}

// Class D extends Bird: Multilevel Inheritance
class Penguin extends Bird {
    void walk() {
        System.out.println("Penguin walks");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        p.fly(); // inherited from Flyable via Bird
        p.swim(); // inherited from Swimmable via Bird
        p.chirp(); // from Bird
        p.walk(); // from Penguin
    }
}

/*
 * Hybrid Inheritance in Java – Explained
 * 🔹 Definition:
 * Hybrid Inheritance is a combination of two or more types of inheritance
 * (e.g., single + multilevel + hierarchical) in a single program.
 * 
 * 🔴 Note:
 * Java does not support hybrid inheritance with classes due to the diamond
 * problem and ambiguity in method resolution.
 * But Java supports hybrid inheritance using interfaces.
 * 
 * 🔹 Conceptual Diagram of Hybrid Inheritance:
 * vbnet
 * Copy
 * Edit
 * Interface A Interface B
 * \ /
 * \ /
 * \ /
 * Class C (implements A, B)
 * |
 * Class D (extends C)
 * This combines:
 * 
 * Multiple Inheritance via interfaces A & B
 * 
 * Single/Multilevel Inheritance via Class C → Class D
 * 
 * 
 * 🔹 Key Points:
 * Feature Class Support Interface Support
 * Multiple Inheritance ❌ Not allowed ✅ Yes
 * Multilevel Inheritance ✅ Yes ✅ Yes
 * Hierarchical Inheritance ✅ Yes ✅ Yes
 * Hybrid Inheritance (Mixed) ❌ Via class ✅ Via interface
 * 
 * 🔸 Diamond Problem (Why hybrid via class is not allowed)
 * java
 * Copy
 * Edit
 * class A {
 * void show() { System.out.println("A"); }
 * }
 * 
 * class B extends A {
 * void show() { System.out.println("B"); }
 * }
 * 
 * class C extends A {
 * void show() { System.out.println("C"); }
 * }
 * 
 * // ❌ class D extends B, C {} // Error: Java does not allow this
 * Java avoids this ambiguity by not allowing multiple class inheritance.
 * 
 */