package Exercicios.n5.n2;

import Exercicios.n5.n2.Produtos.Produtos;

import java.util.Locale;

/**
 * Usando interface funcional para retornar seu valor de imposto
 */
public class Main {
    public static void main(String[] args) {
        Produtos alimentacao = s -> System.out.println("Alimentacao: " +
                String.format(Locale.forLanguageTag("BR"),"%.1f", s) + "% de imposto");
        Produtos saudeBemEstar = s -> System.out.println("Saúde e Bem estar: " +
                String.format(Locale.forLanguageTag("BR"),"%.1f", s) + "% de imposto");
        Produtos vestuario = s -> System.out.println("Vestuário: " +
                String.format(Locale.forLanguageTag("BR"),"%.1f", s) + "% de imposto");
        Produtos cultura = s -> System.out.println("Cultura: " +
                String.format(Locale.forLanguageTag("BR"),"%.1f", s) + "% de imposto");

        alimentacao.valorImposto(1);
        saudeBemEstar.valorImposto(1.5);
        vestuario.valorImposto(2.5);
        cultura.valorImposto(4);
    }
}
