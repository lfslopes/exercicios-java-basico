package Exercicios.n3.n1.Banco;

public class Boleto {
    private String produto;
    private int quantidade;
    private double preco;
    private double precoTotal;
    private boolean pago;

    public Boleto(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoTotal = preco * quantidade;
        this.pago = false;
    }
    public Boleto(String produto, double preco) {
        this.produto = produto;
        this.quantidade = 1;
        this.preco = preco;
        this.precoTotal = this.preco;
        this.pago = false;
    }

    public String getProduto() {
        return this.produto;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public double getPreco() {
        return this.preco;
    }
    public double getPrecoTotal() {
        return this.precoTotal;
    }
    public boolean isPago() {
        return this.pago;
    }
    public void pagar() {
        this.pago = true;
    }
    @Override
    public String toString() {
        if (this.isPago()){
            return "Produto: " + this.produto +
                    "\nQuantidade: " + this.quantidade +
                    "\nPreço do produto: R$ " + String.format("%.2f", this.preco) +
                    "\nPreço total: R$ " + String.format("%.2f", this.precoTotal) +
                    "\nBoleto pago.";
        }
        return "Produto: " + this.produto +
                "\nQuantidade: " + this.quantidade +
                "\nPreço do produto: R$ " + String.format("%.2f", this.preco) +
                "\nPreço total: R$ " + String.format("%.2f", this.precoTotal) +
                "\nBoleto pendente.";
    }
}
