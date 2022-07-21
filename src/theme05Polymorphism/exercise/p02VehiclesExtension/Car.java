package theme05Polymorphism.exercise.p02VehiclesExtension;

public class Car extends Vehicle {

    private static final double AC_CONSUMPTION_INCREASE = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected double getIncreasedFuelConsumption() {
        return super.getBaseFuelConsumption() + AC_CONSUMPTION_INCREASE;
    }

}
