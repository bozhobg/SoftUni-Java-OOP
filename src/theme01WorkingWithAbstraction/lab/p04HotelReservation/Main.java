package theme01WorkingWithAbstraction.lab.p04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        {pricePerDay} {numberOfDays} {season} {discountType}

        String[] input = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season season = Season.parse(input[2]);
        DiscountType discount = DiscountType.parse(input[3]);

        PriceCalculator calculator = new PriceCalculator(pricePerDay, days, season, discount);

        System.out.printf("%.2f%n", calculator.getPrice());
    }
}
