public class Single_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited from Animal
        d.bark(); // defined in Dog
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

/*
 * Single Inheritance in Java – Explained
 * 🔹 Definition:
 * Single Inheritance is a type of inheritance in which a child class (subclass)
 * inherits from only one parent class (superclass).
 * 
 * In Java, this means one class extends another class, and the child gets
 * access to the parent's fields and methods.
 * 
 * 🔹 Syntax:
 * java
 * Copy
 * Edit
 * class Parent {
 * // parent class members
 * }
 * 
 * class Child extends Parent {
 * // child class members
 * }
 * 
 * 🔹 Explanation:
 * Dog is a subclass that extends Animal.
 * 
 * It inherits the eat() method from Animal.
 * 
 * It defines its own method bark().
 * 
 * 🔹 Key Points:
 * Java supports single inheritance through extends keyword.
 * 
 * The child class inherits all non-private members (methods, variables) of the
 * parent.
 * 
 * Java does not support multiple inheritance with classes (but allows multiple
 * inheritance through interfaces).
 * 
 * 🔹 Diagram:
 * scss
 * Copy
 * Edit
 * Animal (Parent)
 * ↑
 * Dog (Child)
 */