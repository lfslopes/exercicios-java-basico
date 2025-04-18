package Exercicios.n5.n1;

import Exercicios.n5.n1.MensagemMarketing.*;

/**
 * Abordagem usando classes implementando uma interface
 * com mensagens diferentes dependendo do serviço de mensagem
 */

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS("Jorge", "73 985511448");
        Email email = new Email("Jorge", "jorge_major@gmail.com");
        WhatsApp whatsApp = new WhatsApp(sms.getNomeUsuario(), sms.getNumeroTelefone());
        RedesSociais redes = new RedesSociais("Jorge", "@majorge");

        String mensagem = "Durante o período da Páscoa, estará acontecendo uma promoção de todo o estoque por 35% OFF." +
                "\nVenha já conferir";
        sms.mensagemMarketing(mensagem);
        System.out.println("========================================================");
        email.mensagemMarketing(mensagem);
        System.out.println("========================================================");
        whatsApp.mensagemMarketing(mensagem);
        System.out.println("========================================================");
        redes.mensagemMarketing(mensagem);
    }
}
