// Compile-time Polymorphism in Java
// (Also called Method Overloading)

//  operator overloading is not supported in Java

public class Method_Overloading {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 5 and 3: " + c.sum(5, 3));
        System.out.println("Sum of 2.1f and 5.1f: " + c.sum(2.1f, 5.1f));
        System.out.println("Sum of 4, 5, and 6: " + c.sum(4, 5, 6));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

/*
 * Compile-time Polymorphism in Java
 * (Also called Method Overloading)
 * 
 * 🔹 Definition:
 * Compile-time Polymorphism is the ability to define multiple methods with the
 * same name but with different parameter lists (type, number, or order of
 * parameters).
 * ➡️ Java determines which method to call at compile time, based on the method
 * signature.
 * 
 * 🔹 Key Features:
 * Achieved using method overloading
 * 
 * Resolved at compile time (static binding)
 * 
 * Same method name, but different parameter types or count
 * 
 * Improves code readability and reusability
 * 
 * 🔹 How it works:
 * The compiler looks at the number and type of arguments
 * 
 * It matches them to the correct sum() method
 * 
 * The method call is resolved before the program runs
 * 
 * 🧠 Use Cases:
 * print() method in Java is overloaded in many ways
 * 
 * Constructors with different parameters
 * 
 * sort() method with various data types
 * 
 * ⚠️ Things to Remember:
 * Only parameter list matters for overloading — return type alone cannot
 * distinguish methods
 * 
 * Overloading can happen in the same class or in a subclass
 * 
 * ✅ Summary Table:
 * Feature Compile-time Polymorphism
 * Achieved by Method Overloading
 * Decision made at Compile time (static binding)
 * Same method name ✅ Yes
 * Same parameter list ❌ No
 * Inheritance required? ❌ No
 */