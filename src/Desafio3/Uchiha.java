package Desafio3;

public class Uchiha extends Ninja {

        String habilidadeEspecial;


        public void mostrarHabilidadeEspecial(){
            System.out.println("Habilidade Especial: " + habilidadeEspecial);
        }
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}


