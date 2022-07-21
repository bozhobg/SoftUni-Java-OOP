package theme01WorkingWithAbstraction.exercise.p06GreedyTimes2ndTry;

import java.util.Comparator;
import java.util.TreeMap;

public class TypeItems {
    private TreeMap<String, Long> typeItems;

    public TypeItems() {
        this.typeItems = new TreeMap<String, Long>(Comparator.reverseOrder());
    }

    public void addItem(String itemName, long newAmount) {
        this.typeItems.putIfAbsent(itemName, 0L);
        long currentItemAmount = this.typeItems.get(itemName);
        this.typeItems.put(itemName, currentItemAmount + newAmount);
    }

    public long getTypeTotal() {
        return this.typeItems.values().stream().mapToLong(e -> e).sum();
    }

    public String formatItems() {
//        "##{item} - {amount}"
        StringBuilder formatter = new StringBuilder();

        this.typeItems.forEach((key, value) -> formatter.append(String.format("##%s - %d%n", key, value)));

        return formatter.toString().trim();
    }
}
