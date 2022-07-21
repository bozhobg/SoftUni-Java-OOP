package theme03Inheritance.lab.p04RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    public Object getRandomElement() {
        Random random = new Random();
        int randomIndex = random.nextInt(super.size());
        return remove(randomIndex);
    }
}
