package exercisesoncomposition.point;

public class MyPoint {
    private int x =0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }

    public double distance(int x, int y){
        return Math.sqrt((x - this.x) * (x - this.x) - (y - this.y) * (y - this.y));
    }
    public double distance(MyPoint another){
        return Math.sqrt((another.getX() - x) * (another.getX() - x)
                                 + (another.getY() - y) * (another.getY() - y));
    }
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
}
