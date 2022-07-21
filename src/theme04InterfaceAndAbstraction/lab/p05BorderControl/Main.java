package theme04InterfaceAndAbstraction.lab.p05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s");

            switch (tokens.length) {
                case 2:
                    Identifiable robot = new Robot(tokens[0], tokens[1]);
                    identifiables.add(robot);
                    break;
                case 3:
                    Identifiable citizen = new Citizen(tokens[0],Integer.parseInt(tokens[1]), tokens[2]);
                    identifiables.add(citizen);
                    break;
            }

            input = scanner.nextLine();
        }

        String fakeEnding = scanner.nextLine();

        identifiables.stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeEnding))
                .forEach(System.out::println);
    }
}
