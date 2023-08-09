package movable;

public class MovableCircle implements Movable{
    private int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return String.format("(%d,%d), Speed = (%d,%d), radius=%s",
                             center.x,center.y,center.xSpeed,center.ySpeed,radius);
    }
}
