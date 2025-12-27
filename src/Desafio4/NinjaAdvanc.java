package Desafio4;

public class NinjaAdvanc implements Ninja {

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAdvanc (String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes () {
        System.out.println("Nome: "+nome+ "\n Idade: "+idade+"\n Habilidade: " +habilidade + "\n Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade () {
        System.out.println("Ninja "+nome+" está usando a habilidade: "+habilidade +" e sua especialidade é o " + especialidade);
    }
}
