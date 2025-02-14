package StructuralPatterns.DecoratorPattern.BadCode;

public class BasePizza implements Pizza {
    @Override
    public double getPrice() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Base Pizza";
    }
}
