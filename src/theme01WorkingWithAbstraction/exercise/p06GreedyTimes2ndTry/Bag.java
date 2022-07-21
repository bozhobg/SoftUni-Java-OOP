package theme01WorkingWithAbstraction.exercise.p06GreedyTimes2ndTry;

import java.util.Map;
import java.util.TreeMap;

public class Bag {

    private long capacity;
    private TypeItems goldItems;
    private TypeItems gemItems;
    private TypeItems cashItems;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.goldItems = new TypeItems();
        this.gemItems = new TypeItems();
        this.cashItems = new TypeItems();
    }

    public boolean validAmount(long newAmount) {
        return capacity >= newAmount + getAllTotal();
    }

    public void addGold(long goldAmount) {
        if (validAmount(goldAmount)) {
            this.goldItems.addItem("Gold", goldAmount);
        }
    }

    public void addGem(String gemName, long gemAmount) {
        if (validAmount(gemAmount)) {
            if (gemAmount + getGemTotal() <= getGoldTotal()) {
                gemItems.addItem(gemName, gemAmount);
            }
        }
    }

    public void addCash(String cashName, long cashAmount) {
        if (validAmount(cashAmount)) {
            if (getCashTotal() + cashAmount <= getGemTotal()) {
                cashItems.addItem(cashName, cashAmount);
            }
        }
    }

    public long getGoldTotal() {
        return goldItems.getTypeTotal();
    }

    public long getGemTotal() {
        return gemItems.getTypeTotal();
    }

    public long getCashTotal(){
        return cashItems.getTypeTotal();
    }

    public long getAllTotal() {
        return getGoldTotal() + getGemTotal() + getCashTotal();
    }

    public void printFinal() {
        Map<String, TypeItems> mapTypes = new TreeMap<>();
        mapTypes.put("Cash", cashItems);
        mapTypes.put("Gold", goldItems);
        mapTypes.put("Gem", gemItems);

        mapTypes.entrySet().stream()
                .filter(e -> e.getValue().getTypeTotal() > 0)
                .sorted((e1, e2) -> Long.compare(e2.getValue().getTypeTotal(), e1.getValue().getTypeTotal()))
                .forEach(e -> System.out.printf("<%s> $%d%n%s%n"
                        , e.getKey()
                        , e.getValue().getTypeTotal()
                        , e.getValue().formatItems()));
    }

}
