package Exercicios.n2.n4;

import java.util.Scanner;

/**
 * Essa questão tem um enunciado meio confuso, então talvez eu tenha interpretado de um jeito diferente do que é para
 * ser feito... \(-.-)/
 */
public class RestoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, n;
        System.out.print("Digite um valor: ");
        numero = scanner.nextInt();
        System.out.print("Digite quantos outros valores você se quer: ");
        n = scanner.nextInt();
        int [] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor para dividir " + numero + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numeros[i] >= numero) {
                System.out.println("Divisão " + numeros[i] + " / " + numero +
                        " = " + numeros[i] / numero);
                System.out.println("Resto: " + numeros[i] + " % " + numero +
                        " = " + numeros[i] % numero);
                if (numeros[i] % numero != 0){
                    System.out.println("Encontrado resto diferente de 0");
                    break;
                }
            }
        }
    }
}
