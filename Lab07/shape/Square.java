package shape;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide() {
        return super.getLength();
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +"]";
    }
}
