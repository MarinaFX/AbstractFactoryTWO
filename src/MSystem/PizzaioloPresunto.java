package MSystem;

import Factories.ConcretePizzaFactory;

import java.time.DayOfWeek;

public class PizzaioloPresunto extends Pizzaiolo {

    public PizzaioloPresunto(DayOfWeek diaDeTrabalho) {
        super(diaDeTrabalho);
        setEscalaDeTrabalho();
    }

    @Override
    public void setEscalaDeTrabalho() {
        if (getDiaDeTrabalho().equals(DayOfWeek.TUESDAY)) {
            super.setEstaTrabalhando(true);
        }

        if (getDiaDeTrabalho().equals(DayOfWeek.THURSDAY)) {
            super.setEstaTrabalhando(true);
        }

        if (getDiaDeTrabalho().equals(DayOfWeek.SATURDAY)) {
            super.setEstaTrabalhando(true);
        }
    }

    @Override
    public Pizza fazPizza() {
        Pizza pizza;
        if (super.getEstaTrabalhando())
            pizza = new ConcretePizzaFactory().criaPizza(Sabor.PRESUNTO);
        else
            throw new IllegalArgumentException("PIZZAIOLO_NÃO_ESTÁ_EM_TRABALHO");

        return pizza;
    }

}
