package theme05Polymorphism.exercise.p03WildFarm_00;

public class Tiger extends Feline {

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food foodGiven) {
        if (foodGiven instanceof Meat){
            Integer foodQuantity = foodGiven.getFoodQuantity();
            super.foodEaten += foodQuantity;
        } else {
            System.out.println(super.wrongFoodMessage());
        }
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
