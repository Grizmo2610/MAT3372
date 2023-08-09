package inheritance.point;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,2);
        System.out.println("Point: " + point2D);

        System.out.println("(x,Y): " + Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(point2D, 2);
        System.out.println("Point 3D: " + point3D);

        System.out.println("(x,y,z): " + Arrays.toString(point3D.getXYZ()));
    }
}
