package Encapsulamento;

public class Main {
    static void main(String[] args) {


        System.out.println("------ Naruto Uzukami ------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 16, 800, 1.77);
        System.out.println("Meu nome é " +naruto.getNome());
        naruto.setNome("Naruto Uzukami");
        System.out.println(naruto.getNome());

        System.out.println("------ Sasuke Uchiha ------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 17, 3000, 1.79);
        System.out.println("");



    }
}
