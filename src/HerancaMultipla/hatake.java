package HerancaMultipla;

public class hatake extends ninja implements sharingan,anbuinterface,HokageInterface {


    //Construtores:
    public hatake() {
    }

    public hatake(String nome, String aldeia, int idade, int missoesConcluidas, Rank rank) {
        super(nome, aldeia, idade, missoesConcluidas, rank);
    }
    @Override
    public void mostrarInformacoes(){
        System.out.println("Meu nome é " + getNome()+ " eu sou da "+getAldeia()+" minha idade é "+getIdade()+" anos ,eu já conclui "+getMissoesConcluidas()
                +" missões e meu rank é " + getRank());
    }


    //Metodos:
    public void BoasVindas () {
        System.out.println(getNome()+ " Eu sou um Hatake");
    }

    @Override
    public void hokageativo(){
        System.out.println(getNome()+ " Eu sou um hokage!");
    }

    @Override
    public void ninjaDeElite(){
        System.out.println(getNome()+" eu sou um ninja de elite da ANBU");
    }

    //Esse metodo vem direto da interface
    @Override
    public void sharinganAtivado(){
        System.out.println(getNome()+ " Ativou o Sharingan!");
    };
}
