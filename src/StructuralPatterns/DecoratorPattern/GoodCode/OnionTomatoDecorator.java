package StructuralPatterns.DecoratorPattern.GoodCode;

public class OnionTomatoDecorator extends PizzaDecorator{
    public OnionTomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onion Tomato";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20;
    }
}
