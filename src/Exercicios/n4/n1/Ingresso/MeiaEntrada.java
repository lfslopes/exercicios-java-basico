package Exercicios.n4.n1.Ingresso;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, boolean isDublado) {
        super(valor, nomeFilme, isDublado);
    }
    public MeiaEntrada(double valor, String nomeFilme, String isDublado) {
        super(valor, nomeFilme, isDublado);
    }
    public MeiaEntrada(Ingresso entrada) {
        super(entrada.getValor(), entrada.getNomeFilme(), entrada.isDublado());
    }

    @Override
    public double getValor() {
        return super.getValor() / 2;
    }
}
