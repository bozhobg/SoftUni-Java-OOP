package theme05Polymorphism.lab.p02Shapes;

public class Rectangle extends Shape {

    final private Double height;
    final private Double width;


    public Rectangle(Double height, Double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    @Override
    protected Double calculatePerimeter() {
        super.setPerimeter(2 * (height + width));

        return super.getPerimeter();
    }

    @Override
    protected Double calculateArea() {
        super.setArea(width * height);

        return super.getArea();
    }
}
