package theme02Encapsulation.exercise.p04PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setToppings(int toppingsCount) {
        if (toppingsCount < 0 || toppingsCount > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15 || name.length() < 1) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        return dough.calculateCalories() + toppings.stream().mapToDouble(topping -> topping.calculateCalories()).sum();
    }

}
