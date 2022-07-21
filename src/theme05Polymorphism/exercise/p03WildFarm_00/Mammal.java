package theme05Polymorphism.exercise.p03WildFarm_00;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    protected String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight) {
        super(animalName, animalType, animalWeight);
    }

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public abstract void eat(Food foodGiven);

    @Override
    public abstract void makeSound();

    @Override
    protected String toStringFormatter() {
//        {AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}

        return String.format("%s, %s, %s, %d"
                , getAnimalName()
                , new DecimalFormat("#.##").format(getAnimalWeight())
                , getLivingRegion()
                , getFoodEaten()
                );
    }
}
