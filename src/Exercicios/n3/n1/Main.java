package Exercicios.n3.n1;

import Exercicios.n3.n1.Banco.Boleto;
import Exercicios.n3.n1.Banco.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(100);
        ContaBancaria conta2 = new ContaBancaria(2000);

        Boleto boleto = new Boleto("Café Premium", 50.00);
        Boleto boleto2 = new Boleto("Leite Condensado 350mL", 6.50);
        Boleto boleto3 = new Boleto("Ventilador Arno", 110);

        conta1.pagarBoleto(boleto3);
        System.out.println(boleto3);
        System.out.println(conta1);
        conta1.depositar(100);
        conta1.pagarBoleto(boleto);
        System.out.println(conta1);
    }
}
