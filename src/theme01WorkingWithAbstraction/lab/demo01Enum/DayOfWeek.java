package theme01WorkingWithAbstraction.lab.demo01Enum;

public enum DayOfWeek {
    MONDAY(1),
    FIRST_DAY(13),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNumber;

    private DayOfWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}
