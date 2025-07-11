public class DefaultConstructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2(); // calls default constructor
        s1.display();
    }
}

class Student2 {
    String name;
    int roll;

    // Default Constructor
    Student2() {
        name = "Unknown";
        roll = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
