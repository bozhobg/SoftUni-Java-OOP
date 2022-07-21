package theme03Inheritance.demoLab.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Organism o = new Organism();
        Goat goat = new Goat();
        Spider spider = new Spider();

        Organism spiderMan = new Spider();
        // how we are going to use var with declaration
        // new ... -> initializes the variable

        List<Organism> organisms = new ArrayList<>();

        organisms.add(o);
        organisms.add(goat);
        organisms.add(spider);
        organisms.add(spiderMan);

        o.weight = 13;
        o.height = 50;
        o.isHungry = false;

        goat.weight = 23;
        goat.height = 60;
        goat.isHungry = true;
        goat.milkGiven = 73;

        spider.weight = 47;
        spider.height = 63;
        spider.fliesEaten = 13;

        increaseWeight(organisms);
    }

    public static void increaseWeight(List<Organism> organisms){
        for (Organism organism : organisms) {
            organism.weight *= 2;
        }
    }
}
