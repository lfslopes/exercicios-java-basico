package Exercicios.n1.n1;

import java.util.Scanner;

import static java.time.OffsetDateTime.now;

public class NomeeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = now().getYear();

        System.out.print("Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.print("Qual o ano de seu nascimento? ");
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}
