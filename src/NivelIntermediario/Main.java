package NivelIntermediario;


import java.sql.SQLOutput;

public class Main {
    static void main(String[] args) {

        //Criar o ninja Naruto

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da folha";

        //metodo
        Naruto.ModoSabioAtivado();

        //Criar o ninja Sasuke Uchiha - Sasuke é um objeto;

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;


        //metodos
        Sasuke.SharinganAtivado();




        //Criar Sakura

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 16;
        Sakura.aldeia = "Aldeia da folha";

        //metodo
        Sakura.AtivarCura();


        //Criar ninja Madara

        Uchiha Madara = new Uchiha();
        Madara.nome = "Madara Uchiha";
        Madara.idade = 28;
        Madara.aldeia = "Aldeia da folha";

        //Metodo
        Madara.AtivarSusanoo();

        //criar Hinata
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia= "Aldeia da folha";

        //Metodo
        Hinata.AtivarByakugan();


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 12;

        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();


    }
}
