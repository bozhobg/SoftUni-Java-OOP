package theme05Polymorphism.exercise.p02VehiclesExtension;

public class Bus extends Vehicle {

    private static final double AC_CONSUMPTION_INCREASE = 1.4;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected double getIncreasedFuelConsumption() {
        return getBaseFuelConsumption() + AC_CONSUMPTION_INCREASE;
    }

}
