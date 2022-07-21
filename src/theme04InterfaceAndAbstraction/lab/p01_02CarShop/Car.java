package theme04InterfaceAndAbstraction.lab.p01_02CarShop;

public interface Car {
    int TIRES = 4;

    public abstract String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
    String toString();
}
