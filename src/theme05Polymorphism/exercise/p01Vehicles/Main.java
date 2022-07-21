package theme05Polymorphism.exercise.p01Vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carTokens = scanner.nextLine().split(" ");
        double carFuel = Double.parseDouble(carTokens[1]);
        double carConsumption = Double.parseDouble(carTokens[2]);

        Vehicle car = new Car(carFuel, carConsumption);


        String[] truckTokens = scanner.nextLine().split(" ");
        double truckFuel = Double.parseDouble(truckTokens[1]);
        double truckConsumption = Double.parseDouble(truckTokens[2]);

        Vehicle truck = new Truck(truckFuel, truckConsumption);

        int countCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countCommand; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String command = tokens[0];
            String vehicle = tokens[1];
            double value = Double.parseDouble(tokens[2]);

            switch (vehicle) {
                case "Car":
                    car.executeCommand(command, car, value);
                    break;

                case "Truck":
                    truck.executeCommand(command, truck, value);
                    break;
            }

        }

        System.out.println("Car: "
                + new DecimalFormat("#.00").format(car.getFuelQuantity()));

        System.out.println("Truck: "
                + new DecimalFormat("#.00").format(truck.getFuelQuantity()));

    }

}
