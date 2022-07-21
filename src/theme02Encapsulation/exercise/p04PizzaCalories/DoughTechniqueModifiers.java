package theme02Encapsulation.exercise.p04PizzaCalories;

public enum DoughTechniqueModifiers {
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    private double doughTechniqueModifier;

    DoughTechniqueModifiers (double doughTechniqueModifier) {
        this.doughTechniqueModifier = doughTechniqueModifier;
    }

    public double getDoughTechniqueModifier() {
        return doughTechniqueModifier;
    }
}
