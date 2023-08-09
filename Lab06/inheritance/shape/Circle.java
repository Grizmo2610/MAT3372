package inheritance.shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(Shape shape, double radius) {
        super(shape.getColor(), shape.isFilled());
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ", radius=" + radius +
                ']';
    }
}
