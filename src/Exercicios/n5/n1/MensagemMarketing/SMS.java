package Exercicios.n5.n1.MensagemMarketing;

public class SMS implements MensagemMarketing {
    private String nomeUsuario;
    private String numeroTelefone;

    public SMS(String nomeUsuario, String numeroTelefone) {
        this.nomeUsuario = nomeUsuario;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNomeUsuario() {
        return this.nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }
    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void mensagemMarketing(String mensagem) {
        System.out.println(this.getNomeUsuario() +
                ", dono do número " + this.getNumeroTelefone() +
                ", " + mensagem);
    }
}
