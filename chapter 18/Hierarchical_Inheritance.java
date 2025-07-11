public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("--------");

        Cat c = new Cat();
        c.eat();
        c.meow();
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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

/*
 * Hierarchical Inheritance in Java–Explained🔹Definition:Hierarchical
 * Inheritance is when multiple classes inherit from a single parent class.
 * 
 * It forms a tree-like structure,where all subclasses share the behavior of the
 * same superclass,but may add their own specific behaviors.
 * 
 * 🔹Syntax:java Copy Edit
 * class Parent {
 * // common properties
 * }
 * 
 * class Child1 extends Parent {
 * // specific to Child1
 * }
 * 
 * class Child2 extends Parent {
 * // specific to Child2
 * }
 * 
 * 🔹 Diagram:
 * markdown
 * Copy
 * Edit
 * Animal
 * / \
 * Dog Cat
 * 🔹 Key Points:
 * Java supports hierarchical inheritance.
 * 
 * All subclasses share the common properties/methods of the parent.
 * 
 * Each subclass can also extend or override behavior.
 */