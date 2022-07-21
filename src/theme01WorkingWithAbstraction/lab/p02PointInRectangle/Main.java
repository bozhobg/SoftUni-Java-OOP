package theme01WorkingWithAbstraction.lab.p02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectCoord = parseCoordinates(scanner);

        Rectangle rect = new Rectangle(new Point(rectCoord[0], rectCoord[1]), new Point(rectCoord[2], rectCoord[3]));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] pointCoord = parseCoordinates(scanner);
            Point checkPoint = new Point(pointCoord[0], pointCoord[1]);

            System.out.println(rect.contains(checkPoint));
        }

    }

    private static int[] parseCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
