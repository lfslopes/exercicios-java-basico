package Exercicios.n4.n2.SistemaEmpresa;

public class Atendente extends Funcionario {
    private double valorEmCaixa;
    private boolean isCaixaOpen;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
        this.isCaixaOpen = true;
    }

    public double getValorEmCaixa() {
        return this.valorEmCaixa;
    }
    public void receberPagamento(double valorPago) {
        if (isCaixaOpen) {
            this.valorEmCaixa += valorPago;
            System.out.println("Pagamento recebido com sucesso!");
            return;
        }
        System.out.println("Caixa fechado");
    }
    public void fecharCaixa() {
        this.isCaixaOpen = false;
    }

}
