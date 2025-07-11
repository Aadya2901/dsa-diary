public class PracticeQuestions {
    public static void main(String[] args) {

        // Practice Question 1
        Student s = new Student();
        s.name = "Anish"; // fill here

        // Practice Question 5
        Vehicle obj1 = new Car();
        obj1.print(); // Derived class

        Vehicle obj2 = new Vehicle();
        obj2.print(); // Base class

        // // Practice Question 6
        // Vehicle2 obj3 = new Car2();
        // obj3.print2(); // ❌ ERROR at compile-time

        Vehicle2 obj4 = new Vehicle2();
        obj4.print1(); // Base class

        // Practice Question 8
        System.out.println();
        System.out.println(Book.count); // 0
        // Book b1 = new Book(150);
        // Book b2 = new Book(250);
        System.out.println(Book.count); // 2

    }
}

// Practice Question 1

class Student {
    String name;
    int marks;
}

// Practice Question 2

class Person {
    String name;
    int weight;
}

class Student2 extends Person {
    int rollNumber;
    String schoolName;
}

// class Person can only access the variables name and marks

// Practice Question 5

class Vehicle {
    void print() {
        System.out.println("Base class");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Child class");
    }
}

// Practice Question 6

class Vehicle2 {
    void print1() {
        System.out.println("Base class");
    }
}

class Car2 extends Vehicle2 {
    void print2() {
        System.out.println("Child class");
    }
}

// Practice Question 8

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

// Practice Question 3

// Which Modifier is Not Allowed in Front of a Class?
// In Java, the protected access modifier is not allowed in front of a top-level
// (outer) class.

// public class MyClass {} // ✅ Allowed
// class MyClass {} // ✅ Allowed (default access)

// protected class MyClass {} // ❌ Error
// private class MyClass {} // ❌ Error

// protected and private are meant for controlling access within packages or
// subclasses.
// private and protected can be used for inner classes, but not for top-level
// classes.

// Practice Question 4

// which of the following is a correct statement?

// class Vehicle {
// }
// class Car extends Vehicle {
// }

// a. Car c = new Car();
// b. Vehicle v = new Vehicle();
// c. Vehicle v = new Car();
// d. Car c = new Vehicle(); ❌

// Practice Question 7
// which of these is not an oops component?

// a. inheritance
// b. encapsulation
// c. polymorphism
// d. aggregation ❌

// Practice Question 9

// which line has error?

// class Test {
// static int marks;
// void set_marks (int marks) {
// this.marks = marks; // line 1
// }
// }

// class OOPS {
// public static void main(String[] args) {
// Test t = new Test();
// t.set_marks(98); // line 2
// System.out.println(Test.marks); // line 3
// }
// }

// ✅ There is no compilation error.

// Practice Question 10

// class Test{
// static int a = 10;
// static int b;
// static void changeB() {
// b = a * 3;
// }
// }

// class OOPS {
// public static void main(String[] args) {
// Test t = new Test();
// t.changeB();
// System.out.print(Test.a + Test.b); // 40 = a + b = 10 + 30