public class Static_Keyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student.clgName = "GGITS";

        Student s2 = new Student();
        System.out.println(s2.clgName);
        System.out.println(s1.clgName);
    }
}

class Student {
    String name;
    int roll;

    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    static String clgName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setRoll(int roll) {
        this.roll = roll;
    }

    int getRoll() {
        return this.roll;
    }
}

// What's Happening:
// static String clgName;
// Shared by all instances of Student

// Setting it using Student.clgName = "GGITS"; affects all objects (s1, s2,
// etc.)

// static int returnPercentage(...)
// A static method that can be called without creating any object
/*
 * static Keyword in Java – Complete Guide with Examples
 * 🔹 What is static in Java?
 * The static keyword in Java is used for memory management.
 * It makes members belong to the class, not to any individual object.
 * 
 * ✅ You can use static with:
 * Keyword Placement Meaning
 * static int x Static variable (shared across objects)
 * static void method() Static method (can be called without object)
 * static block Runs once when class is loaded
 * static class (nested) Static nested class
 * 
 * ✅ 1. Static Variable Example
 * java
 * Copy
 * Edit
 * class Student {
 * String name;
 * static String college = "ABC University"; // shared by all students
 * 
 * Student(String name) {
 * this.name = name;
 * }
 * 
 * void display() {
 * System.out.println(name + " studies at " + college);
 * }
 * }
 * 
 * public class StaticVariableDemo {
 * public static void main(String[] args) {
 * Student s1 = new Student("Aman");
 * Student s2 = new Student("Riya");
 * 
 * s1.display(); // Aman studies at ABC University
 * s2.display(); // Riya studies at ABC University
 * }
 * }
 * ✅ 2. Static Method Example
 * java
 * Copy
 * Edit
 * class MathUtils {
 * static int square(int x) {
 * return x * x;
 * }
 * }
 * 
 * public class StaticMethodDemo {
 * public static void main(String[] args) {
 * int result = MathUtils.square(5); // called without object
 * System.out.println("Square: " + result);
 * }
 * }
 * ✅ 3. Static Block
 * java
 * Copy
 * Edit
 * class App {
 * static {
 * System.out.println("Static block runs first!");
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println("Main method runs second!");
 * }
 * }
 * ✅ Output:
 * sql
 * Copy
 * Edit
 * Static block runs first!
 * Main method runs second!
 * ✅ 4. Static Nested Class
 * java
 * Copy
 * Edit
 * class Outer {
 * static class Inner {
 * void msg() {
 * System.out.println("Hello from static nested class");
 * }
 * }
 * }
 * 
 * public class StaticNestedDemo {
 * public static void main(String[] args) {
 * Outer.Inner obj = new Outer.Inner(); // no need for Outer object
 * obj.msg();
 * }
 * }
 * 🧠 Summary
 * Use Behavior
 * Static variable Shared by all objects of a class
 * Static method Belongs to class; can be called without object
 * Static block Runs once when class is loaded
 * Static nested class Can be accessed without an instance of outer class
 * 
 * 🔒 Rules:
 * Static methods can’t access non-static data directly.
 * 
 * this and super cannot be used in static context.
 * 
 * You can’t override static methods (but you can hide them).
 */