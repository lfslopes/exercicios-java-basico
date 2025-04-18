package Exercicios.n5.n2;

import Exercicios.n5.n2.Produtos.Alimentos;
import Exercicios.n5.n2.Produtos.Cultura;
import Exercicios.n5.n2.Produtos.SaudeBemEstar;
import Exercicios.n5.n2.Produtos.Vestuario;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Alimentos alimento = new Alimentos("Picanha 1kg", 100.0D);
        alimento.valorImposto(alimento.getPreco());
        System.out.println("===============================================");
        SaudeBemEstar saude = new SaudeBemEstar("Sabão S.O.A.P", 5.0D);
        saude.valorImposto(saude.getPreco());
        System.out.println("===============================================");
        Vestuario vestuario = new Vestuario("Vestido Prada", 25000.0D);
        vestuario.valorImposto(vestuario.getPreco());
        System.out.println("===============================================");
        Cultura cultura = new Cultura("Livro - A história do Brasil", 124.99);
        cultura.valorImposto(cultura.getPreco());
    }
}
