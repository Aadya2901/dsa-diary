public class Scope {

    // method scope
    public void methodScope() {
    int y = 5; // method-scope variable
    System.out.println(y);
}
// y cannot be used outside this method
    
    // block scope
    public void blockScope() {
    if (true) {
        int z = 20; // block scope
        System.out.println(z);
    }
    // System.out.println(z); // ❌ Error: z not accessible here

    // loop scope
    for (int i = 0; i < 5; i++) {
    System.out.println(i);
    }
    // System.out.println(i); // ❌ i is out of scope here

}

    
}


/*
    Scope in Java refers to the part of the program where a variable is accessible.
There are 4 main types of scope in Java:

1. Class Scope / Member Scope
Variables declared directly inside a class, but outside any method.

Also called instance or static variables.

Accessible by all methods in the class.

java
Copy code
public class MyClass {
    int x = 10; // class-level (instance) variable

    public void printX() {
        System.out.println(x); // Accessible here
    }
}
2. Method Scope / Local Scope
Variables declared inside a method.

Only accessible within that method.

Destroyed after the method finishes execution.

java
Copy code
public void show() {
    int y = 5; // method-scope variable
    System.out.println(y);
}
// y cannot be used outside this method
3. Block Scope
Variables declared inside a block {}, like if, for, or while.

Exists only within that block.

java
Copy code
public void test() {
    if (true) {
        int z = 20; // block scope
        System.out.println(z);
    }
    // System.out.println(z); // ❌ Error: z not accessible here
}
4. Loop Scope
Variables declared in loops (e.g., for) are scoped within the loop.

java
Copy code
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// System.out.println(i); // ❌ i is out of scope here
🔑 Summary:
Scope Type	Where Defined	Accessible From
Class Scope	Inside class, outside methods	All methods of the class
Method Scope	Inside a method	Only within that method
Block Scope	Inside {}	Only within that block
Loop Scope	Inside a loop	Only inside that loop
 */