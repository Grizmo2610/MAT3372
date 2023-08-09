package decorator.ex1;

public abstract class ShapeDecorator implements Shape {
    private Shape shape;

    @Override
    public abstract void draw();
}
