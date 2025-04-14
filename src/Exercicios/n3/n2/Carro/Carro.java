package Exercicios.n3.n2.Carro;

import Exercicios.n3.n2.CarroExceptions.CarroException;

public class Carro {
    private boolean isLigado;
    private int marcha;
    private String nomeMarcha;
    private int velocidade;

    private final int PONTO_MORTO = 0;
    private final int MARCHA_1 = 1;
    private final int MARCHA_2 = 2;
    private final int MARCHA_3 = 3;
    private final int MARCHA_4 = 4;
    private final int MARCHA_5 = 5;
    private final int MARCHA_6 = 6;

    public Carro() {
        this.isLigado = false;
        this.marcha = PONTO_MORTO;
        this.nomeMarcha = "Ponto Morto";
        this.velocidade = 0;
    }

    public void ligar() throws CarroException {
        if (this.isLigado)
            throw new CarroException("Carro já esta ligado");
        this.isLigado = true;
    }
    public void desligar() throws CarroException {
        if (!this.isLigado)
            throw new CarroException("Carro já está desligado");
        if (this.velocidade != 0)
            throw new CarroException("Carro em movimento");
        if (this.marcha != PONTO_MORTO)
            throw new CarroException("Seu carro deve está neutro");
        this.isLigado = false;
    }
    public void acelerar() throws CarroException {
        if (!this.isLigado)
            throw new CarroException("Carro não tá ligado");
        if (this.velocidade >= 120)
            throw new CarroException("Velocidade máxima atingida");
        if (this.marcha == PONTO_MORTO)
            trocarMarcha(true);

        if (this.precisaTrocarMarchaAcelerando())
            trocarMarcha(true);

        this.velocidade++;
    }
    public void frear() throws CarroException {
        if (!this.isLigado)
            throw new CarroException("Carro não tá ligado");
        if (this.velocidade <= 0)
            throw new CarroException("Carro parado");

        if (this.precisaTrocarMarchaFreando())
            trocarMarcha(false);

        this.velocidade--;
    }
    public int getVelocidade() {
        return this.velocidade;
    }
    public String getMarcha() {
        return this.nomeMarcha;
    }
    public void virar (String direcao) throws CarroException {
        if (!this.isLigado)
            throw new CarroException("Carro desligado, impossível virar!");
        if (this.velocidade < 1)
            throw new CarroException("Carro parado");
        if (this.velocidade > 40)
            throw new CarroException("Carro muito rápido");
        if (!(direcao.equalsIgnoreCase("esquerda") ||
                direcao.equalsIgnoreCase("direita")))
            throw new IllegalArgumentException("Opção inválida!");

        System.out.println("Virando para a " + direcao.toLowerCase());
    }
    public void trocarMarcha(boolean acelerar) throws CarroException {
        if (!this.isLigado)
            throw new CarroException("Não é possível trocar a marcha com o carro desligado");

        if (acelerar){
            this.marcha++;
            this.nomeMarcha = "Marcha " + this.marcha;
        } else {
            this.marcha--;
            if (this.marcha == 0)
                this.nomeMarcha = "Ponto Morto";
            else
                this.nomeMarcha = "Marcha " + this.marcha;
        }
    }

    public boolean isLigado() {
        return this.isLigado;
    }
    private boolean precisaTrocarMarchaAcelerando() {
        for (int i = 20; i < 120 ; i += 20) {
            if (this.velocidade == i)
                return true;
        }
        return false;
    }
    private boolean precisaTrocarMarchaFreando() {
        for (int i = 101; i >= 0; i -= 20) {
            if (this.velocidade == i)
                return true;
        }
        return false;
    }
}
