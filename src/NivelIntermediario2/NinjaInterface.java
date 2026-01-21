package NivelIntermediario2;

public interface NinjaInterface {

    /*Tudo é automaticamente FINAL..., SETAR O VALOR AGORA
    int idade = 14;
    String nome = "Naruto Uzumaki";
    String aldeia = "Aldeia da folha";

    //obrigatóriamente abstrato..
    public void tacarUmaShuriken();
     */

    void estrategiaDeBatalha();

    void inteligenciaDeCombate();

    void inteligenciaDeCombate(int qi);
    //metodo abstrato será em todas as classes
    //void estrategiaDeBatalhaNinja();
}
