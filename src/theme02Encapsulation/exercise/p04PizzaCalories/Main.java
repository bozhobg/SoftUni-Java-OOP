package theme02Encapsulation.exercise.p04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Pizza {pizzaName} {numberOfToppings}
        String[] pizzaData = scanner.nextLine().split("\\s+");

//        Dough {flourType} {bakingTechnique} {weightInGrams}
        String[] doughData = scanner.nextLine().split("\\s+");

//        until "END"
//        Topping {toppingType} {weightInGrams}

        String toppingInput = scanner.nextLine();

        try {

            Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
            Dough dough = new Dough(doughData[1], doughData[2], Double.parseDouble(doughData[3]));
            pizza.setDough(dough);

            while (!"END".equals(toppingInput)) {
                String[] toppingData = toppingInput.split("\\s+");
                Topping topping = new Topping(toppingData[1], Double.parseDouble(toppingData[2]));
                pizza.addTopping(topping);

                toppingInput = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
