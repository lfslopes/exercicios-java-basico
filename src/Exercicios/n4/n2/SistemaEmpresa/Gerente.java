package Exercicios.n4.n2.SistemaEmpresa;

import java.util.List;

public class Gerente extends Funcionario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public String gerarRelatorioFinanceiro(List<Funcionario> funcionarios, List<Gerente> atendentes) {

    }
    public int ConsultarVendas (Vendedor vendedor) {
        return vendedor.ConsultarVendas();
    }
}
