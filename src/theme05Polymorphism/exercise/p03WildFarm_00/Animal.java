package theme05Polymorphism.exercise.p03WildFarm_00;

import java.text.DecimalFormat;

public abstract class Animal {

    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;


    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public Animal() {

    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public String animalWeightFormat() {
        return new DecimalFormat("#.##").format(getAnimalWeight());
    }

    public Integer getFoodEaten() {
        return this.foodEaten;
    }

//
    protected String wrongFoodMessage() {
        return getAnimalType() + "s are not eating that type of food!";
    }

    public abstract void eat(Food foodGiven);

    protected abstract String toStringFormatter();

    @Override
    public String toString() {
//        {AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
        return String.format("%s[%s]"
                , getAnimalType(), toStringFormatter());
    }

    public abstract void makeSound();



}
