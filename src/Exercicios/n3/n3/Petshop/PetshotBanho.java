package Exercicios.n3.n3.Petshop;

import Exercicios.n3.n3.PetshopException.PetshopException;

public class PetshotBanho {
    private double nivelAgua;
    private double nivelSabao;
    private boolean temPetBanho;
    private boolean maquinaLimpa;


    private static final double NIVEL_MAXIMO_DE_AGUA = 30;
    private static final double NIVEL_MAXIMO_DE_SABAO = 10;

    public PetshotBanho() {
        this.nivelAgua = NIVEL_MAXIMO_DE_AGUA;
        this.nivelSabao = NIVEL_MAXIMO_DE_SABAO;
        this.maquinaLimpa = true;
        this.temPetBanho = false;
    }

    private void setBanho() {
        this.temPetBanho = !this.temPetBanho;
    }
    private void addNivelAgua() {
        this.nivelAgua += 2;
    }
    private void addNivelSabao() {
        this.nivelSabao += 2;
    }

    public double getNivelAgua() {
        return this.nivelAgua;
    }
    public double getNivelSabao() {
        return this.nivelSabao;
    }
    public boolean temPetBanho() {
        return this.temPetBanho;
    }

    public void colocarPet(Pet pet) {
        if (this.temPetBanho) {
            throw new PetshopException("JÁ TEMOS UM PET TOMANDO BANHO!");
        }
        if (pet.tomouBanho())
            throw new PetshopException(pet.getNome() + " já tomou banho!");
        this.temPetBanho = true;
    }
    public void removerPet(Pet pet) throws PetshopException {
        if (!this.temPetBanho) {
            throw new PetshopException("Não há pet no banho para retirar.");
        }
        this.temPetBanho = false;
        boolean petSaiuLimpo = pet.tomouBanho();
        if (!petSaiuLimpo) {
            throw new PetshopException("Pet retirado sem tomar banho!\nNecessário limpar máquina");
        }
    }
    public void darBanho(Pet pet) throws PetshopException {

        if (this.getNivelAgua() < 10){
            double nivelAguaNecessario = NIVEL_MAXIMO_DE_AGUA - this.getNivelAgua();
            for (int i = 0; i < 5; i++) {
                this.addNivelAgua();
            }
        }
        if (this.getNivelSabao() < 2){
            double nivelSabaoNecessario = NIVEL_MAXIMO_DE_SABAO - this.getNivelSabao();
            this.addNivelSabao();
        }

        this.colocarPet(pet);

        System.out.println(pet.getNome() + " tomou banho!");
        this.nivelAgua -= 10;
        this.nivelSabao -= 2;
        pet.setBanho();

        this.removerPet(pet);
    }
    public void limparMaquina() {
        this.nivelAgua -= 3;
        this.nivelSabao -= 1;
        this.maquinaLimpa = true;
        System.out.println("Máquina limpa!");
    }
}
