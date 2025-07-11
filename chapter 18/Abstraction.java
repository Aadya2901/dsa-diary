public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Hen c = new Hen();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        myHorse.eat();
        // Animal -> Horse -> Mustang

        // Animal a = new Animal -> not allowed

    }
}

abstract class Animal {
    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    // Constructor
    Animal() {
        System.out.println("Animal constructor called");
        color = "black";
    }

    abstract void walk();
}

class Horse extends Animal {

    // Constructor
    Horse() {
        System.out.println("Horse constructor called");
    }

    void walk() {
        System.out.println("Walks on four legs");
    }

    void changeColor() {
        color = "brown";
    }
}

class Mustang extends Horse {

    // Constructor
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Hen extends Animal {
    void walk() {
        System.out.println("Walks on two legs");
    }

    void changeColor() {
        color = "yellow";
    }
}

// constructor not just initializes value for its class but also for its child
// class

// The abstract class constructor is run before the subclass constructor.

// It initializes the parent’s data (like color) for the child object.

// So, the child inherits not only methods, but also initialized fields.

// In Java, when a child class object is created, the constructor of the parent
// class (superclass) is automatically called first, even if it's abstract.
// This is how the parent class initializes its fields, and that initialization
// is available to the child object.
/*
 * Abstraction in Java – Full Explanation
 * 🔹 What is Abstraction?
 * Abstraction is the process of hiding internal details and showing only the
 * essential features of an object.
 * In Java, abstraction is achieved using:
 * 
 * Abstract classes
 * 
 * Interfaces
 * 
 * 🔹 Why use Abstraction?
 * Benefit Explanation
 * 🔒 Hides complexity User sees only what is necessary
 * ♻️ Promotes reusability Common structure in abstract class or interface
 * ✅ Enforces standards Subclasses must implement abstract methods
 * 
 * ✅ 1. Using Abstract Classes
 * 🔹 Syntax:
 * java
 * Copy
 * Edit
 * abstract class Animal {
 * abstract void sound(); // abstract method
 * void eat() {
 * System.out.println("Animal eats food");
 * }
 * }
 * 
 * class Dog extends Animal {
 * void sound() {
 * System.out.println("Dog barks");
 * }
 * }
 * 🔹 Example:
 * java
 * Copy
 * Edit
 * public class AbstractExample {
 * public static void main(String[] args) {
 * Animal a = new Dog(); // upcasting
 * a.sound(); // Dog's implementation
 * a.eat(); // Inherited from abstract class
 * }
 * }
 * ✅ Output:
 * nginx
 * Copy
 * Edit
 * Dog barks
 * Animal eats food
 * ✅ 2. Using Interfaces
 * 🔹 Syntax:
 * java
 * Copy
 * Edit
 * interface Vehicle {
 * void start();
 * }
 * 
 * class Car implements Vehicle {
 * public void start() {
 * System.out.println("Car starts");
 * }
 * }
 * 🔹 Example:
 * java
 * Copy
 * Edit
 * public class InterfaceExample {
 * public static void main(String[] args) {
 * Vehicle v = new Car();
 * v.start(); // Car's version
 * }
 * }
 * ✅ Output:
 * nginx
 * Copy
 * Edit
 * Car starts
 * ✅ Difference: Abstract Class vs Interface
 * Feature Abstract Class Interface
 * Inheritance extends implements
 * Supports constructors? ✅ Yes ❌ No
 * Can have method bodies? ✅ Yes ✅ (since Java 8 with default/static)
 * Multiple inheritance? ❌ No (only one abstract class) ✅ Yes (can implement
 * many)
 * 
 * 🧠 Real-life Example:
 * Imagine a remote control (abstract class/interface) for all devices:
 * 
 * You don’t care how the device turns on (internal logic), just that turnOn()
 * is there.
 * 
 * TV, Fan, and AC all implement turnOn() differently — that’s abstraction.
 * 
 * ✅ Summary:
 * Concept Purpose Keyword
 * Abstraction Hide internal logic, expose essentials abstract, interface
 * Achieved By Abstract class or Interface -
 * Enforces Method contracts for subclasses -
 * 
 * 
 */