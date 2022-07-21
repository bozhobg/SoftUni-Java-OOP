package theme01WorkingWithAbstraction.lab.p04HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public double getPrice() {
        double totalPrice = pricePerDay * days * season.getSeasonFactor() * discountType.getDiscountFactor();
        return totalPrice;
    }



}
