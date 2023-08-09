package exercisesoncomposition.point.pointandline;

import exercisesoncomposition.point.MyPoint;

public class MyLineTest {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1,1);
        MyPoint end = new MyPoint(2,2);
        MyLine line = new MyLine(begin,end);

        System.out.println("Line: " + line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient:" + line.getGradient());
    }
}
