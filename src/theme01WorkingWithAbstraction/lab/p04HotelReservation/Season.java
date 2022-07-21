package theme01WorkingWithAbstraction.lab.p04HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int seasonFactor;

    private Season(int seasonFactor){
        this.seasonFactor = seasonFactor;
    }

    public int getSeasonFactor() {
        return this.seasonFactor;
    }

    public static Season parse(String str) {
        return Season.valueOf(str.toUpperCase());
    }
}
