package theme01WorkingWithAbstraction.exercise.p06GreedyTimes60;

import java.util.Map;
import java.util.TreeMap;

public enum ItemsByType {
    Gold,
    Gem,
    Cash;

    private Map<String, Long> items;

    ItemsByType() {
        this.items = new TreeMap<>();
    }

    public void addItem(String itemName, long itemAmount) {
        this.items.putIfAbsent(itemName, 0L);
        long value = this.items.get(itemName);
        this.items.put(itemName, value + itemAmount);
    }

    public long totalAmountType() {
        return items.values().stream().mapToLong(e -> e).sum();
    }

    public String formatTypeItems() {
        StringBuilder formatter = new StringBuilder();

        items.entrySet().stream()
                .sorted((e1, e2) -> {
                    int compAlphabetical = e2.getKey().compareTo(e1.getKey());
                    if (compAlphabetical == 0) {
                        return e1.getValue().compareTo(e2.getValue());
                    } else {
                        return compAlphabetical;
                    }
                }).forEach(e -> formatter.append("##" + e.getKey() + " - " + e.getValue()).append(System.lineSeparator()));

        return formatter.toString();
    }

}
