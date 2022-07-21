package theme04InterfaceAndAbstraction.exercise.p05Telephony;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Smartphone smartphone = new Smartphone(
                Arrays.asList(scanner.nextLine().split("\\s"))
                , Arrays.asList(scanner.nextLine().split("\\s"))
        );

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
