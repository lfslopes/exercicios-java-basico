package Exercicios.n4.n2;

import Exercicios.n4.n2.SistemaEmpresa.Atendente;
import Exercicios.n4.n2.SistemaEmpresa.Funcionario;
import Exercicios.n4.n2.SistemaEmpresa.Gerente;
import Exercicios.n4.n2.SistemaEmpresa.Vendedor;

public class Main2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedro", "pedros@googlemail.com", "123");
        Vendedor vendedor = new Vendedor("Jorge", "jj@googlemail.com", "123", 4);
        Atendente atendente = new Atendente("Carla", "carlam@googlemail.com", "123", 100.0D);

        printInfo(gerente);
        System.out.println();
        printInfo(vendedor);
        System.out.println();
        printInfo(atendente);
        System.out.println();

        gerente.alterarDados("Pedro Loos", "pedrols@googlemail.com");
        vendedor.alterarDados("Jorge Jenuário", "jjorge@googlemail.com");
        atendente.alterarDados("Carla Maria", "carlamaria@googlemail.com");

        printInfo(gerente);
        System.out.println();
        printInfo(vendedor);
        System.out.println();
        printInfo(atendente);
        System.out.println();
    }
    public static void printInfo (Funcionario funcionario) {
        System.out.println("Função: " + funcionario.getClass().getSimpleName());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
    }
}


