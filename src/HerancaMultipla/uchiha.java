package HerancaMultipla;

public class uchiha extends ninja implements sharingan {

    //criação dos construtores.

    public uchiha() {
    }

    public uchiha(String nome, String aldeia, int idade, int missoesConcluidas, Rank rank) {
        super(nome, aldeia, idade, missoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa da Interface SHARINGAN:
    */
     @Override
    public void sharinganAtivado(){
        System.out.println(getNome()+ " Ativou o Sharingan!");
    };
     @Override
     public void mostrarInformacoes(){
         System.out.println("Meu nome é " + getNome()+ " eu sou da "+getAldeia()+" minha idade é "+getIdade()+" anos ,eu já conclui "+getMissoesConcluidas()
                 +" missões e meu rank é " + getRank());
     }

}
