package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.BasePizzas.BasePizza;

public class ExtraMushroom extends PizzaDecorator{
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost () {
        return basePizza.cost() + 20;
    }
}
