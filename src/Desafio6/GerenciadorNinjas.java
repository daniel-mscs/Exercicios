package Desafio6;

import java.util.LinkedList;

public class GerenciadorNinjas {

    private LinkedList<Ninja> ninjas;

    public GerenciadorNinjas(LinkedList<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    //case1
    public void exibirNinjas() {
        if (this.ninjas.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("\n=== LISTA DE NINJAS ===");
            for (Ninja ninja : this.ninjas) {
                System.out.println(ninja);
            }
            System.out.println("=======================");
        }
    }
    //case 2
    public void removerPrimeiro () {
        if (this.ninjas.isEmpty()){
            System.out.println("A lista está vazia!");
        } else {
            Ninja removido = this.ninjas.removeFirst();
            System.out.println("Ninja "+ removido.getNome()+" foi removido!");
        }
    }
    //case 3
    public void adicionarInicio(Ninja ninja){
        this.ninjas.addFirst(ninja);
        System.out.println("Ninja "+ninja.getNome()+ " foi adicionado ao inicio!");
    }
    //case 4
    public void acessarPorPosicao(int posicao){
        if (posicao <0 || posicao >= this.ninjas.size()){
            System.out.println("Posição inválida! A lista tem " + this.ninjas.size() + " ninjas (posições de 0 a " + (this.ninjas.size() - 1) + ")\n");
        } else { Ninja ninja = this.ninjas.get(posicao);
        System.out.println("\n=== NINJA NA POSIÇÃO " + posicao + " ===");
        System.out.println(ninja);
        }

    }
    //case 5
    public void adicionarNinja (Ninja ninja){
        this.ninjas.add(ninja);
        System.out.println("Ninja "+ninja.getNome()+" foi adicionado");
    }
}
