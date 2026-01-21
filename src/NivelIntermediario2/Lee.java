package NivelIntermediario2;

public class Lee extends Ninja{

    public Lee(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void Meunome(){
        System.out.println("Meu nome é " + nome+ " e eu quero ser o ninja mais forte.");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Minha estratégia de batalha é atacar com Taijutsu!");
    }

    @Override
    public void ninjutsuMaisForte() {
        System.out.println("Abrir os 8 portões!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Minha habilidade especial é a velocidade!");
    }
}
