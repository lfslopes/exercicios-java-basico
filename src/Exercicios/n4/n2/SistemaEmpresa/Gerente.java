package Exercicios.n4.n2.SistemaEmpresa;

import java.util.List;

public class Gerente extends Funcionario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public String gerarRelatorioFinanceiro(List<Vendedor> vendedores, List<Atendente> atendentes) {
        int vendasTotais = 0;
        double valorTotalEmCaixa = 0;
        for (Vendedor vendedor : vendedores) {
            vendasTotais += this.ConsultarVendas(vendedor);
        }
        for (Atendente atendente : atendentes) {
            valorTotalEmCaixa += atendente.getValorEmCaixa();
        }
        return "Quantidade de vendas realizadas: " + vendasTotais + "\n" +
               "Quantidade total em caixa: " + valorTotalEmCaixa + "\n";
    }
    public int ConsultarVendas (Vendedor vendedor) {
        return vendedor.ConsultarVendas();
    }
}
