package shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(shape1); // which version?
        System.out.println(shape1.getArea()); // which version?
        System.out.println(shape1.getPerimeter()); // which version?
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println(((Circle) shape1).getRadius()); // Downcast to Circle

        Circle circle1 = (Circle) shape1; // Downcast back to Circle
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        // Shape shape2 = new Shape ();

        Shape shape3 = new Rectangle(1.0, 2.0, "red", false); // Upcast Rectangle to Shape
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        System.out.println(((Rectangle) shape3).getLength()); // Downcast to Rectangle
        Rectangle rectangle1 = (Rectangle) shape3; // Downcast back to Rectangle
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape4 = new Square(6.6); // Upcast Square to Shape
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());

        //System.out.println((shape4.getSide())); Error

        // Take note that we downcast Shape shape4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());

        // System.out.println(rectangle2.getSide()); Error

        System.out.println(rectangle2.getLength());
        // Downcast Rectangle rectangle2 to Square
        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());

    }
}
