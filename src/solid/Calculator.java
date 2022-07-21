package solid;

import solid.products.Product;

import java.util.List;

public interface Calculator {

    double sum(List<Product> items);

    default double average(List<Product> items) {
        return this.sum(items) / items.size();
    }

}
