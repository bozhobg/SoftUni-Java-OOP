package theme05Polymorphism.exercise.p03WildFarm_00;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Set<Mammal> animalSet = new LinkedHashSet<>();
        Set<Animal> animalSet = new LinkedHashSet<>();


        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s");

//        {AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion}
//        OR Cat {AnimalName} {AnimalWeight} {AnimalLivingRegion} {CatBreed}
//        Vegetable 4

            Animal currentAnimal = null;

            Mammal currentMammal;

            String currentType = tokens[0];
            String currentName = tokens[1];
            Double currentWeight = Double.parseDouble(tokens[2]);
            String currentLivingRegion = tokens[3];

//        TODO: Does animal exist? -> main static method, overload for a cat

//            if (!"Cat".equals(currentType)) {
//                currentMammal
//                        = animalExists(animalSet, currentType, currentName, currentWeight, currentLivingRegion);
//            } else {
//                currentCatBreed = tokens[4];
//
//                currentMammal
//                        = animalExists(animalSet, currentType, currentName, currentWeight, currentLivingRegion, currentCatBreed);
//            }

//            if (currentMammal == null) {

                switch (currentType) {
                    case "Mouse":
                        currentAnimal = new Mouse(currentName, currentType, currentWeight, currentLivingRegion);
                        break;
                    case "Zebra":
                        currentAnimal = new Zebra(currentName, currentType, currentWeight, currentLivingRegion);
                        break;
                    case "Tiger":
                        currentAnimal = new Tiger(currentName, currentType, currentWeight, currentLivingRegion);
                        break;
                    case "Cat":
                        String catBreed = tokens[4];
                        currentAnimal = new Cat(currentName, currentType, currentWeight, currentLivingRegion, catBreed);
                        break;
                }

                animalSet.add(currentAnimal);

//            }

            input = scanner.nextLine();

            String foodType = input.split(" ")[0];
            Integer foodQuantity = Integer.parseInt(input.split(" ")[1]);

            Food foodGiven = null;

            switch (foodType) {
                case "Vegetable":
                    foodGiven = new Vegetable(foodQuantity);
                    break;
                case "Meat":
                    foodGiven = new Meat(foodQuantity);
                    break;
            }

            currentAnimal.makeSound();

//            TODO: Validate command
            currentAnimal.eat(foodGiven);


//        {AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
//        OR Cat [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]

            System.out.println(currentAnimal);

            input = scanner.nextLine();
        }

    }

    public static Mammal animalExists(Set<Mammal> mammalsSet
            , String currentType, String currentName, Double currentWeight, String currentLivingRegion
            , String currentCatBreed) {

        Mammal foundMammal = null;

        for (Mammal mammal : mammalsSet) {

            if (mammal instanceof Cat) {
                if (((Cat) mammal).getBreed().equals(currentCatBreed)
                        && mammalsFieldCheck(mammal, mammalsSet, currentType, currentName, currentWeight, currentLivingRegion)
                ) {

//                TODO: Will it exit the current method / return null always
                    foundMammal = mammal;

                }
            }
        }

        return foundMammal;

    }


    private static boolean mammalsFieldCheck(Mammal mammal, Set<Mammal> mammalsSet
            , String currentType, String currentName, Double currentWeight, String currentLivingRegion) {

        return mammal.getAnimalType().equals(currentType)
                && mammal.getAnimalName().equals(currentName)
                && mammal.getAnimalWeight() == currentWeight
                && mammal.getLivingRegion().equals(currentLivingRegion);

    }

    public static Mammal animalExists(Set<Mammal> mammalsSet
            , String currentType, String currentName, Double currentWeight, String currentLivingRegion) {

        Mammal foundMammal = null;

        for (Mammal mammal : mammalsSet) {

            if (mammalsFieldCheck(mammal, mammalsSet, currentType, currentName, currentWeight, currentLivingRegion)) {

//                TODO: Will it exit the current method / return null always
                foundMammal = mammal;

            }
        }

        return foundMammal;

    }

}
