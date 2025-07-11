public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s2 = new Student("Aadya", 101); // calls parameterized constructor
        s2.display();
    }
}

class Student {
    String name;
    int roll;

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
