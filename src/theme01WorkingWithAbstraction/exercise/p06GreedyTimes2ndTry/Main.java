
package theme01WorkingWithAbstraction.exercise.p06GreedyTimes2ndTry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());

        String[] safeContents = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(capacity);

        for (int i = 0; i < safeContents.length; i += 2) {
            String itemName = safeContents[i];
            long itemAmount = Long.parseLong(safeContents[i + 1]);

            if (itemName != null && !itemName.trim().isEmpty()){
                if (itemName.length() == 3) {
                    bag.addCash(itemName, itemAmount);
                } else if (itemName.toLowerCase().endsWith("gem")) {
                    bag.addGem(itemName, itemAmount);
                } else if (itemName.toLowerCase().equals("gold")) {
                    bag.addGold(itemAmount);
                }
            }

        }

        bag.printFinal();
    }
}