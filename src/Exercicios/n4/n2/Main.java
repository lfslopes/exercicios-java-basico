package Exercicios.n4.n2;

import Exercicios.n4.n2.SistemaEmpresa.Atendente;
import Exercicios.n4.n2.SistemaEmpresa.Funcionario;
import Exercicios.n4.n2.SistemaEmpresa.Gerente;
import Exercicios.n4.n2.SistemaEmpresa.Vendedor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente gerente =
                new Gerente("Cléber Ribeiro", "cleberribeiro@diovendas.com",
                        "30041985");

        Funcionario vendedor1 =
                new Vendedor("Robson Andrade", "robsonvendedor@diovendas.com",
                        "AmoPatricia123", 5);
        Funcionario vendedor2 =
                new Vendedor("Pedro Peixoto", "pedropeixotovendas@diovendas.com",
                        "JorgeMiguelLucas123", 3);
        Funcionario vendedor3 =
                new Vendedor("Carla Maria", "carlavendas.maria@diovendas.com",
                        "19901221", 7);

        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add((Vendedor) vendedor1);
        vendedores.add((Vendedor) vendedor2);
        vendedores.add((Vendedor) vendedor3);


        Funcionario atendente1 =
                new Atendente("Marcia Morello", "morellomarcia@diovendas.com",
                        "TI0x12EE6F9", 100.0D);
        Funcionario atendente2 =
                new Atendente("Roberto Rodrigues", "rrodrigues@diovendas.com",
                        "SaudadesMae2020", 50.0D);
        Funcionario atendente3 =
                new Atendente("George Gentilli", "georgegentil@diovendas.com",
                        "35Processos-11Perdidos", 75.0D);
        Funcionario atendente4 =
                new Atendente("Ana Andrade", "anaan@diovendas.com",
                        "AA2005", 45.0D);
        Funcionario atendente5 =
                new Atendente("Carlos Couto", "coutocarlos@diovendas.com",
                        "PedroCertezas666", 150.0D);

        List<Atendente> atendentes = new ArrayList<>();
        atendentes.add((Atendente) atendente1);
        atendentes.add((Atendente) atendente2);
        atendentes.add((Atendente) atendente3);
        atendentes.add((Atendente) atendente4);
        atendentes.add((Atendente) atendente5);

        realizarVendas(6, (Vendedor) vendedor1);
        realizarVendas(4, (Vendedor) vendedor2);
        realizarVendas(10, (Vendedor) vendedor3);

        List<Double> valores1 = gerarListaDouble(5.0D, 10.0D, 150.0D, 7.99);
        List<Double> valores2 = gerarListaDouble(3.99, 45.0D, 100.0D);
        List<Double> valores3 = gerarListaDouble(325.50);
        List<Double> valores4 = gerarListaDouble(175.0D, 29.99);
        List<Double> valores5 = gerarListaDouble(12.99, 9.99, 85.42, 50.0D, 32.5D);


        receberPagamentos(valores1, (Atendente) atendente1);
        receberPagamentos(valores2, (Atendente) atendente2);
        receberPagamentos(valores3, (Atendente) atendente3);
        receberPagamentos(valores4, (Atendente) atendente4);
        receberPagamentos(valores5, (Atendente) atendente5);

        gerente.realizarLogin(gerente.getEmail(), "30041985");

        vendedor1.realizarLogin(vendedor1.getEmail(), "AmoPatricia123");
        vendedor2.realizarLogin(vendedor2.getEmail(), "JorgeMiguelLucas123");
        vendedor3.realizarLogin(vendedor3.getEmail(), "19901221");

        atendente1.realizarLogin(atendente1.getEmail(), "TI0x12EE6F9");
        atendente2.realizarLogin(atendente2.getEmail(), "SaudadesMae2020");
        atendente3.realizarLogin(atendente3.getEmail(), "35Processos-11Perdidos");
        atendente4.realizarLogin(atendente4.getEmail(), "AA2005");
        atendente5.realizarLogin(atendente5.getEmail(), "PedroCertezas666");

        System.out.println();

        System.out.println("*=============== INFORMAÇÕES GERAIS ===============*");
        System.out.println("=========== Gerente ===========");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Email: " + gerente.getEmail());
        System.out.println();
        System.out.println("=========== Vendedores ===========");
        for (int i = 1; i <= vendedores.size(); i++)
        {
            System.out.println("====== " + i + "º vendedor ======");
            System.out.println("Nome: " + vendedores.get(i - 1).getNome());
            System.out.println("Email: " + vendedores.get(i - 1).getEmail());
            System.out.println("Vendas: " + vendedores.get(i - 1).ConsultarVendas());
        }
        System.out.println();
        System.out.println("=========== Atendentes ===========");
        for (int i = 1; i <= atendentes.size(); i++)
        {
            System.out.println("====== " + i + "º atendente ======");
            System.out.println("Nome: " + atendentes.get(i - 1).getNome());
            System.out.println("Email: " + atendentes.get(i - 1).getEmail());
            System.out.println("Valor em caixa: R$ " +
                    String.format("%.2f", atendentes.get(i -1).getValorEmCaixa()));
        }

        System.out.println();
        System.out.println(gerente.gerarRelatorioFinanceiro(vendedores, atendentes));

        gerente.realizarLogout();

        vendedor1.realizarLogout();
        vendedor2.realizarLogout();
        vendedor3.realizarLogout();

        atendente1.realizarLogout();
        atendente2.realizarLogout();
        atendente3.realizarLogout();
        atendente4.realizarLogout();
        atendente5.realizarLogout();
    }

    public static void realizarVendas(int quantidadeVendas, Vendedor vendedor) {
        for (int i = 0; i < quantidadeVendas; i++)
            vendedor.RealizarVenda();
    }
    public static void receberPagamentos (List<Double> valorPagamento, Atendente atendente) {
        for (int i = 0; i < valorPagamento.size(); i++) {
            atendente.receberPagamento(valorPagamento.get(i));
        }
    }
    public static List<Double> gerarListaDouble (Double... valores) {
        return new ArrayList<>(Arrays.asList(valores));
    }
}
