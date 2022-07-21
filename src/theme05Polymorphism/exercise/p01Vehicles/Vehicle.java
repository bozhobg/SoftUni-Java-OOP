package theme05Polymorphism.exercise.p01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption; // l/km

    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected double getBaseFuelConsumption() {
        return fuelConsumption;
    }

    protected abstract double getSummerFuelConsumption();

    protected boolean canDriveSummer(double km) {
        return getSummerFuelConsumption() * km < getFuelQuantity();
    }

    private DecimalFormat decimalFormatter() {
        return new DecimalFormat("#.##");
    }

    protected void executeCommand(String command, Vehicle vehicle, double value) {
        String vehicleType = vehicle.getClass().getSimpleName();

        switch (command) {
            case "Drive":
                System.out.format("%s %s%n", vehicleType, vehicle.driving(value));
                break;

            case "Refuel":
                vehicle.refueling(value);
                break;
        }
    }

    protected String driving(double km) {
        if (canDriveSummer(km)) {

            this.setFuelQuantity(getFuelQuantity() - km * getSummerFuelConsumption());

            return String.format("travelled %s km", decimalFormatter().format(km));
        } else {

            return "needs refueling";
        }
    }

    protected abstract void refueling(double l);

}
