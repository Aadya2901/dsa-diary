public class CopyConstructorExample {
    public static void main(String[] args) {
        // Original object
        Student1 s1 = new Student1("Aadya", 101);
        s1.display();

        // Copying s1 into s2 using copy constructor
        Student1 s2 = new Student1(s1);
        s2.display();
    }
}

class Student1 {
    String name;
    int roll;

    // Parameterized Constructor
    Student1(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // 🟡 Copy Constructor
    Student1(Student1 s) {
        this.name = s.name;
        this.roll = s.roll;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

// public class CopyConstructor {
// public static void main(String[] args) {
// Student s1 = new Student();
// Student s2 = new Student("Aadya");
// Student s3 = new Student(123);

// }
// }

// class Student {
// String name;
// int roll;

// Student() {
// System.out.println("Constuctor is called");
// }

// Student(String name) {
// this.name = name;
// }

// Student(int roll) {
// this.roll = roll;
// }
// }

/*
 * What is a Copy Constructor?
 * A copy constructor is a constructor that creates a new object by copying data
 * from another object of the same class.
 * 
 * ✅ Why Use a Copy Constructor?
 * To clone or duplicate objects.
 * 
 * To pass objects safely by value (instead of reference).
 * 
 * To avoid modifying the original object.
 * 
 */