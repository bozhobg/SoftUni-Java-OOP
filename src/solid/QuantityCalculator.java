package solid;

import solid.products.Food;
import solid.products.Product;

import java.util.List;

public class QuantityCalculator  implements Calculator{
    @Override
    public double sum(List<Product> items) {
        return 0;
    }

    @Override
    public double average(List<Product> items) {
        return Calculator.super.average(items);
    }

//    public QuantityCalculator() {
//    }
//
////    from a collection of food products their total amount in kilograms and their average value
//
//    public double sum(List<Food> foods) {
//
//        return foods.stream()
//                .map(Food::getKgs)
//                .mapToDouble(e -> e)
//                .sum();
//
//    }
//
//
//    public double average(List<Food> foods) {
//        return this.sum(foods) / foods.size();
//    }

}
