package EstruturaDeDados;

import java.util.*;

public class Main {
    static void main(String[] args) {

        //Array

        System.out.println("================== ARRAY ==================");
        String[] nomeNinjaArray = new String[5];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";

        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[4]);

        System.out.println("================== LISTA ==================");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");
        System.out.println(nomeNinjaList);

        System.out.println("================== STACK ==================");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");

        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha / Stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha / Stack = " + nomeNinjaStack.pop());

        nomeNinjaStack.push("Itachi Uchiha");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Próximo a sair Stack = " + nomeNinjaStack.peek());

        System.out.println("================== QUEUE ==================");
        Queue<String> nomeNinjaQueue = new LinkedList<>();
        nomeNinjaQueue.add("Naruto");
        nomeNinjaQueue.add("Shikamaru");
        nomeNinjaQueue.add("Sasuke");
        nomeNinjaQueue.add("Sakura");
        nomeNinjaQueue.add("Madara");

        System.out.println("Ninjas na fila: "+nomeNinjaQueue);
        nomeNinjaQueue.poll();
        System.out.println("Ninjas na fila depois do POLL: "+nomeNinjaQueue);
        System.out.println("Ninjas no head: "+nomeNinjaQueue.peek());

        nomeNinjaQueue.add("Itachi");
        nomeNinjaQueue.add("Hashirama");
        System.out.println("Ninjas na fila: "+nomeNinjaQueue);

        //Esvaziar FILA
        nomeNinjaQueue.poll();
        nomeNinjaQueue.poll();
        nomeNinjaQueue.poll();
        nomeNinjaQueue.poll();
        nomeNinjaQueue.poll();
        nomeNinjaQueue.poll();

        System.out.println("Ninjas na fila: "+nomeNinjaQueue);

        if (nomeNinjaQueue.isEmpty()){
            System.out.println("A fila esta vazia");
        }






        /*1-> ARRAY são estaticos,
            *Exigem um tamanho pré defenido.
            *
            * 2-> Listas são dinâmicas
            * Aumentam e diminuem de tamanho conforme precisamos;
            *
            * 3-> Stacks são únicos
            * Exigem uma ordem! O último a entrar é o primeiro a sair.
            *
            * 4-> Queue são como filas
            * Exigem uma ordem também, só que ao inverso de STACK
            * o primeiro a entrar é o primeiro a sair.
         */






















        
        
        
        
        
        
        
        
        
        
        
        









    }
}
