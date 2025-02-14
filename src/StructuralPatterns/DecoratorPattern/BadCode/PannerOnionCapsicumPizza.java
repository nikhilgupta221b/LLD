package StructuralPatterns.DecoratorPattern.BadCode;

public class PannerOnionCapsicumPizza extends PaneerPizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ", Onion Capsicum Pizza";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30;
    }
}
