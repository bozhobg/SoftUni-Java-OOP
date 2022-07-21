package theme05Polymorphism.exercise.p02VehiclesExtension;

public class Truck extends Vehicle {

    private static final double AC_CONSUMPTION_INCREASE = 1.6;

    protected Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected double getIncreasedFuelConsumption() {
        return super.getBaseFuelConsumption() + AC_CONSUMPTION_INCREASE;
    }

    @Override
    protected void refueling(double l) {
        super.refueling(l * 0.95);
    }
}
