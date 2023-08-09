package resizable;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println(circle);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Circle resizeableCircle = new ResizableCircle(2.5);
        System.out.println(resizeableCircle);

        ((Resizable) resizeableCircle).resize(200);
        System.out.println("Test resize: " + resizeableCircle);

        System.out.println("Area: " + resizeableCircle.getArea());
        System.out.println("Perimeter: " + resizeableCircle.getArea());
    }
}
