package theme01WorkingWithAbstraction.lab;

import java.util.Scanner;

public class p01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        noSeparationPrint(size);

    }

    private static void noSeparationPrint(int size) {
        int rows = size * 2 - 1;

        for (int i = 1; i <= rows; i++) {
            if (i <= size) {
                printRow(size, i);
            } else {
                printRow(size, rows - i + 1);
            }
            System.out.println();
        }
    }

    private static void printRow(int size, int currentStarCount) {
        for (int j = 1; j <= size - currentStarCount; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= currentStarCount; j++) {
            System.out.print("* ");
        }
    }
}
