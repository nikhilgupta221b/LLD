package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizzas.BasePizza;
import DecoratorDesignPattern.BasePizzas.NonVegBasePizza;
import DecoratorDesignPattern.BasePizzas.VegBasePizza;
import DecoratorDesignPattern.Decorators.ExtraCheese;
import DecoratorDesignPattern.Decorators.ExtraMushroom;

public class Main {
    public static void main(String[] args) {

        // On base veg pizza we need extra mushroom and extra cheese. Total cost = 100 + 10 + 20 = 130
        BasePizza pizza1 = new ExtraMushroom(new ExtraCheese(new VegBasePizza()));
        System.out.println("Your have to pay : " + pizza1.cost() + " rupees.");

        // On base nonveg we need extra cheese. Total cost = 150 + 10 = 160
        BasePizza pizza2 = new ExtraCheese(new NonVegBasePizza());
        System.out.println("Your have to pay : " + pizza2.cost() + " rupees.");

    }
}
