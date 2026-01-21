package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        //Array
        //São estáticos e tem ref de memória prévia;
        String[] ninjasArray = new String[3];
        ninjasArray[1] = "Naruto Uzumaki";

        //Listas
        //São dinâmicas e tamanho e aumenta diminui conforme precisa;
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        //Stack
        //O ultimo elemento que entrou, é obrigatoriamente o primeiro a sair;
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuga");
        ninjasStack.push("Kakashi Hataki");
        ninjasStack.push("Madara Uchiha");
        ninjasStack.pop();
        System.out.println("Minha Stack atual= " + ninjasStack);
        System.out.println("Minha Stack atualizada com pop= " + ninjasStack);
        System.out.println("Minha Stack atualizada com o próximo elemento do topo = " + ninjasStack.peek());
        System.out.println("Tamanho da STACK = " +ninjasStack.size()+" elementos.");









    }
}
