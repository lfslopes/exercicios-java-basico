package Exercicios.n1.n2;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento dos lados do quadrado: ");
        double lado = scanner.nextDouble();

        System.out.println("Área: " + (lado * lado));
    }
}
