package theme05Polymorphism.exercise.p01Vehicles;

public class Car extends Vehicle {

    private static final double SUMMER_CONSUMPTION_INCREASE = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void refueling(double l) {
        super.setFuelQuantity(super.getFuelQuantity() + l);
    }

    @Override
    protected double getSummerFuelConsumption() {
        return super.getBaseFuelConsumption() + SUMMER_CONSUMPTION_INCREASE;
    }
}
