public class ConstructorTypes {
    public static void main(String[] args) {
        // 1️⃣ Default Constructor
        Student s1 = new Student();
        s1.display();

        // 2️⃣ Parameterized Constructor
        Student s2 = new Student("Aadya", 101);
        s2.display();

        // 3️⃣ Copy Constructor
        Student s3 = new Student(s2); // Copying s2 into s3
        s3.display();
    }
}

class Student {
    String name;
    int roll;

    // 1️⃣ Default Constructor
    Student() {
        name = "Unknown";
        roll = 0;
    }

    // 2️⃣ Parameterized Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    // 3️⃣ Copy Constructor
    Student(Student s) {
        name = s.name;
        roll = s.roll;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
