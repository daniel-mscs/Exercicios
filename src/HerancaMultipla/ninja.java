package HerancaMultipla;

public class ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int MissoesConcluidas;
    private Rank rank;

    public ninja() {
    }

    public ninja(String nome, String aldeia, int idade, int missoesConcluidas, Rank rank) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        MissoesConcluidas = missoesConcluidas;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMissoesConcluidas() {
        return MissoesConcluidas;
    }

    public void setMissoesConcluidas(int missoesConcluidas) {
        MissoesConcluidas = missoesConcluidas;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void mostrarInformacoes(){
        System.out.println("Meu nome é " + getNome()+ " eu sou da "+getAldeia()+" minha idade é "+getIdade()+" anos ,eu já conclui "+getMissoesConcluidas()
                +" missões e meu rank é " + getRank());
    }

}
