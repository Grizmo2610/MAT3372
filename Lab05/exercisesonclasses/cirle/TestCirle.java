package exercisesonclasses.cirle;

public class TestCirle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("Cyan");
        System.out.println(circle);
        System.out.printf("Radius is: %.2f\n", circle.getRadius());
        System.out.printf("Color is: %s\n", circle.getColor());
        System.out.printf("Area is: %.2f\n", circle.getArea());
        System.out.printf("Circumference is: %.2f\n", circle.getCircumference());
    }
}
