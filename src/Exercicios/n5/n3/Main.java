package Exercicios.n5.n3;
import java.util.Locale;
import java.util.Scanner;

import static Exercicios.n5.n3.FormaGeometrica.*;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica quadrado = lado -> lado[0] * lado[0];
        FormaGeometrica retangulo = lado -> lado[0] * lado[1];
        FormaGeometrica circulo = raio -> PI * raio[0] + raio[0];

        Scanner scanner = new Scanner(System.in);
        int opcoes;
        double valor;
        double valor2;
        System.out.println("Qual forma geométrica deseja calcular a àrea?" +
                "\nAs opções são:" +
                "\n1. Quadrado" +
                "\n2. Retângulo" +
                "\n3. Circulo");
        opcoes = scanner.nextInt();
        switch (opcoes) {
            case 1:
                System.out.println("Informe o tamanho do lado do quadrado: ");
                valor = scanner.nextDouble();
                System.out.println("Área do quadrado: " +
                        String.format(Locale.forLanguageTag("BR"), "%.2f",quadrado.calcularArea(valor)));
                break;
            case 2:
                System.out.println("Informe a altura do retângulo: ");
                valor = scanner.nextDouble();
                System.out.println("Informe o comprimento do retângulo: ");
                valor2 = scanner.nextDouble();
                System.out.println("Área do retângulo: " +
                        String.format(Locale.forLanguageTag("BR"), "%.2f", retangulo.calcularArea(valor, valor2)));
                break;
            case 3:
                System.out.println("Informe o raio do circulo: ");
                valor = scanner.nextDouble();
                System.out.println("Área do círculo: " +
                        String.format(Locale.forLanguageTag("BR"), "%.5f", circulo.calcularArea(valor)));
                break;
            default:
                System.out.println("Opção inválida!\nEncerrando o programa.");
                break;
        }
    }
}
