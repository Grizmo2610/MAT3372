package decorator.ex2;

public abstract class ToppingDecorator implements IceCream {


    public ToppingDecorator() {

    }

    @Override
    public abstract String getDescription();

    public abstract String addTopping();
}
