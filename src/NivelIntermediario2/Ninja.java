package NivelIntermediario2;

public abstract class Ninja implements NinjaInterface{




    //aqui sendo abstrato posso setar depois...
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    nivelNinja rank;

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluida, rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando novos atributos;
    // Sobrecarga de metodos não precisa redeclarar o contrutor, somente os novos atributos;
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja() {

    }

    //TODO NINJA VAI FAZER OBRIGATÓRIAMENTE
    final void takarShuriken (){
        System.out.println("Eu sou um método da classe mãe!");
    }


    //Sobrecarga de metodo = inteligencia de combate
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é "+ nome+ " e essa é minha inteligencia de combate");
    }

    //Sobrecarga de metodo = inteligencia de combate
    public void inteligenciaDeCombate(int qi){
        if (qi > 150) {
            System.out.println("Seu QI é: "+qi+" e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: "+qi+" e você é um um ninja promissor");
        } else {
            System.out.println("Seu QI é: "+qi+ " e você precisa estudar mais");
        }
    }

    //metodo abstrato será em todas as classes
    public abstract void estrategiaDeBatalha();

    public abstract void ninjutsuMaisForte();

    // metodoabstrato 2
    public abstract void habilidadeEspecial();


    public void tacarKunai(){
        System.out.println("Meu nome é " +nome+" Eu takei uma kunai");
    };

    //Me    todo sem @Override
    public void metodoProvisorio(){
        System.out.println("teste na classe ninja");
    };

    @Override
    public String toString() {
        return "Meu nome é "+nome+" e eu sou da " + aldeia+ " e tenho "+idade+" anos";
    }
}
