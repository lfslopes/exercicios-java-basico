package Exercicios.n1.n4;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade = scanner.nextInt();
        Pessoa pessoa1 = new Pessoa(nome, idade);

        scanner.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        nome = scanner.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        idade = scanner.nextInt();
        Pessoa pessoa2 = new Pessoa(nome, idade);

        System.out.println("A diferença de idade entre " + pessoa1.getNome() + " e " + pessoa2.getNome() +
                " é de " + pessoa1.diferencaIdade(pessoa2) + " anos");

        scanner.close();
    }
}
