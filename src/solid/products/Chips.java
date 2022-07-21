package solid.products;

public class Chips extends Food {

    public static final double CALORIES_PER_100_GRAMS = 529.0;


    public Chips(double grams) {
        super(grams);
    }

    public double getGrams() {
        return super.grams;
    }


    @Override
    public double getAmountOfCalories() {
        return this.getGrams() / 100 * CALORIES_PER_100_GRAMS;
    }

    @Override
    public double getKgs() {
        return getGrams() / 1000;
    }
}
