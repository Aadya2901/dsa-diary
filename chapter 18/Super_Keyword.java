public class Super_Keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Color: " + h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // optional, compiler adds this automatically
        super.color = "brown"; // setting parent class variable
        System.out.println("Horse Constructor called");

    }
}

// When the line Horse h = new Horse(); runs, it creates a new Horse object.

// The Horse constructor is called.

// Inside the Horse constructor, the super(); line calls the parent class
// constructor (i.e., Animal()).

// So first, "Animal Constructor called" is printed.

// Then, the rest of the Horse constructor runs, printing "Horse Constructor
// called".
/*
 * super Keyword
 * The super keyword in Java is used inside a subclass to refer to its parent
 * class.
 * 
 * It is mainly used for:
 * 
 * Accessing parent class variables when they are hidden by child class
 * variables.
 * 
 * Calling parent class methods that are overridden in the child class.
 * 
 * Calling the constructor of the parent class from the child class constructor.
 * 
 * super is just a way for a subclass to reach back to its parent class — for
 * variables, methods, or constructors.
 */