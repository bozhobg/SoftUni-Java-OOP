package theme01WorkingWithAbstraction.exercise.p05JediGalaxy;

public class StarsField {
    private int[][] starsField;

    public StarsField(int rows, int cols) {
        starsField = new int[rows][cols];
        this.fillStarsField(rows, cols);
    }

    public void fillStarsField(int rows, int cols) {
        int value = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                this.starsField[r][c] = value++;
            }
        }
    }

    public boolean inBounds(int row, int col) {
        return row >= 0 && row < this.starsField.length && col >= 0 && col < this.starsField[row].length;
    }

    public int getValue(int row, int col) {
        return this.starsField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        this.starsField[row][col] = newValue;
    }

    public int getColLength() {
        return this.starsField[1].length;
    }

}
