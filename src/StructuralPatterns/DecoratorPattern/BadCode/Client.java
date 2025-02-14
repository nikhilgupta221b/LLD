package StructuralPatterns.DecoratorPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PannerOnionCapsicumPizza();
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getDescription());
    }
}
