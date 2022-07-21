package theme04InterfaceAndAbstraction.exercise.p02_04MultipleImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int readCount = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> mapPeople = new HashMap<>();

        for (int i = 0; i < readCount; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            switch (tokens.length) {
                case 3:
                    String rebelGroup = tokens[2];

                    mapPeople.put(name, new Rebel(name, age, rebelGroup));

                    break;
                case 4:
                    String id = tokens[2];
                    String birthDate = tokens[3];

                    mapPeople.put(name, new Citizen(name, age, id, birthDate));

                    break;
            }
        }

        String buyerName = scanner.nextLine();

        while (!"End".equals(buyerName)) {
            if (mapPeople.containsKey(buyerName)) mapPeople.get(buyerName).buyFood();

            buyerName = scanner.nextLine();
        }

        System.out.println(mapPeople.values().stream().map(Buyer::getFood).mapToInt(e -> e).sum());

    }
}
