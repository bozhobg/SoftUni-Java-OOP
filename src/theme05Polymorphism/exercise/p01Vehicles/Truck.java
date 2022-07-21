package theme05Polymorphism.exercise.p01Vehicles;

public class Truck extends Vehicle {

    private static final double SUMMER_CONSUMPTION_INCREASE = 1.6;

    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void refueling(double l) {
        super.setFuelQuantity(super.getFuelQuantity() + l * 0.95);
    }

    @Override
    protected double getSummerFuelConsumption() {
        return super.getBaseFuelConsumption() + SUMMER_CONSUMPTION_INCREASE;
    }
}
