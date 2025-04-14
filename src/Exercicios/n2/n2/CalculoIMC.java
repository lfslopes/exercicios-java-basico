package Exercicios.n2.n2;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println(medidasIMC(calculoIMC(altura, peso)));
    }
    public static double calculoIMC(double altura, double peso) {
        return peso / (altura * altura);
    }
    public static String medidasIMC(double imc) {
        if (imc < 18.6)
            return "Abaixo do peso";
        else if (imc >= 18.6 && imc < 25)
            return  "Peso ideal";
        else if (imc >= 25 && imc < 30)
            return  "Levemente acima do peso";
        else if (imc >= 30 && imc < 35)
            return  "Obesidade Grau I";
        else if (imc >= 35 && imc < 40)
            return  "Obesidade Grau II (Severa)";
        return  "Obesidade Grau III (Mórbida)";
    }
}
