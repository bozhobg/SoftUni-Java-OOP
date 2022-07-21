package theme05Polymorphism.exercise.p03WildFarm_00;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    public void eat(Food foodGiven) {
        if (foodGiven instanceof Vegetable){
            Integer foodQuantity = foodGiven.getFoodQuantity();
            super.foodEaten += foodQuantity;
        } else {
            System.out.println(super.wrongFoodMessage());
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
