public class Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.prey();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void prey();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Bear eats grass");
    }

    public void prey() {
        System.out.println("Bear preys on small animals");
    }
}