public class PracticeQuestion_18_4 {
    public static void main(String[] gears) {
        new BlueCar(); // 13425

    }
}

abstract class Car {
    static {
        System.out.print("1"); // Static block
    }

    public Car(String name) {
        super(); // Calls Object class constructor (implicit)
        System.out.print("2"); // Constructor body
    }

    {
        System.out.print("3"); // Instance initializer block
    }
}

class BlueCar extends Car {
    {
        System.out.print("4"); // Instance initializer of BlueCar
    }

    public BlueCar() {
        super("blue"); // Calls Car's constructor
        System.out.print("5"); // Constructor body of BlueCar
    }

}

// | Step | Output |
// | ------------------------ | ------ |
// | Static block of `Car` | 1 |
// | `Car` instance block | 3 |
// | `BlueCar` instance block | 4 |
// | `Car` constructor | 2 |
// | `BlueCar` constructor | 5 |
