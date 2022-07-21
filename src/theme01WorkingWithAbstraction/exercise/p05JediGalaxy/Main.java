package theme01WorkingWithAbstraction.exercise.p05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = parseIntArray(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

//        int[][] matrix = new int[rows][cols];
        StarsField starsField = new StarsField(rows, cols);
        Galaxy galaxy = new Galaxy(starsField);
//        int value = 0;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = value++;
//            }
//        }

        String command = scanner.nextLine();
        long sum = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = parseIntArray(command);
            int[] evilPosition = parseIntArray(scanner.nextLine());

            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];
            galaxy.moveEvil(evilRow, evilCol);

//            while (evilRow >= 0 && evilCol >= 0) {
//                if (evilRow >= 0 && evilRow < matrix.length && evilCol >= 0 && evilCol < matrix[0].length) {
//                    matrix[evilRow][evilCol] = 0;
//                }
//                evilRow--;
//                evilCol--;
//            }

            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];
            sum += galaxy.moveJedi(jediRow, jediCol);

//            while (jediRow >= 0 && jediCol < matrix[1].length) {
//                if (jediRow >= 0 && jediRow < matrix.length && jediCol >= 0 && jediCol < matrix[0].length) {
//                    sum += matrix[jediRow][jediCol];
//                }
//
//                jediCol++;
//                jediRow--;
//            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int[] parseIntArray(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
