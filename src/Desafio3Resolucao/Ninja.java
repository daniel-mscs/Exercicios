package Desafio3Resolucao;

public class Ninja {

    String nome;
    String NivelDaDificuldade;
    String StatusDaMissao;
    int idade;
    String missao;

    public void mostrarInformacoes() {
        System.out.println("Nome = " +nome);
        System.out.println("Missão = " +missao);
        System.out.println("Nivel de dificuldade = " +NivelDaDificuldade);
        System.out.println("Status da Missão = " +StatusDaMissao);
        System.out.println("idade = " +idade);
    }
}
