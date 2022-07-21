package theme04InterfaceAndAbstraction.exercise.p02_04MultipleImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            String type = tokens[0];
            String nameOrModel = tokens[1];

            switch (type) {
                case "Citizen":
//                    Citizen {name} {age} {id} {birthdate}

                    int age = Integer.parseInt(tokens[2]);
                    String citizenId = tokens[3];
                    String citizenBD = tokens[4];

//                    Birthable citizen = new Citizen(nameOrModel, age, citizenId, citizenBD);
//                    birthables.add(citizen);

                    break;
                case "Robot":
//                    Robot {model} {id}
                    break;
                case "Pet":
//                    Pet {name} {birthdate}

                    String petBD = tokens[2];

                    birthables.add(new Pet(nameOrModel, petBD));

                    break;
            }

            input = scanner.nextLine();
        }

        String searchedBD = scanner.nextLine();

        birthables.stream().map(Birthable::getBirthDate)
                .filter(b -> b.endsWith(searchedBD))
                .forEach(System.out::println);

    }
}
