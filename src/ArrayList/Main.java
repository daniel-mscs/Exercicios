package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        //Array são estaticas
        String [] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";


        //Listas
        //Listas não são estaticas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki"); //Index 0
        ninjasList.add("Sasuke Uchiha"); //Index 1
        ninjasList.add("Sakura Haruno"); //Index 2
        ninjasList.add("Tobirama Senju"); //Index 3
        //adicionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);
        System.out.println("ninjasList = " + ninjasList);
        //remover da lista
        ninjasList.remove("Kakashi Hatake");
        //trocar elementos
        ninjasList.set(3, "Hashirama Senju");

        // ver o tamanho da Lista
        ninjasList.size();
        System.out.println("Tamanho da lista: "+ninjasList.size()+ " elementos" );
    }
}
