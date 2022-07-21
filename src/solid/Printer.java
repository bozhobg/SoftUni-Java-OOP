package solid;

import solid.products.Food;
import solid.products.Product;

import java.util.List;

public class Printer {

//    Calories:

    public static void printSumCalories(List<Product> products) {
        System.out.printf((PrinterFormatter.CALORIES_SUM) + "%n", new CalorieCalculator().sum(products));
    }

    public static void printAverageCalories(List<Product> products) {
        System.out.printf((PrinterFormatter.CALORIES_AVERAGE) + "%n", new CalorieCalculator().average(products));
    }

//    KG:

//    public static void printSumKg(List<Food> foods) {
//        System.out.printf((PrinterFormatter.KG_SUM) + "%n", new QuantityCalculator().sum(foods));
//    }
//
//    public static void printAverageKg(List<Food> foods) {
//        System.out.printf((PrinterFormatter.KG_AVERAGE) + "%n", new QuantityCalculator().average(foods));
//    }

}
