package HerancaMultipla;

public class uzumaki extends ninja {


    //Emuns
    biju minhasbijus;



    public uzumaki() {
    }

    public uzumaki(String nome, String aldeia, int idade, int missoesConcluidas, Rank rank) {
        super(nome, aldeia, idade, missoesConcluidas, rank);
    }

    public uzumaki(String nome, String aldeia, int idade, int missoesConcluidas, Rank rank, biju minhasbijus) {
        super(nome, aldeia, idade, missoesConcluidas, rank);
        this.minhasbijus = minhasbijus;
    }

    public void Rasen(){
        System.out.println("Meu nome é " + getNome()+" e aqui vai meu Rasengan");
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Meu nome é " + getNome()+ " eu sou da "+getAldeia()+" minha idade é "+getIdade()+" anos ,eu já conclui "+getMissoesConcluidas()
                +" missões e meu rank é " + getRank()+" e eu sou um jinchuriki da "+ minhasbijus);
    }

}
