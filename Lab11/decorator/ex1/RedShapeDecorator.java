package decorator.ex1;

public class RedShapeDecorator extends ShapeDecorator {
    private Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {

    }

    public void setRedBorder() {

    }
}
