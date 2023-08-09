package composition.pointandline;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);
        System.out.println("Point: " + p1);

        Point p2 = new Point(3,3);
        Line line = new Line(p1, p2);
        System.out.println("Line: " + line);
        System.out.println("Get length: " + line.getLength());
        System.out.println("Get gradient: " + line.getGradient());

        LineSub lineSub = new LineSub(p1, p2);
        System.out.println("Line sub: " + lineSub);
        System.out.println("Get length(Line sub): " + lineSub.getLength());
        System.out.println("Get gradient(Line sub): " + lineSub.getGradient());
    }
}
