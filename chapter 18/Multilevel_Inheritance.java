public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark(); // from Dog
        p.eat(); // from Animal
        p.weep(); // from Puppy
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

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

/*
 * Multilevel Inheritance in Java – Explained
 * 🔹 Definition:
 * Multilevel Inheritance is a type of inheritance where a class is derived from
 * a child class which is already derived from another class.
 * 
 * It forms a chain of inheritance.
 * 
 * 🔹 Syntax:
 * java
 * Copy
 * Edit
 * class A {
 * // Base class
 * }
 * 
 * class B extends A {
 * // Derived from A
 * }
 * 
 * class C extends B {
 * // Derived from B (and indirectly from A)
 * }
 * 
 * 🔹 Key Points:
 * Java supports multilevel inheritance.
 * 
 * Each derived class inherits all non-private members from its superclass.
 * 
 * The inheritance can go any number of levels deep.
 * 
 * Constructors are called from top to bottom (i.e., Animal → Dog → BabyDog).
 */