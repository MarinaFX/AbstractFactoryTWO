package Factories;

import MSystem.Pizza;
import MSystem.Sabor;

public class ConcretePizzaFactory implements PizzaFactory {
    @Override
    public Pizza criaPizza(Sabor sabor) {
        Pizza pizza = new Pizza();
        pizza.setPizzaFlavor(sabor);
        return pizza;
    }
}
