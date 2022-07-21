package theme03Inheritance.exercise.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        while (!"Beast!".equals(animalType)) {
            String[] animalData = scanner.nextLine().split("\\s");
            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];

            try {
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog.toString());
                        break;
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat.toString());
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog.toString());
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten.toString());
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat.toString());
                        break;
                }
//
//                if ("Dog".equals(animalType)) {
//                    Dog animal = new Dog(name, age, gender);
//                    System.out.println(animal.toString());
//                } else if ("Cat".equals(animalType)) {
//                    Cat animal = new Cat(name, age, gender);
//                    System.out.println(animal.toString());
//                } else if ("Frog".equals(animalType)) {
//                    Frog animal = new Frog(name, age, gender);
//                    System.out.println(animal.toString());
//                } else if ("Kitten".equals(animalType)) {
//                    Kitten animal = new Kitten(name, age, gender);
//                    System.out.println(animal.toString());
//                } else if ("Tomcat".equals(animalType)) {
//                    Tomcat animal = new Tomcat(name, age, gender);
//                    System.out.println(animal.toString());
//                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animalType = scanner.nextLine();
        }

    }
}
