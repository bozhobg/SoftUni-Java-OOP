package theme04InterfaceAndAbstraction.demoLab.demoLab.demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        feedAnimal(dog);
        feedAnimal(cat);



        feedAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("I am unknown animal...");
            }
        });
//      Anonymous instance
        feedAnimal(() -> System.out.println("I am unknown animal..."));
    }

    public static void feedAnimal(Animal animal) {
        animal.eat();
    }

}
