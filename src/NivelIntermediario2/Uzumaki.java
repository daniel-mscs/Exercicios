package NivelIntermediario2;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é "+nome+ " Minha estratégia é criar 1000 clones da sombra, esse é meu jeito ninja de ser, e eu já completei "+numeroDeMissoesConcluidas+" missoes.");

    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu RASENSHURIKEN!!");
    }

    @Override
    public void ninjutsuMaisForte() {
        System.out.println("Jutsu de invoção, KURAMA!");
    }

    /*
    @Override
    public void nomedoninja() {
        System.out.println("Meu nome é "  + nome);
    }
    */
}
