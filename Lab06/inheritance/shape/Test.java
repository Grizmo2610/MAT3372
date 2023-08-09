package inheritance.shape;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Shape: " + shape);

        Circle circle = new Circle(shape, 5);
        System.out.println(circle);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(shape, 2, 5);
        System.out.println("Rectangle: " + rectangle);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(shape, 5);
        System.out.println("Square: " + square);

        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
