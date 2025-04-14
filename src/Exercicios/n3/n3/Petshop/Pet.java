package Exercicios.n3.n3.Petshop;

public class Pet {
    private String nome;
    private boolean tomouBanho;

    public Pet(String nome) {
        this.nome = nome;
        tomouBanho = false;
    }
    public String getNome() {
        return this.nome;
    }
    public boolean tomouBanho() {
        return this.tomouBanho;
    }
    public void setBanho() {
        this.tomouBanho = true;
    }
}
