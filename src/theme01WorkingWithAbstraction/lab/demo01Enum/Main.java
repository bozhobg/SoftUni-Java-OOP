package theme01WorkingWithAbstraction.lab.demo01Enum;

public class Main {
    public static void main(String[] args) {
        DayOfWeek tuesday = DayOfWeek.TUESDAY;

        System.out.println(tuesday.ordinal());
        System.out.println(tuesday.getDayNumber());
    }
}
