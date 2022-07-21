package solid.products;

public class Lemonade implements Product, Drink {

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    private double milliliters;

    public Lemonade(double milliliters) {
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
