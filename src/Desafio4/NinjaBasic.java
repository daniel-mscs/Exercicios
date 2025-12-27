package Desafio4;

public class NinjaBasic implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasic (String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes () {
        System.out.println("Nome: "+nome+ "\n Idade: "+idade+"\n Habilidade: " +habilidade);
    }

    @Override
    public void executarHabilidade () {
        System.out.println("Ninja "+nome+" está usando a habilidade: "+habilidade);
    }
}
