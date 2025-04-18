package Exercicios.n5.n1.MensagemMarketing;

public class RedesSociais implements MensagemMarketing{
    private String nomeUsuario;
    private String user;

    public RedesSociais(String nomeUsuario, String user) {
        this.nomeUsuario = nomeUsuario;
        this.user = user;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void mensagemMarketing(String mensagem) {
        System.out.println("Olá " + this.getUser() + ", tudo bom?");
        System.out.println(mensagem);
    }
}
