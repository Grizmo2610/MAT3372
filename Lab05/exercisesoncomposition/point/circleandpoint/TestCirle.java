package exercisesoncomposition.point.circleandpoint;

import exercisesoncomposition.point.MyPoint;

public class TestCirle {
    public static void main(String[] args) {
        MyPoint center = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center, 5);
        MyPoint center2 = new MyPoint(3,3);
        MyCircle another = new MyCircle(center2, 3);
        System.out.println("Cirle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Another Circle" + another);
        System.out.println("Distance: " + circle.distance(another));
    }
}
