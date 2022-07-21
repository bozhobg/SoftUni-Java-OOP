package theme05Polymorphism.lab.p02Shapes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input;

        do {
            input = scanner.nextLine().split(" ");

            Shape shape;

            if (input.length == 1) {

                shape = new Circle(Double.parseDouble(input[0]));

            } else if (input.length == 2) {

                shape = new Rectangle(Double.parseDouble(input[0]), Double.parseDouble(input[1]));

            } else {
                continue;
            }

            shape.calculatePerimeter();
            shape.calculateArea();

            System.out.println("-------------------");
            System.out.println("Shape: " + shape.getClass().getSimpleName());

            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());

        } while (input.length != 0);
    }

}
