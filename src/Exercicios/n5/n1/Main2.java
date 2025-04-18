package Exercicios.n5.n1;

import Exercicios.n5.n1.MensagemMarketing.MensagemMarketing;

/**
 * Estratégia utilizando o recurso de Interface Funcional
 */
public class Main2 {
    public static void main(String[] args) {
        MensagemMarketing sms = System.out::println;
        MensagemMarketing email = System.out::println;
        MensagemMarketing redes = System.out::println;
        MensagemMarketing whatsapp = System.out::println;

        String mensagem = "Durante o período da Páscoa, " +
                "estará acontecendo uma promoção de todo o estoque por 35% OFF." +
                "\nVenha já conferir";

        sms.mensagemMarketing("Enviado marketing via SMS...\n" + mensagem);
        System.out.println("========================================");
        email.mensagemMarketing("Enviado marketing via email...\n" + mensagem);
        System.out.println("========================================");
        redes.mensagemMarketing("Enviado marketing via X...\n" + mensagem);
        System.out.println("========================================");
        whatsapp.mensagemMarketing("Enviado marketing via WhatsApp...\n" + mensagem);
    }
}
