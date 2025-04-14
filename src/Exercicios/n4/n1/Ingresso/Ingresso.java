package Exercicios.n4.n1.Ingresso;

import Exercicios.n4.n1.IngressoException.IngressoException;

public class Ingresso {
    private double valor;
    private String nomeFilme;
    private boolean isDublado;

    public Ingresso(double valor, String nomeFilme, boolean isDublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.isDublado = isDublado;
    }
    public Ingresso(double valor, String nomeFilme, String isDublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        if (isDublado.equalsIgnoreCase("dublado"))
            this.isDublado = true;
        else if (isDublado.equalsIgnoreCase("legendado"))
            this.isDublado = false;
        else
            throw new IngressoException("Opção de linguagem inválida");
    }

    public double getValor() {
        return this.valor;
    }
    public String getNomeFilme() {
        return this.nomeFilme;
    }
    public boolean isDublado() {
        return this.isDublado;
    }
}
