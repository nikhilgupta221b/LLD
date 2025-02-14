package StructuralPatterns.DecoratorPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        pizza = new PaneerDecorator(pizza);
        pizza = new OnionTomatoDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
