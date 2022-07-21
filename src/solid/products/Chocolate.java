package solid.products;

public class Chocolate implements Product, Food {

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private final double grams;

    public Chocolate(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double getAmountOfCalories() {
        return this.getGrams() / 100 * CALORIES_PER_100_GRAMS;
    }


    @Override
    public double getKgs() {
        return this.getGrams() / 1000;
    }
}
