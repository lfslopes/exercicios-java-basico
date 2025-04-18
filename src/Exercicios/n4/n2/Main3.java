package Exercicios.n4.n2;

import Exercicios.n4.n2.SistemaEmpresa.Atendente;
import Exercicios.n4.n2.SistemaEmpresa.Gerente;

public class Main3 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Afrodite", "afrodisiaca@olympus.com", "123");
        gerente.realizarLogin("afrodisiaca@olympus.com", "123");
        gerente.alterarSenha("123", "445");
        gerente.realizarLogout();
        gerente.realizarLogin("afrodisiaca@olympus.com", "123");
        gerente.realizarLogin("afrodisiaca@olympus.com", "445");

        Atendente atendente = new Atendente("Ares", "aresgow@olympus.com", "44444", 100.0D);
        atendente.fecharCaixa();
        atendente.receberPagamento(150.D);

    }
}
