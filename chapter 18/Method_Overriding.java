public class Method_Overriding {
    public static void main(String[] args) {
        Animal a; // reference of superclass

        a = new Dog(); // object of subclass
        a.sound(); // Dog's version is called

        a = new Cat(); // object of another subclass
        a.sound(); // Cat's version is called
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

/*
 * Runtime Polymorphism in Java
 * (Also known as Method Overriding or Dynamic Polymorphism)
 * 
 * 🔹 Definition:
 * Runtime polymorphism allows a subclass to provide a specific implementation
 * of a method that is already defined in its superclass.
 * ➡️ The method that gets called is decided at runtime, based on the actual
 * object type, not the reference type.
 * 
 * ✅ Achieved by:
 * ✔️ Method Overriding
 * ✔️ Inheritance
 * ✔️ Upcasting (reference of parent type pointing to child object)
 * 
 * 🔍 How it works:
 * At runtime, Java looks at the actual object type (not the reference type).
 * 
 * Even though a is of type Animal, the actual object is Dog or Cat.
 * 
 * So the overridden method in the subclass is executed.
 * 
 * 🧠 Real-Life Analogy:
 * Suppose:
 * 
 * Animal is a remote control.
 * 
 * Dog and Cat are different TV brands.
 * 
 * The same remote (Animal) works, but when connected to a Dog TV, it plays
 * barking; for a Cat TV, it meows.
 * 
 * ✅ Summary Table:
 * Feature Runtime Polymorphism
 * Achieved by Method Overriding
 * Decided at Runtime
 * Requires Inheritance? ✅ Yes
 * Requires Overriding? ✅ Yes
 * Supports dynamic binding ✅ Yes
 * 
 * 🔴 Compile-time vs Runtime Polymorphism
 * Feature Compile-time (Overloading) Runtime (Overriding)
 * Binding type Static Binding Dynamic Binding
 * Method signature Must differ Must be same
 * Inheritance needed? ❌ No ✅ Yes
 * Decided at Compile Time Runtime
 * 
 */