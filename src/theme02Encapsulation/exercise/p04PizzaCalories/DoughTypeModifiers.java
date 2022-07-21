package theme02Encapsulation.exercise.p04PizzaCalories;

public enum DoughTypeModifiers {
    White(1.5),
    Wholegrain(1.0);


    private double modifierDoughType;

    DoughTypeModifiers(double modifierDough) {
        this.modifierDoughType = modifierDough;
    }

    public double getModifierDoughType() {
        return this.modifierDoughType;
    }
}
