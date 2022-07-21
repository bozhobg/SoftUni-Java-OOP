package theme01WorkingWithAbstraction.exercise.p01_03CardSuitsRanks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Card Ranks:");
////        for (CardSuits cardSuite : CardSuits.values()) {
////            System.out.println("Ordinal value: " + cardSuite.ordinal() + "; Name value: " + cardSuite.name());
////        }
//
////        Arrays.stream(CardSuits.values())
////                .forEach(cardSuit
////                        -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name()));
//
//        Arrays.stream(CardRanks.values())
//                .forEach(r -> System.out.printf("Ordinal value: %d; Name value: %s%n", r.ordinal(), r.name()));

        CardRanks rank = CardRanks.valueOf(scanner.nextLine().toUpperCase());
        CardSuits suit = CardSuits.valueOf(scanner.nextLine().toUpperCase());

//        Card name: {card name} of {suit name}; Card power: {power of rank + power of suit}

        System.out.printf("Card name: %s of %s; Card power: %d%n"
                , rank.name(), suit.name(), rank.getRankPower() + suit.getSuitPower());


    }
}
