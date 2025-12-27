package Desafio4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        NinjaBasic ninja1 = new NinjaBasic("Madara Uchiha", 34, TipoHabilidade.RINNENGAN);
        NinjaAdvanc ninja2 = new NinjaAdvanc("Sasuke Uchiha", 18, TipoHabilidade.KATON, "sharingan");
        NinjaAdvanc ninja03 = new NinjaAdvanc("Maito Gai", 28, TipoHabilidade.TAIJUTSU, "Hirudora");

        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();

        ninja03.mostrarInformacoes();
        ninja03.executarHabilidade();

    }
}
