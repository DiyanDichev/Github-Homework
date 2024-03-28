package Day09_Polymorphism.P02Shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * radius);
        return super.getPerimeter();
    }

    @Override
    public double calculateArea() {
        super.setArea(Math.PI * (radius * radius));
        return super.getArea();
    }
}
