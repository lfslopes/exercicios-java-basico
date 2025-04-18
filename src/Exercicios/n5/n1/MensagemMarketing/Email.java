package Exercicios.n5.n1.MensagemMarketing;

public class Email implements MensagemMarketing {
    private String nomeUsuario;
    private String email;
    public Email(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }

    public String getNomeUsuario() {
        return this.nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void mensagemMarketing(String mensagem) {
        System.out.println("Usuário: " + this.getNomeUsuario());
        System.out.println("Email: " + this.getEmail());
        System.out.println(mensagem);
    }
}
