public class PracticeQuestion_18_2 {
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }
}

// Automobile.drive() is private → not inherited.
// Car.drive() is a new method → gets overridden by ElectricCar.drive().
// Method is marked final in ElectricCar → can't be overridden further.
// Call is resolved using runtime polymorphism.