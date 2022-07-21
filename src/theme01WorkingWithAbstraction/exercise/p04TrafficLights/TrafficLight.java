package theme01WorkingWithAbstraction.exercise.p04TrafficLights;

public class TrafficLight {
    private Color currentColor;

    public TrafficLight(Color color) {
        this.currentColor = color;
    }

    public void changeColor() {
//    red -> green -> yellow -> red

        if (currentColor == Color.RED) {
            this.currentColor = Color.GREEN;
        } else if (currentColor == Color.GREEN) {
            this.currentColor = Color.YELLOW;
        } else if (currentColor == Color.YELLOW) {
            this.currentColor = Color.RED;
        }

    }

    public Color getCurrentColor() {
        return currentColor;
    }


}
