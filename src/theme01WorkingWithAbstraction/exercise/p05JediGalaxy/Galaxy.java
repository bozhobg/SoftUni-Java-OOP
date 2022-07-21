package theme01WorkingWithAbstraction.exercise.p05JediGalaxy;

public class Galaxy {
    private StarsField field;

    public Galaxy(StarsField field) {
        this.field = field;
    }

    public void moveEvil(int currentRow, int currentCol) {
        Evil.moveEvil(currentRow, currentCol, this.field);
    }

    public long moveJedi(int currentRow, int currentCol) {
        return Jedi.moveJedi(currentRow, currentCol, this.field);
    }
}
