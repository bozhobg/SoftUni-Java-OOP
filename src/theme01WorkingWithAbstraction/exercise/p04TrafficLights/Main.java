package theme01WorkingWithAbstraction.exercise.p04TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> colorsLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colorsLights) {
            TrafficLight trafficLight = new TrafficLight(Color.valueOf(color));
            trafficLights.add(trafficLight);
        }

        int changeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < changeCount; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getCurrentColor().name() + " ");
            }
            System.out.println();
        }
    }
}
