package theme01WorkingWithAbstraction.lab.p02PointInRectangle;

public class Rectangle {
    private Point A;
    private Point C;

    public Rectangle(Point A, Point C) {
        this.A = A;
        this.C = C;
    }

    public boolean contains(Point point) {
        return point.getX() >= A.getX() && point.getX() <= C.getX() &&
                point.getY() >= A.getY() && point.getY() <= C.getY();
    }
}
