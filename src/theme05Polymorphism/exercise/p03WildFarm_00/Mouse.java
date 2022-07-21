package theme05Polymorphism.exercise.p03WildFarm_00;

public class Mouse extends Mammal {


    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food foodGiven) {
        if (foodGiven instanceof Vegetable){
            Integer foodQuantity = foodGiven.getFoodQuantity();
            super.foodEaten += foodQuantity;
        } else {
            System.out.println(super.wrongFoodMessage());
        }
    }

//    @Override
//    protected String wrongFoodMessage() {
//        return "Mice are not eating that type of food!";
//    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

}
