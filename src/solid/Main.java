package solid;

import solid.products.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Chocolate chocolate1 = new Chocolate(350);
        Chocolate chocolate2 = new Chocolate(175);

        Coke coke1 = new Coke(1000);
        Coke coke2 = new Coke(1500);

        Lemonade lemonade1 = new Lemonade(750);
        Lemonade lemonade2 = new Lemonade(2000);

        Chips chips1 = new Chips(175);
        Chips chips2 = new Chips(600);



        //TODO: change to interface
        List<Product> products1 = List.of(chocolate1, coke1, chips1, lemonade1, coke2, chocolate2, lemonade2, chips2);

        List<Product> products2 = List.of(chips2, chocolate1,chocolate2, chips1);

        List<Product> products3 = new ArrayList<>() {{
            add(new Chocolate(100));
            add(new Lemonade(1250));
            add(new Coke(500));
            add(new Chips(250));
            add(new Coke(2000));
            add(new Chocolate(150));
            add(new Lemonade(750));
            add(new Chips(500));
        }};

        List<Food> foods1 = List.of(chips2, chips1, chocolate1, chocolate2);

        System.out.println("Calories:");
        Printer.printSumCalories(products2);
        Printer.printAverageCalories(products2);

        System.out.println("-------------");
        System.out.println("Calories:");
        Printer.printSumCalories(products1);
        Printer.printAverageCalories(products1);

        System.out.println("-------------");
        System.out.println("Calories:");
        Printer.printSumCalories(products3);
        Printer.printAverageCalories(products3);

        System.out.println("-------------");
        System.out.println("Kilograms:");
//        Printer.printSumKg(foods1);
//        Printer.printAverageKg(foods1);




    }
}
