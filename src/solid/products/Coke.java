package solid.products;

public class Coke implements Product, Drink {

    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    private double milliliters;

    public Coke(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double getAmountOfCalories() {
        return DENSITY * this.getMilliliters() / 100 * CALORIES_PER_100_GRAMS;
    }

    @Override
    public double getKgs() {
        return DENSITY * this.getMilliliters() / 1000;
    }
}
