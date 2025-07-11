public class Hybrid_Example {

    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
        f.swim();

        Bird b = new Bird();
        b.eat();
        b.fly();

        Mammal m = new Mammal();
        m.eat();
        m.walk();

        Tuna t = new Tuna();
        t.eat();
        t.swim();
        t.hide();

        Shark s = new Shark();
        s.eat();
        s.swim();
        s.prey();

        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.walk();
        c.meow();

        Human h = new Human();
        h.eat();
        h.walk();
        h.sleep();
    }

}

class Animal1 {
    String color;

    void eat() {
        System.out.println("Animal eats");
    }
}

class Fish extends Animal1 {
    int fins;

    void swim() {
        System.out.println("Fish swims");
    }
}

class Bird extends Animal1 {
    int wings;

    void fly() {
        System.out.println("Bird flies");
    }
}

class Mammal extends Animal1 {
    int legs;

    void walk() {
        System.out.println("Mammal walks");
    }
}

class Tuna extends Fish {
    int gills;

    void hide() {
        System.out.println("Tuna hides");
    }
}

class Shark extends Fish {
    int gills;

    void prey() {
        System.out.println("Shark preys");
    }
}

class Dog extends Mammal {
    String breed;

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    int claws;

    void meow() {
        System.out.println("Cat meows");
    }
}

class Human extends Mammal {
    String height;

    void sleep() {
        System.out.println("Human sleeps");
    }
}

class Peacock extends Bird {
    int feathers;

    void dance() {
        System.out.println("Peacock dances");
    }
}

/*
 * interface Swimmable {
 * void swim();
 * }
 * 
 * interface Walkable {
 * void walk();
 * }
 * 
 * class Amphibian extends Animal implements Swimmable, Walkable {
 * public void swim() {
 * System.out.println("Amphibian swims");
 * }
 * 
 * public void walk() {
 * System.out.println("Amphibian walks");
 * }
 * }
 * 
 * 
 * Amphibian a = new Amphibian();
 * a.eat(); // from Animal
 * a.swim(); // from Swimmable
 * a.walk(); // from Walkable
 * 
 */