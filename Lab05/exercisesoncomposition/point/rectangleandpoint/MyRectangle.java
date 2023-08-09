package exercisesoncomposition.point.rectangleandpoint;

import exercisesoncomposition.point.MyPoint;

public class MyRectangle {
    private MyPoint topLeft = new MyPoint(0,0);
    private MyPoint bottomRight = new MyPoint(1,1);
    private MyPoint bottomLeft = new MyPoint(topLeft.getX(), bottomRight.getY());
    private MyPoint topRight = new MyPoint(bottomRight.getX(), topLeft.getY());

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        bottomLeft = new MyPoint(this.topLeft.getX(), bottomRight.getY());
        topRight = new MyPoint(bottomRight.getX(), this.topLeft.getY());
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
        bottomLeft = new MyPoint(this.topLeft.getX(), bottomRight.getY());
        topRight = new MyPoint(bottomRight.getX(), this.topLeft.getY());
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
        bottomLeft = new MyPoint(this.topLeft.getX(), bottomRight.getY());
        topRight = new MyPoint(bottomRight.getX(), this.topLeft.getY());
    }

    public MyPoint[] getAllRertex(){
        return new MyPoint[] {topLeft, topRight, bottomLeft, bottomRight};
    }

    public double getLength(){
        return topLeft.distance(bottomLeft);
    }
    public double getWidth(){
        return topLeft.distance(topRight);
    }

    public double getPerimeter(){
        return 2 * (getLength() + getWidth());
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "topLeft=" + topLeft + ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +", bottomRight=" + bottomRight +
                '}';
    }
}
