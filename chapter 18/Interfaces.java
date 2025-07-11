public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down,Left, Right, Diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down,Left, Right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down,Left, Right, Diagonal (by one step)");
    }
}

/*
 * Interfaces in Java – Full Explanation with Example
 * 🔹 What is an Interface in Java?
 * An interface in Java is a collection of abstract methods (and optionally
 * constants, default and static methods) used to define a contract for classes
 * to implement.
 * 
 * ⚠️ Unlike abstract classes, interfaces cannot have constructors and cannot
 * hold instance variables (except static final constants).
 * 
 * ✅ Key Points:
 * Feature Interface
 * Keyword interface
 * Methods (by default) public abstract
 * Variables (by default) public static final
 * Can be implemented by class ✅ Yes
 * Supports multiple inheritance? ✅ Yes
 * Constructor allowed? ❌ No
 * Inheritance between interfaces? ✅ interface A extends B
 * 
 * ✅ Interface Example: Using Animal Interface
 * java
 * Copy
 * Edit
 * public class InterfaceExample {
 * public static void main(String[] args) {
 * Horse h = new Horse();
 * h.eat();
 * h.walk();
 * 
 * Bird b = new Bird();
 * b.eat();
 * b.fly();
 * }
 * }
 * 
 * interface Animal {
 * void eat();
 * void walk();
 * }
 * 
 * interface Flyable {
 * void fly();
 * }
 * 
 * class Horse implements Animal {
 * public void eat() {
 * System.out.println("Horse eats grass");
 * }
 * 
 * public void walk() {
 * System.out.println("Horse walks on four legs");
 * }
 * }
 * 
 * class Bird implements Animal, Flyable {
 * public void eat() {
 * System.out.println("Bird eats grains");
 * }
 * 
 * public void walk() {
 * System.out.println("Bird walks on two legs");
 * }
 * 
 * public void fly() {
 * System.out.println("Bird flies in sky");
 * }
 * }
 * ✅ Output:
 * nginx
 * Copy
 * Edit
 * Horse eats grass
 * Horse walks on four legs
 * Bird eats grains
 * Bird walks on two legs
 * Bird flies in sky
 * 🧠 Key Takeaways:
 * Interface is like a 100% abstract blueprint.
 * 
 * A class implements an interface to provide specific definitions.
 * 
 * A class can implement multiple interfaces (Java supports multiple inheritance
 * via interfaces).
 * 
 * Interfaces help with loose coupling and testability.
 * 
 * ✅ Interface vs Abstract Class
 * Feature Interface Abstract Class
 * Keyword interface abstract class
 * Method types Only abstract (until Java 7), default/static allowed since Java
 * 8 Abstract + Concrete
 * Constructors allowed ❌ No ✅ Yes
 * Multiple inheritance ✅ Yes ❌ No (only one class)
 * Variables public static final only Any type (instance fields allowed)
 * 
 * ✅ When to use:
 * Use Case Prefer
 * You want to enforce a contract or API Interface
 * You need constructors or instance fields Abstract class
 * You want multiple inheritance of type Interface
 * You want partial implementation Abstract class
 */