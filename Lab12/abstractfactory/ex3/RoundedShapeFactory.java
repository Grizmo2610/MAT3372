package abstractfactory.ex3;

public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape() {
        return new RoundedRectangle();
    }
}
