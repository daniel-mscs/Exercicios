package Construtores;

public class Main {
    static void main(String[] args) {

        Hokages Hashirama = new Hokages();


        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(44);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.nome);

    }


}
