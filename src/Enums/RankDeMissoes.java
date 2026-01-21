package Enums;

public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Dificil", 5),
    S("Altissimo",12);

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    private String descricao;
    private int dificuldade;

}
