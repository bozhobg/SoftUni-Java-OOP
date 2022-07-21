package theme01WorkingWithAbstraction.exercise.p05JediGalaxy;

public class Jedi {

    public static long moveJedi(int currentRow, int currentCol, StarsField field) {
        long sum = 0;

        while (currentRow >= 0 && currentCol < field.getColLength()) {
            if (field.inBounds(currentRow, currentCol)) {
                sum += field.getValue(currentRow, currentCol);
            }

            currentCol++;
            currentRow--;
        }
        return sum;
    }
}
