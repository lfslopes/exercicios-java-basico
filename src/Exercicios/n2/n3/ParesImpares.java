package Exercicios.n2.n3;

import java.util.Scanner;
/**
 * No meu README eu digo que não faria algo como tratamento de excessões, contudo aqui a questão pede requisitos para que
 * a operação seja realizada, então fiz um tratamento com if-else. Eu tenho uma noção do tratamento com exceções, mas
 * decidir não implementar através desse recurso, pelo ponto do curso onde estou.
**/
public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.print("Digite um segundo número, maior que o primeiro: ");
        int numero2 = scanner.nextInt();

        //Ele só realiza a operação se o segundo número for maior que o primeiro
        if (numero >= numero2)
            System.err.println("O segundo número deve ser maior que o primeiro");
        else{
            System.out.print("Escolha entre par e ímpar: ");
            String paridade = scanner.next();
            //Se o usuário digitar açgo que não seja par ou impar (Entre as opções com ou sem acento e letra maíuscula)
            if ((!paridade.equalsIgnoreCase("par")) &&
                    (!paridade.equalsIgnoreCase("ímpar")) &&
                    (!paridade.equalsIgnoreCase("impar")))
                System.err.println("Opção inválida!");
            else {
                if (paridade.equalsIgnoreCase("par")){
                    for (int i = numero2; i >= numero; i--){
                        if (i % 2 == 0)
                            System.out.println(i);
                    }
                } else {
                    for (int i = numero2; i >= numero; i--){
                        if (i % 2 != 0)
                            System.out.println(i);
                    }
                }
            }
        }
    }
}
