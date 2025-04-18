package Exercicios.n4.n2.SistemaEmpresa;

public class Vendedor extends Funcionario {
    private int quantidadeVendas;
    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha, false);
        this.quantidadeVendas = quantidadeVendas;
    }
    private int getQuantidadeVendas() {
        return this.quantidadeVendas;
    }
    public int ConsultarVendas() {
        return getQuantidadeVendas();
    }
    public void RealizarVenda() {
        System.out.println("Uma venda foi realizada com sucesso!");
        this.quantidadeVendas++;
    }
    public void alterarDados(String nome, String email, int quantidadeVendas) {
        this.alterarDados(nome, email);
        this.quantidadeVendas = quantidadeVendas;
    }
}
