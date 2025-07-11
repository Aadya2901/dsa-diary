public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat(); // Inherited from Animal
        shark.breathe(); // Inherited from Animal
        shark.swim(); // Defined in Fish
    }
}

class Animal2 {
    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.err.println("Animal breathes");
    }
}

class Fish extends Animal2 {
    int fins;

    void swim() {
        System.err.println("Fish swims");
    }
}

/*
 * What is Inheritance?
 * Inheritance allows a class (called child or subclass) to acquire properties
 * and behaviors (fields and methods) of another class (called parent or
 * superclass).
 * 
 * It helps in code reuse and establishing relationships between classes.
 * 
 * Basic Terminology
 * Term Explanation
 * Superclass (Parent) The class whose properties are inherited
 * Subclass (Child) The class which inherits properties and can add its own
 * 
 * Syntax in Java
 * java
 * Copy code
 * class Parent {
 * // Parent class code
 * }
 * 
 * class Child extends Parent {
 * // Child inherits Parent properties and methods
 * }
 * Simple Example of Inheritance
 * java
 * Copy code
 * public class InheritanceExample {
 * public static void main(String[] args) {
 * Dog d = new Dog();
 * d.eat(); // inherited method
 * d.bark(); // own method
 * }
 * }
 * 
 * class Animal {
 * void eat() {
 * System.out.println("Animal is eating");
 * }
 * }
 * 
 * class Dog extends Animal {
 * void bark() {
 * System.out.println("Dog is barking");
 * }
 * }
 * Output:
 * csharp
 * Copy code
 * Animal is eating
 * Dog is barking
 * Key Points:
 * Dog inherits method eat() from Animal.
 * 
 * Dog can have its own methods like bark().
 * 
 * One class can extend only one superclass in Java (single inheritance).
 * 
 * super keyword is used to refer to parent class.
 * 
 * Example Using super
 * java
 * Copy code
 * class Dog extends Animal {
 * void eat() {
 * super.eat(); // calls Animal's eat method
 * System.out.println("Dog is eating");
 * }
 * }
 * Why Use Inheritance?
 * Reusability: Avoid writing the same code again.
 * 
 * Method Overriding: Customize or enhance inherited behavior.
 * 
 * Polymorphism (later topic): Use a parent class reference for child objects.
 * 
 * If you want, I can also explain:
 * 
 * Types of inheritance (single, multilevel, hierarchical)
 * 
 * Method overriding vs overloading
 * 
 * final keyword with inheritance
 * 
 * Abstract classes and interfacess
 */