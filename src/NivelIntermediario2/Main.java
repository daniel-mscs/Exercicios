package NivelIntermediario2;

import NivelIntermediario.Ninjas;

public class Main {
    static void main(String[] args) {


        //OBj naruto
        System.out.println("------------- Naruto Uzumaki -------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 18, 122, nivelNinja.KAGE);
        System.out.println(naruto);


        Anbu ninjaanbu = new Anbu();
        ninjaanbu.nome = "anbugenerico";

        System.out.println("------------- Sasuke Uchiha -------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 19, 3502, nivelNinja.KAGE);
        System.out.println(sasuke);
    }
}
