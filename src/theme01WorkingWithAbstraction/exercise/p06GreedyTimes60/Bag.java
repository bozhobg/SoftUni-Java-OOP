package theme01WorkingWithAbstraction.exercise.p06GreedyTimes60;

import java.util.Map;
import java.util.TreeMap;

public class Bag {
    private long capacity;
    private Map<String, ItemsByType> mapTypes;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.mapTypes = new TreeMap<>();
        this.mapTypes.put("Gold", ItemsByType.Gold);
        this.mapTypes.put("Gem", ItemsByType.Gem);
        this.mapTypes.put("Cash", ItemsByType.Cash);
    }

    public void addItem(String itemType, String itemName, long itemAmount) {
        if (inCapacity(itemAmount) && validTypeAmount(itemType, itemAmount)) {
            this.mapTypes.get(itemType).addItem(itemName, itemAmount);
        }
    }

    private boolean validTypeAmount(String itemType, long itemAmount) {
        switch (itemType) {
            case "Gem":
                return mapTypes.get(itemType).totalAmountType() + itemAmount <= mapTypes.get("Gold").totalAmountType();
            case "Cash":
                return mapTypes.get(itemType).totalAmountType() + itemAmount <= mapTypes.get("Gem").totalAmountType();
            case "Gold":
                return true;
            default:
                return false;
        }
    }

    private boolean inCapacity(long itemAmount) {
        return totalAmountBag() + itemAmount <= capacity;
    }

    public ItemsByType getItemsByType(String itemType) {
        return mapTypes.get(itemType);
    }

    public long totalAmountBag() {
        return mapTypes.values().stream().map(v -> v.totalAmountType()).mapToLong(v -> v).sum();
    }

    public void printFinal() {
        mapTypes.entrySet().stream()
                .filter(e -> e.getValue().totalAmountType() > 0)
                .sorted((e1,e2) -> Long.compare(e2.getValue().totalAmountType(), e1.getValue().totalAmountType()))
                .forEach(e -> System.out.printf("<%s> $%d%n%s", e.getKey(), e.getValue().totalAmountType(), e.getValue().formatTypeItems()));
    }

}
