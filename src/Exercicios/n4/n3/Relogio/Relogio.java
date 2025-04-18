package Exercicios.n4.n3.Relogio;

import Exercicios.n4.n3.RelogioException.RelogioException;

public abstract class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio(int horas, int minutos, int segundos) {
        try {
            validarRelogio(horas, minutos, segundos);
        } catch (RuntimeException e) {
            throw new RelogioException("Input inválido para dados de um relogio");
        } finally {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
    protected abstract boolean validarRelogio(int horas, int minutos, int segundos);
    protected abstract boolean validarHora(int horas);
    protected abstract boolean validarMinuto(int minutos);
    protected abstract boolean validarSegundo(int segundos);

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHoras() {
        return this.horas;
    }
    public int getMinutos() {
        return this.minutos;
    }
    public int getSegundos() {
        return this.segundos;
    }

    public abstract String getHorario();
    public abstract void setHorario(Relogio relogio) throws RelogioException;
}
