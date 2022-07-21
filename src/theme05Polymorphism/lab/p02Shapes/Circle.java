package theme05Polymorphism.lab.p02Shapes;

public class Circle extends Shape {

    final private Double radius;

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    protected Double calculatePerimeter() {
        setPerimeter(2 * Math.PI * getRadius());

        return getPerimeter();
    }

    @Override
    protected Double calculateArea() {
        setArea(Math.PI * Math.pow(getRadius(), 2));

        return getArea();
    }
}
