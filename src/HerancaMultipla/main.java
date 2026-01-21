package HerancaMultipla;

public class main {
    static void main(String[] args) {

        System.out.println("----------------------- Naruto -----------------------");
        //Obj Naruto
        uzumaki naruto = new uzumaki("Naruto Uzumaki","Aldeia da folha", 15, 4232, Rank.GENIN, biju.KURAMA);
        naruto.mostrarInformacoes();
        naruto.Rasen();

        System.out.println("----------------------- Itachi -----------------------");

        //Obj itachi
        uchiha itachi = new uchiha("Itachi Uchiha", "Aldeia da folha", 27, 6002, Rank.JOUNIN);
        itachi.mostrarInformacoes();

        System.out.println("----------------------- Sasuke -----------------------");

        //Obj Sasuke
        uchiha sasuke = new uchiha("Sasuke Uchiha", "Aldeia da folha", 16, 402, Rank.GENIN);
        sasuke.mostrarInformacoes();

        System.out.println("----------------------- Madara -----------------------");
        //Obj Madara
        uchiha madara = new uchiha("Madara Uchiha", "Aldeia da folha", 38, 320392, Rank.KAGE);
        madara.mostrarInformacoes();


        System.out.println("----------------------- Kakashi -----------------------");

        //Obj Hatake
        hatake kakashi = new hatake("Kakashi Hatake", "Aldeia da folha", 34, 9220, Rank.JOUNIN);
        kakashi.mostrarInformacoes();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();


    }
}
