package decorator.ex2;

public class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
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
