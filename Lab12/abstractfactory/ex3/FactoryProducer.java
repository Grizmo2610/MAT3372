package abstractfactory.ex3;

public class FactoryProducer {
    public AbstractFactory getFactory(){
        return new ShapeFactory();
    }
}
