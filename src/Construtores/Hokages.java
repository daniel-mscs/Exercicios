package Construtores;

public class Hokages {


    //Argumentos
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokages() {
        //Construtor vazio, sem argumentos
    }


    //Criar um construtor com argumento
    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages (String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokages(double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }


    //criar construtor alt + insert
    public Hokages(String nome, double saldoBancario, int missoes, String aldeia, boolean vivoOuNao, int idade, double altura) {
        this.nome = nome;
        this.saldoBancario = saldoBancario;
        this.missoes = missoes;
        this.aldeia = aldeia;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.altura = altura;
    }
}
