package exercisesoncomposition.point.triangleandpoint;

import exercisesoncomposition.point.MyPoint;

public class MyTriangleTest {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(1,1);
        MyPoint v2 = new MyPoint(2,2);
        MyPoint v3 = new MyPoint(3,3);
        MyTriangle triangle = new MyTriangle(v1,v2,v3);

        System.out.println("Triangle: " + triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Type: " + triangle.getType());
    }
}
