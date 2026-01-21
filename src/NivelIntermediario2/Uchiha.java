package NivelIntermediario2;

public class Uchiha extends Ninja{


    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome+" Eu ativei meu sharingan. e eu já completei: "+numeroDeMissoesConcluidas+" missões!");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Minha estrategia de batalha é atacar de longe, esse é o jeito Uchiha");
    }

    @Override
    public void ninjutsuMaisForte() {
        System.out.println("Meu nome é "+nome+" e esse é meu Mangekyõ Sharingan, ATIVAR SUSANOO");
    }
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

    //É uma padronização como boa prática,
    //previne erros de digitação.
    @Override
    public void metodoProvisorio() {
        System.out.println("teste na classe uchiha");
    }

}
