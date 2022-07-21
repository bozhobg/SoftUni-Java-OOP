package theme02Encapsulation.exercise.p01ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        checkForNegativeArgument(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        checkForNegativeArgument(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        checkForNegativeArgument(height, "Height");
        this.height = height;
    }

    public void checkForNegativeArgument(double value, String argumentName) {
        if (value <= 0) {
            throw new IllegalArgumentException(argumentName + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * width * height + 2 * length * height;
    }

    public double calculateVolume() {
        return width * length * height;
    }

}
