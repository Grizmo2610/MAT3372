package abstractfactory.ex3;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(){
        return new Rectangle();
    }
}
