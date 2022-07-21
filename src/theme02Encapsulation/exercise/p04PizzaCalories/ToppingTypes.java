package theme02Encapsulation.exercise.p04PizzaCalories;

public enum ToppingTypes {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private double modifierTopping;

    ToppingTypes(double modifierTopping) {
        this.modifierTopping = modifierTopping;
    }

    public double getModifierTopping() {
        return modifierTopping;
    }

}
