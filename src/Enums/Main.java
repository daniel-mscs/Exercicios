package Enums;

public class Main {
    static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar Gato", RankDeMissoes.D);
        missao1.existirDetalhes();

        System.out.println("--------------------");

        Missoes missao2 = new Missoes("Resgatar Sasuke", RankDeMissoes.S);
        missao2.existirDetalhes();

    }
}
