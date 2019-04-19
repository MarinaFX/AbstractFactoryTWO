package Factories;

import MSystem.Pizza;
import MSystem.Sabor;

public interface PizzaFactory {
    Pizza criaPizza(Sabor sabor);
}
