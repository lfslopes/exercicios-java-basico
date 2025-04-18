package Exercicios.n4.n3;

import Exercicios.n4.n3.Relogio.Relogio;
import Exercicios.n4.n3.Relogio.RelogioAmericano;
import Exercicios.n4.n3.Relogio.RelogioBrasileiro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Relogio relogioAmericano = new RelogioAmericano(12, 21, 35);
        Relogio relogioBrasileiro = new RelogioBrasileiro(21, 12, 34);

        System.out.println(relogioAmericano);
        System.out.println(relogioBrasileiro);

        RelogioBrasileiro relogioDigital = new RelogioBrasileiro(14, 21, 35);

        try {
            relogioBrasileiro.setHorario(relogioAmericano);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Arrays.stream(e.getStackTrace()).iterator().forEachRemaining(System.out::println);
        } finally {
            System.out.println(relogioAmericano);
        }

    }
}
