package Exercicios.n4.n3.Relogio;

import Exercicios.n4.n3.RelogioException.RelogioException;

public class RelogioAmericano extends Relogio {
    public RelogioAmericano(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    @Override
    protected boolean validarRelogio(int horas, int minutos, int segundos) {
        return validarHora(horas) &&
                validarMinuto(minutos) &&
                validarSegundo(segundos);
    }

    @Override
    protected boolean validarHora(int horas) {
        return (horas < 0) || (horas > 12);
    }

    @Override
    protected boolean validarMinuto(int minutos) {
        return (minutos < 0) || (minutos > 59);
    }

    @Override
    protected boolean validarSegundo(int segundos) {
        return (segundos < 0) || (segundos > 59);
    }

    @Override
    public String getHorario() {
        return this.getHorario() + ":" + this.getMinutos() + ":" + this.getSegundos();
    }

    @Override
    public void setHorario(Relogio relogio) throws RelogioException {
        if (relogio == null)
            throw new RelogioException("Relogio sem dados definidos");
        if (!(relogio instanceof RelogioAmericano))
            throw new RelogioException("Relógio com formato inválido");
        if (relogio.validarRelogio(relogio.getHoras(),
                relogio.getMinutos(),
                relogio.getSegundos()))
            throw new RelogioException("Relógio em formato incorreto");

        this.setHoras(relogio.getHoras());
        this.setMinutos(relogio.getMinutos());
        this.setSegundos(relogio.getSegundos());
    }
}
