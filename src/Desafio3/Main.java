package Desafio3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Scanner cxtexto = new Scanner(System.in);
        boolean continuar = true;
        ArrayList<Ninja> listaNinjas = new ArrayList<>();
        while (continuar){
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Ninja");
            System.out.println("2. Adicionar Uchiha");
            System.out.println("3. Listar todos os ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = cxtexto.nextInt();
            cxtexto.nextLine();
            switch (opcao) {
                case 1:

                    Ninja novoNinja = new Ninja();

                    System.out.println("Digite o nome do ninja: ");
                    novoNinja.nome = cxtexto.nextLine();

                    System.out.println("Digite a idade do ninja: ");
                    novoNinja.idade = cxtexto.nextInt();
                    cxtexto.nextLine();

                    System.out.println("Digite a missão: ");
                    novoNinja.missao = cxtexto.nextLine();

                    System.out.println("Nível da dificuldade da missão: ");
                   novoNinja.nivelDificuldade = cxtexto.nextLine();

                    System.out.println("Status da missão: ");
                    novoNinja.statusMissao = cxtexto.nextLine();

                    listaNinjas.add(novoNinja);
                    System.out.println("Ninja adicionado com sucesso!");
                    break;
                case 2:
                    Uchiha novoUchiha = new Uchiha();

                    System.out.println("Digite o nome do ninja: ");
                    novoUchiha.nome = cxtexto.nextLine();

                    System.out.println("Digite a idade do ninja: ");
                    novoUchiha.idade = cxtexto.nextInt();
                    cxtexto.nextLine();

                    System.out.println("Digite a missão: ");
                    novoUchiha.missao = cxtexto.nextLine();

                    System.out.println("Nível da dificuldade da missão: ");
                    novoUchiha.nivelDificuldade = cxtexto.nextLine();

                    System.out.println("Status da missão: ");
                    novoUchiha.statusMissao = cxtexto.nextLine();

                    System.out.println("Habilidade preferida: ");
                    novoUchiha.habilidadeEspecial = cxtexto.nextLine();

                    listaNinjas.add(novoUchiha);
                    System.out.println("Ninja adicionado com sucesso!");
                    break;
                case 3:
                    if (listaNinjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado ainda!");
                    } else {
                        System.out.println("=== Lista de Ninjas ===");
                        for (Ninja n : listaNinjas) {
                            n.mostrarInformacoes();
                            System.out.println("-----------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");

                    continuar = false;
                break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        cxtexto.close();
    }
}
