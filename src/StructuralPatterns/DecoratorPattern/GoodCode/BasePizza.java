package StructuralPatterns.DecoratorPattern.GoodCode;

public class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "BasePizza";
    }

    @Override
    public double getPrice() {
        return 150;
    }
}
