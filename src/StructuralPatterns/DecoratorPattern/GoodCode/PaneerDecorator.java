package StructuralPatterns.DecoratorPattern.GoodCode;

public class PaneerDecorator extends PizzaDecorator{
    public PaneerDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }
}
