package Exercicios.n5.n2.Produtos;

public class Cultura implements Produtos {
    private String nome;
    private double preco;

    private final static double IMPOSTO = 0.04D; // Imposto de 4%

    public Cultura(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public void valorImposto(double valor) {
        System.out.println("Produto: " + this.getNome());
        System.out.println("Preço: R$ " + String.format("%.2f", valor));
        System.out.println("Imposto: R$ " + String.format("%.2f", valor * IMPOSTO));
        System.out.println("Valor total: R$ " + String.format("%.2f", valor + valor * IMPOSTO));
    }
}
