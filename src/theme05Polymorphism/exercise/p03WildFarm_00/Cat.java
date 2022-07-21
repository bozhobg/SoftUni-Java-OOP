package theme05Polymorphism.exercise.p03WildFarm_00;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void eat(Food foodGiven) {
        if (foodGiven instanceof Vegetable || foodGiven instanceof Meat){
            Integer foodQuantity = foodGiven.getFoodQuantity();
            super.foodEaten += foodQuantity;
        } else {
            System.out.println(super.wrongFoodMessage());
        }
    }

    @Override
    protected String toStringFormatter() {
        return String.format("%s, %s, %s, %s, %d"
                , super.getAnimalName()
                , this.getBreed()
                , super.animalWeightFormat()
                , getLivingRegion()
                , super.getFoodEaten());
    }



    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
}
