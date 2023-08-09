package exercisesoncomposition.point.rectangleandpoint;

import exercisesoncomposition.point.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(4,4);
        MyPoint bottomRight = new MyPoint(8,2);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println("Rectangle: " + rectangle);
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
