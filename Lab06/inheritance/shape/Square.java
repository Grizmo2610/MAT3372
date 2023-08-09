package inheritance.shape;

public class Square extends Rectangle{
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(Shape shape,double side) {
        super(shape, side, side);
    }

    public Square() {
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ']';

    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }
}
