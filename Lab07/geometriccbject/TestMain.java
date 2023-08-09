package geometriccbject;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject object1 = new Circle(2.0);
        System.out.println(object1);
        System.out.println("Area: " + object1.getArea());
        System.out.println("Perimeter: " + object1.getPerimeter());

        GeometricObject object2 = new Rectangle(2.0, 6.0);
        System.out.println(object2);
        System.out.println("Perimeter: " + object2.getPerimeter());
        System.out.println("Area: " + object2.getArea());
    }
}
