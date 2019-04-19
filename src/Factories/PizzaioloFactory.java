package Factories;

import MSystem.Pizzaiolo;

import java.time.DayOfWeek;

public interface PizzaioloFactory {
    Pizzaiolo criaPizzaiolo(DayOfWeek diaDaSemana);
}
