public class Multiple_Inheritance {

}

/*
 * Definition:
 * Multiple Inheritance is a feature where a class inherits from more than one
 * class.
 * 
 * However, Java does not support multiple inheritance with classes to avoid
 * ambiguity (like the Diamond Problem).
 * 
 * But Java does support multiple inheritance using interfaces.
 * 
 * 🔹 ❌ Why Java doesn’t allow multiple inheritance with classes?
 * Consider this example in C++:
 * 
 * cpp
 * Copy
 * Edit
 * class A {
 * void show() { cout << "A"; }
 * };
 * 
 * class B {
 * void show() { cout << "B"; }
 * };
 * 
 * class C : public A, public B {
 * // Which show() to call? A or B? ➜ Ambiguity
 * };
 * To avoid such conflicts, Java designers disabled multiple inheritance through
 * classes.
 * 
 * 🔹 ✅ Multiple Inheritance Using Interfaces (Java Way)
 * In Java, interfaces solve this problem.
 * 
 * 🔹 Example:
 * java
 * Copy
 * Edit
 * interface Flyable {
 * void fly();
 * }
 * 
 * interface Swimmable {
 * void swim();
 * }
 * 
 * class Duck implements Flyable, Swimmable {
 * public void fly() {
 * System.out.println("Duck flies");
 * }
 * 
 * public void swim() {
 * System.out.println("Duck swims");
 * }
 * }
 * 
 * public class MultipleInheritanceExample {
 * public static void main(String[] args) {
 * Duck d = new Duck();
 * d.fly();
 * d.swim();
 * }
 * }
 * 🔹 Output:
 * nginx
 * Copy
 * Edit
 * Duck flies
 * Duck swims
 * 🔹 Explanation:
 * Flyable and Swimmable are interfaces.
 * 
 * Duck implements both, hence achieves multiple inheritance safely.
 * 
 * No ambiguity since interface methods must be implemented explicitly in the
 * class.
 * 
 * 🔹 Diagram:
 * markdown
 * Copy
 * Edit
 * Flyable Swimmable
 * ↓ ↓
 * Duck
 * 🔹 Key Points:
 * Aspect Class Inheritance Interface Inheritance
 * Multiple Inheritance ❌ Not allowed ✅ Allowed
 * Syntax extends implements
 * Allows method body? Yes From Java 8 (default/static)
 * Conflict resolution Ambiguous Must override in child
 * 
 * 
 */