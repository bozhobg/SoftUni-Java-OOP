package theme05Polymorphism.lab.p03Animals;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    protected String getName() {
        return name;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }

    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s", getName(), getFavouriteFood());
    };

}
