package theme05Polymorphism.exercise.p02VehiclesExtension;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] tokens = getTokens(scanner);
        Vehicle car = new Car(tokens[0], tokens[1], tokens[2]);

        tokens = getTokens(scanner);
        Vehicle truck = new Truck(tokens[0], tokens[1], tokens[2]);

        tokens = getTokens(scanner);
        Vehicle bus = new Bus(tokens[0], tokens[1], tokens[2]);

        int countCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countCommand; i++) {
            String[] commandInput = scanner.nextLine().split(" ");

            String command = commandInput[0];
            String vehicle = commandInput[1];
            double value = Double.parseDouble(commandInput[2]);

            switch (vehicle) {
                case "Car":
                    car.executeCommand(command, car, value);
                    break;

                case "Truck":
                    truck.executeCommand(command, truck, value);
                    break;

                case "Bus":
                    bus.executeCommand(command, bus, value);
                    break;
            }

        }

        System.out.println("Car: "
                + new DecimalFormat("#.00").format(car.getFuelQuantity()));

        System.out.println("Truck: "
                + new DecimalFormat("#.00").format(truck.getFuelQuantity()));

        System.out.println("Bus: "
                + new DecimalFormat("#.00").format(bus.getFuelQuantity()));

    }

    private static double[] getTokens(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split(" "))
                .skip(1)
                .mapToDouble(Double::parseDouble)
                .toArray();
    }



}
