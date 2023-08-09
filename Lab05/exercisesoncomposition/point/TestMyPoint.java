package exercisesoncomposition.point;

public class TestMyPoint {
    public static MyPoint[] createPointArray() {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++)
            points[i] = new MyPoint(); // Allocate each of MyPoint instances

        return points;
    }

    public static void printPoints(MyPoint[] points) {
        for (MyPoint point : points)
            System.out.println(point);
    }

    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint point1 = new MyPoint(); // Test constructor
        System.out.println(point1); // Test toString()

        // Test setters
        point1.setX(8);
        point1.setY(6);

        // Test getters
        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());

        point1.setXY(3, 0); // Test setXY()
        System.out.println(point1.getXY()[0]); // Test getXY()
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint point2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(point2);

        // Testing the overloaded methods distance()
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        System.out.println(point1.distance(5, 6));
        System.out.println(point1.distance());

        // Declare and allocate an array of MyPoint
        MyPoint[] points = createPointArray();

        // Use a loop to print all the points
        printPoints(points);
    }
}
