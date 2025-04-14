package Exercicios.n3.n2;

import Exercicios.n3.n2.Carro.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Testando os erros
        try{
            carro.ligar();
            for (int i = 0; i < 120; i++)
                carro.acelerar();
            System.out.println(carro.getVelocidade() + " Km/h");
            System.out.println(carro.getMarcha());
            for (int i = 0; i < 80; i++)
                carro.frear();
            System.out.println(carro.getVelocidade() + " Km/h");
            System.out.println(carro.getMarcha());
            carro.virar("DireitA");
            for (int i = 0; i < 40; i++) {
                carro.frear();
            }
            System.out.println(carro.getVelocidade() + " Km/h");
            System.out.println(carro.getMarcha());
            carro.desligar();
            if (carro.isLigado())
                System.out.println("Carro ligado");
            else
                System.out.println("Carro desligado");

        } catch (RuntimeException e) {
            System.err.println(e.toString() + e.getMessage());
            for (StackTraceElement stackTraceElement : e.getStackTrace())
                System.err.println(stackTraceElement);
        }
    }
}
