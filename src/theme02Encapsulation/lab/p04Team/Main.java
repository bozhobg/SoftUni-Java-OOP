package theme02Encapsulation.lab.p04Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            try {
                Person person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                people.add(person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        Team team = new Team("Black Eagles");

        for (Person person : people) {
            team.addPlayer(person);
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeam().size());

//        double bonus = Double.parseDouble(reader.readLine());
//
//        for (Person theme03Inheritance.exercise.person : people) {
//            theme03Inheritance.exercise.person.increaseSalary(bonus);
//            System.out.println(theme03Inheritance.exercise.person.toString());
//        }
    }

}
