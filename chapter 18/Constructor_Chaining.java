/*
 * Constructor Chaining in Java – Simple Explanation
 * Constructor chaining means calling one constructor from another constructor.
 * It helps avoid duplicate code and ensures a proper sequence of constructor
 * execution.
 * 
 * 🔹 Two Types of Constructor Chaining
 * 1. Within the same class → use this()
 * Used to call another constructor in the same class.
 * 
 * 2. Between parent and child classes → use super()
 * Used to call parent class constructor from the subclass constructor.
 * 
 * 🔸 Example 1: Using this() – Same Class
 * java
 * Copy
 * Edit
 * class Person {
 * Person() {
 * this(25); // calls Person(int)
 * System.out.println("Default constructor");
 * }
 * 
 * Person(int age) {
 * System.out.println("Age: " + age);
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Person p = new Person();
 * }
 * }
 * ✅ Output:
 * vbnet
 * Copy
 * Edit
 * Age: 25
 * Default constructor
 * 🔸 Example 2: Using super() – Parent to Child
 * java
 * Copy
 * Edit
 * class Animal {
 * Animal() {
 * System.out.println("Animal constructor");
 * }
 * }
 * 
 * class Dog extends Animal {
 * Dog() {
 * super(); // calls Animal()
 * System.out.println("Dog constructor");
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Dog d = new Dog();
 * }
 * }
 * ✅ Output:
 * kotlin
 * Copy
 * Edit
 * Animal constructor
 * Dog constructor
 * 🔹 Rules:
 * this() and super() must be the first line in the constructor.
 * 
 * You cannot use both this() and super() in the same constructor.
 * 
 * If super() is not written, Java automatically adds a call to the default
 * constructor of the parent class.
 */