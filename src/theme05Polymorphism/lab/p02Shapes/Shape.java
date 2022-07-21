package theme05Polymorphism.lab.p02Shapes;

public abstract class Shape {

    private Double area;
    private Double perimeter;

    protected Double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected Double getArea() {
        return this.area;
    }

    protected void setArea (Double area) {
        this.area = area;
    }

    protected abstract Double calculatePerimeter();

    protected abstract Double calculateArea();

}
