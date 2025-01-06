package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.BasePizzas.BasePizza;

public class ExtraCheese extends PizzaDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 10;
    }
}
