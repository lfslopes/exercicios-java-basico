package Exercicios.n1.n4;

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public int diferencaIdade(Pessoa pessoa) {
        if (this.idade > pessoa.idade)
            return this.idade - pessoa.idade;
        return pessoa.idade - this.idade;
    }
}
