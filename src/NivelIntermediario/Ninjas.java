package NivelIntermediario;

public class Ninjas {

    String nome;
    String aldeia;
    int idade;

    //Criar um metodo public personalizado.
    //Void não retorna valor nenhum

    //Metedo String, vai ter que retornar uma string
    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja";
    }

    //Metodos INT vai ter que retornar um INT;
    public int anosParaseTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
