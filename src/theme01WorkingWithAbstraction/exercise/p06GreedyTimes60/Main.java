
package theme01WorkingWithAbstraction.exercise.p06GreedyTimes60;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());

        String[] safeContents = scanner.nextLine().split("\\s+");


        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < safeContents.length; i += 2) {
            String itemName = safeContents[i];
            long itemAmount = Long.parseLong(safeContents[i + 1]);

            if (itemName != null && !itemName.trim().isEmpty()) {
                String itemType = getType(itemName);
                bag.addItem(itemType, itemName, itemAmount);
            }
        }

        bag.printFinal();
    }

    private static String getType(String itemName) {
        String itemType = "";

        if (itemName.length() == 3) {
            itemType = "Cash";
        } else if (itemName.toLowerCase().endsWith("gem")) {
            itemType = "Gem";
        } else if (itemName.toLowerCase().equals("gold")) {
            itemType = "Gold";
        }

        return itemType;
    }
}