package MSystem;

import Factories.ConcretePizzaFactory;

import java.time.DayOfWeek;

public class PizzaioloCalabresa extends Pizzaiolo {

    public PizzaioloCalabresa(DayOfWeek diaDaSemana) {
        super(diaDaSemana);
        setEscalaDeTrabalho();
    }

    @Override
    public void setEscalaDeTrabalho() {
        if (getDiaDeTrabalho().equals(DayOfWeek.MONDAY)) {
            super.setEstaTrabalhando(true);
        }

        if (getDiaDeTrabalho().equals(DayOfWeek.WEDNESDAY)) {
            super.setEstaTrabalhando(true);
        }

        if (getDiaDeTrabalho().equals(DayOfWeek.FRIDAY)) {
            super.setEstaTrabalhando(true);
        }
    }

    @Override
    public Pizza fazPizza() {
        Pizza pizza;
        if (super.getEstaTrabalhando())
            pizza = new ConcretePizzaFactory().criaPizza(Sabor.CALABRESA);
        else
            throw new IllegalArgumentException("PIZZAIOLO_NÃO_ESTÁ_EM_TRABALHO");

        return pizza;
    }
}
