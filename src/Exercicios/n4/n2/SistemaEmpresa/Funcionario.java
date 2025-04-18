package Exercicios.n4.n2.SistemaEmpresa;

public abstract class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private final boolean isAdmin;

    public Funcionario(String nome, String email, String senha, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return this.nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    protected void setEmail(String email) {
        this.email = email;
    }
    protected void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isAdmin() {
        return this.isAdmin;
    }
    public void realizarLogin(String email, String senha) {
        if (this.email.equalsIgnoreCase(email) && this.senha.equals(senha))
            System.out.println(this.getClass().getSimpleName() + " " +
                    this.getNome() +
                    " logado com sucesso!");
        else
            System.out.println("Email ou senha incorretos!");
    }
    public void realizarLogout() {
        System.out.println(this.getClass().getSimpleName() +
                " " + this.getNome() +
                " deslogado com sucesso!");
    }
    public void alterarDados(String nome, String email) {
        this.setNome(nome);
        this.setEmail(email);
    }
    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(this.senha)){
            this.setSenha(senhaNova);
            System.out.println("Senha atualizada com sucesso!");
        } else
            System.out.println("Senha incorreta!");
    }
}
