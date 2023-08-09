package composition.pointandline;

public class LineSub extends Point{
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    public double getLength(){
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient(){
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + super.toString() +
                ", end=" + end +
                '}';
    }
}
