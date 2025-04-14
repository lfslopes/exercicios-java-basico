package Exercicios.n4.n1.Ingresso;

public class IngressoFamilia extends Ingresso {
    private int quantidade;
    private boolean desconto;

    public IngressoFamilia(double valor, String nomeFilme, boolean isDublado, int quantidade) {
        super(valor, nomeFilme, isDublado);
        this.quantidade = quantidade;
        this.desconto = getDesconto();
    }
    public IngressoFamilia(Ingresso ingresso, int quantidade) {
        super(ingresso.getValor(), ingresso.getNomeFilme(), ingresso.isDublado());
        this.quantidade = quantidade;
        this.desconto = getDesconto();
    }
    private boolean getDesconto() {
        return this.quantidade > 3;
    }

    @Override
    public double getValor() {
        double valor = super.getValor() * this.quantidade;
        if (this.desconto)
            return valor * 0.95;
        return valor;
    }
}
