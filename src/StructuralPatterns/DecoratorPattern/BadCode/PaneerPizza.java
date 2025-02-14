package StructuralPatterns.DecoratorPattern.BadCode;

public class PaneerPizza extends BasePizza {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Paneer";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}
