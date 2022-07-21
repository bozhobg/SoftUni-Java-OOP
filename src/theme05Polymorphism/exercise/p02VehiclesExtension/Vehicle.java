package theme05Polymorphism.exercise.p02VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption; // l/km
    private double tankCapacity;


//    Vehicle {initial fuel quantity} {liters per km} {tank capacity}
    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void refueling(double refuelQuantity) {
        if (refuelQuantityNegativeZero(refuelQuantity)) {
            System.out.println("Fuel must be a positive number");

            return;
        }

        double newFuelQuantity = refuelQuantity + this.getFuelQuantity();

        if (newFuelQuantity <= this.getTankCapacity())  {
            this.fuelQuantity = newFuelQuantity;
        } else {
            System.out.println("Cannot fit fuel in tank");
        }

    }

    protected boolean refuelQuantityNegativeZero(double refuelQuantity) {
        if (refuelQuantity <= 0) {

            return true;
        }

        return false;
    }

    protected double getBaseFuelConsumption() {
        return fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    protected abstract double getIncreasedFuelConsumption();

    private DecimalFormat decimalFormatter() {
        return new DecimalFormat("#.##");
    }

    protected String driving(double km, double fuelConsumption) {

        if (fuelConsumption * km < getFuelQuantity()) {

            this.fuelQuantity = getFuelQuantity() - km * fuelConsumption;

            return String.format("travelled %s km", decimalFormatter().format(km));
        } else {

            return "needs refueling";
        }
    }

    protected void executeCommand(String command, Vehicle vehicle, double value) {
        String vehicleType = vehicle.getClass().getSimpleName();

        if ("Drive".equals(command)) {

            System.out.format("%s %s%n", vehicleType, vehicle.driving(value, getIncreasedFuelConsumption()));

        } else if ("DriveEmpty".equals(command) && "Bus".equals(vehicleType)) {

            System.out.format("%s %s%n", vehicleType, vehicle.driving(value, getBaseFuelConsumption()));

        } else if ("Refuel".equals(command)) {

            vehicle.refueling(value);

        }

    }


}
