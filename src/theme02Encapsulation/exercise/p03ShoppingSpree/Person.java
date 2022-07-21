package theme02Encapsulation.exercise.p03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(this.getName() + " can't afford " + product.getName());
        }

        this.money -= product.getCost();
        this.products.add(product);
    }


    public String getInfo() {
        return String.format("%s - %s"
                , this.getName()
                , products.size() > 0
                        ? this.products.stream().map(Product::getName).collect(Collectors.joining(", "))
                        : "Nothing bought");
    }
}
