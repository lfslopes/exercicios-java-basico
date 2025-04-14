package Exercicios.n3.n3;

import Exercicios.n3.n3.Petshop.Pet;
import Exercicios.n3.n3.Petshop.PetshotBanho;

public class Main {
    public static void main(String[] args) {
        Pet cachorro = new Pet("Cachorro");
        Pet gato = new Pet("Gato");

        PetshotBanho petshop = new PetshotBanho();

        petshop.darBanho(cachorro);
        petshop.colocarPet(gato);
        try {
            petshop.removerPet(gato);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            petshop.limparMaquina();
        }
        petshop.darBanho(gato);
    }
}
