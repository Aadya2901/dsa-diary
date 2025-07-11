public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Aadya");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }
}
/*
 * What is a Constructor in Java?
 * A constructor is a special method used to initialize objects when they are
 * created.
 * 
 * 🔹 Key Features of Constructors:
 * Feature Description
 * Name Same as class name
 * Return type None (not even void)
 * When it's called Automatically when an object is created using new
 * Purpose Initialize instance variables (fields)
 * 
 * 🔧 Types of Constructors
 * Default Constructor
 * 
 * No parameters
 * 
 * Provided automatically by Java if no constructor is defined
 * 
 * Parameterized Constructor
 * 
 * Accepts arguments
 * 
 * Allows setting values during object creation
 * 
 * 
 */