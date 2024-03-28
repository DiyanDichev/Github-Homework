package Day09_Polymorphism.P02Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0, 5.0);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        Shape circle = new Circle(6.0);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
