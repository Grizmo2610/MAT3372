package composition.circleandcylinder;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle: " + circle);

        System.out.println("Area of circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder (no para): " + cylinder);

        Cylinder cylinder1 = new Cylinder(10);
        System.out.println("Cylinder (height): " + cylinder1);

        Cylinder cylinder2 = new Cylinder(5, 10);
        System.out.println("Cylinder (radius and height): " + cylinder2);

        System.out.println("Volume: " + cylinder1.getVolume());
    }
}
