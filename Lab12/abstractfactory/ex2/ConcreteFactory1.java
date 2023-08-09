package abstractfactory.ex2;

public class ConcreteFactory1 implements AbstractFactory {
    public Shape createShape() {
        return new Circle();
    }

    public Color createColor() {
        return new Red();
    }
}
