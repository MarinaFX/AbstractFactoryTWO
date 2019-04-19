package Factories;

import MSystem.Pizzaiolo;
import MSystem.PizzaioloCalabresa;
import MSystem.PizzaioloPresunto;

import java.time.DayOfWeek;

public class ConcretePizzaioloFactory implements PizzaioloFactory {
    @Override
    public Pizzaiolo criaPizzaiolo(DayOfWeek diaDaSemana) {
        switch (diaDaSemana) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                return new PizzaioloCalabresa(diaDaSemana);
            case TUESDAY:
            case THURSDAY:
            case SATURDAY:
                return new PizzaioloPresunto(diaDaSemana);
                default:
                    throw new IllegalArgumentException("NÃO_HÁ_PIZZAIOLOS_PARA_O_DIA_DESEJADO");
        }
    }
}
