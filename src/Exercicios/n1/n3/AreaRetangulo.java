package Exercicios.n1.n3;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        System.out.println("Área: " + (comprimento * altura));
    }
}
