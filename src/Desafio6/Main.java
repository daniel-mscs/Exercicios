package Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> ninjaLinkedList = new LinkedList<>();

        ninjaLinkedList.add(new Ninja("Naruto", 16,"Aldeia da folha"));
        ninjaLinkedList.add(new Ninja("Sasuke", 17,"Aldeia da folha"));
        ninjaLinkedList.add(new Ninja("Sakura", 15,"Aldeia da folha"));
        ninjaLinkedList.add(new Ninja("Madara", 30,"Aldeia da folha"));
        ninjaLinkedList.add(new Ninja("Gaara", 16,"Aldeia do Deserto"));
        ninjaLinkedList.add(new Ninja("Killer Bee", 28,"Aldeia oculta da nuvem"));
        ninjaLinkedList.add(new Ninja("Hashirama", 30,"Aldeia da folha"));

        GerenciadorNinjas gerenciadorNinjas = new GerenciadorNinjas(ninjaLinkedList);
        boolean continuar = true;
        while (continuar) {


            System.out.println("===== MENU =====");
            System.out.println("1 - Exibir todos os ninjas");
            System.out.println("2 - Remover o primeiro ninja");
            System.out.println("3 - Adicionar ninja no inicio");
            System.out.println("4 - Acessar ninja por posição");
            System.out.println("5 - Adicionar novo ninja");
            System.out.println("0 - Sair");
            System.out.println("Qual opção deseja acessar: ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    gerenciadorNinjas.exibirNinjas();
                    break;
                case 2:
                    gerenciadorNinjas.removerPrimeiro();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Nome do ninja: ");
                    String nome3 = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Aldeia: ");
                    String aldeia3 = scanner.nextLine();

                    gerenciadorNinjas.adicionarInicio(new Ninja(nome3,idade3,aldeia3));
                    break;
                case 4:
                    System.out.print("Digite a posição: ");
                    int posicao = scanner.nextInt();
                    gerenciadorNinjas.acessarPorPosicao(posicao);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Nome do ninja: ");
                    String nome5 = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade5 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Aldeia: ");
                    String aldeia5 = scanner.nextLine();

                    gerenciadorNinjas.adicionarNinja(new Ninja(nome5,idade5,aldeia5));
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }

        }

        scanner.close();
    }
}


