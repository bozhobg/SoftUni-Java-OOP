package theme01WorkingWithAbstraction.exercise.p05JediGalaxy;

public class Evil {

    public static void moveEvil(int currentRow, int currentCol, StarsField field) {
        while (currentRow >= 0 && currentCol >= 0) {
            if (field.inBounds(currentRow, currentCol)) {
                field.setValue(currentRow, currentCol, 0);
            }
            currentRow--;
            currentCol--;
        }
    }
}
