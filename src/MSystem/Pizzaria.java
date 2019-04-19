package MSystem;

import Factories.ConcretePizzaioloFactory;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pizzaria {
    private DayOfWeek diaDaSemana;
    private boolean estaFuncionando;

    public Pizzaria(LocalDate newData) {
        diaDaSemana = newData.getDayOfWeek();
        setEstaFuncionando();
    }

    private boolean getEstaFuncionando(){
        return estaFuncionando;
    }

    private void setEstaFuncionando() {
        if (diaDaSemana.equals(DayOfWeek.SUNDAY))
            estaFuncionando = false;
        else
            estaFuncionando = true;
    }

    public Pizzaiolo fazPedido() {
        Pizzaiolo pizzaiolo;

        if (estaFuncionando) {
            pizzaiolo = new ConcretePizzaioloFactory().criaPizzaiolo(diaDaSemana);
        } else {
            throw new IllegalArgumentException("Estamos fechados ¯\\_(ツ)_/¯");
        }

        return pizzaiolo;
    }
}
