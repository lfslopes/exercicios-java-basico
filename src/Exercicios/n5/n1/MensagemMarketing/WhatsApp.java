package Exercicios.n5.n1.MensagemMarketing;

public class WhatsApp extends SMS implements MensagemMarketing {
    public WhatsApp(String nomeUsuario, String numeroTelefone) {
        super(nomeUsuario, numeroTelefone);
    }
    @Override
    public void mensagemMarketing(String mensagem) {
        System.out.println("Olá " + this.getNomeUsuario() + ", tudo bom?");
        System.out.println(mensagem);
    }
}
