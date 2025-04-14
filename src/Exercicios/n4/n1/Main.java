package Exercicios.n4.n1;

import Exercicios.n4.n1.Ingresso.Ingresso;
import Exercicios.n4.n1.Ingresso.IngressoFamilia;
import Exercicios.n4.n1.Ingresso.MeiaEntrada;

public class Main {
    public static void main() {
        Ingresso shrek5 = new Ingresso(20.0, "Shrek 5", "Dublado");
        Ingresso shrek5Meia = new MeiaEntrada(shrek5);
        Ingresso shrek5Familia = new IngressoFamilia(shrek5, 2);
        Ingresso shrek5Turma = new IngressoFamilia(shrek5, 4);

        compra("Juliana", shrek5);
        System.out.println("##########################################################");
        compra("Pedro", shrek5Meia);
        System.out.println("##########################################################");
        compra("Adelaine e Jorge", shrek5Familia);
        System.out.println("##########################################################");
        compra("Julio, Carlos, Yuri e André", shrek5Turma);
    }
    public static void compra (String pessoa, Ingresso ingresso) {
        System.out.println(pessoa + " comprou(aram) o ingresso para a estreia de "
                + ingresso.getNomeFilme() +
                " que custou R$ " + String.format("%.2f", ingresso.getValor()));
    }
}
