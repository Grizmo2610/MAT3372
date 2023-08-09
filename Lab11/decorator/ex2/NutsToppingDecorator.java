package decorator.ex2;

public class NutsToppingDecorator extends ToppingDecorator{
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription();
    }

    @Override
    public String addTopping() {
        return null;
    }
}
