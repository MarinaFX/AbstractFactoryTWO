package MSystem;

import java.time.DayOfWeek;

public abstract class Pizzaiolo {
    private DayOfWeek diaDeTrabalho;
    private boolean estaTrabalhando;

    public Pizzaiolo(DayOfWeek diaDaSemana) {
        diaDeTrabalho =  diaDaSemana;
    }

    public boolean getEstaTrabalhando() {
        return estaTrabalhando;
    }

    public DayOfWeek getDiaDeTrabalho() {
        return diaDeTrabalho;
    }

    public void setEstaTrabalhando(boolean estaTrabalhando) {
        this.estaTrabalhando = estaTrabalhando;
    }

    public abstract Pizza fazPizza();

    public abstract void setEscalaDeTrabalho();
}
