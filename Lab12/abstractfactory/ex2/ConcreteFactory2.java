package abstractfactory.ex2;

public class ConcreteFactory2 implements AbstractFactory {
    public Shape createShape() {
        return new Rectangle();
    }

    public Color createColor() {
        return new Blue();
    }
}