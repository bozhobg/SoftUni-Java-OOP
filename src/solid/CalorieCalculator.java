package solid;

import solid.products.*;

import java.util.List;

public class CalorieCalculator implements Calculator{

    public CalorieCalculator() {
    }

    public double sum(List<Product> products) {

        return products.stream()
                .map(Product::getAmountOfCalories)
                .mapToDouble(e -> e)
                .sum();

    }

    public double average(List<Product> products) {
        return this.sum(products) / products.size();
    }

}

