package theme02Encapsulation.exercise.p03ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");

        Map<String, Person> mapPeople = new LinkedHashMap<>();
        Map<String, Product> mapProducts = new LinkedHashMap<>();

        for (String aPerson : people) {
            String[] personalData = aPerson.split("=");
            String name = personalData[0];
            double money = Double.parseDouble(personalData[1]);

            try {
                Person person = new Person(name, money);
                mapPeople.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        for (String aProduct : products) {
            String[] productData = aProduct.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);
                mapProducts.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String input = scanner.nextLine();

        while(!"END".equals(input)) {
            String[] tokens = input.split(" ");
            String personName = tokens[0];
            String productName = tokens[1];

            Person person = mapPeople.get(personName);
            Product product = mapProducts.get(productName);

            try {
                person.buyProduct(product);
                System.out.println(person.getName() + " bought " + product.getName());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }

        mapPeople.values().forEach(x -> System.out.println(x.getInfo()));

    }
}
