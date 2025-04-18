package Exercicios.n4.n3.Relogio;

import Exercicios.n4.n3.RelogioException.RelogioException;

public abstract class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio(int horas, int minutos, int segundos) {
        try {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } catch (RuntimeException e) {
            throw new RelogioException("Input inválido para dados de um relogio");
        }
    }
    protected abstract boolean validarRelogio(int horas, int minutos, int segundos);
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
}
