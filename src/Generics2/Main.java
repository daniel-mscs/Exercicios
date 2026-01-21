package Generics2;

public class Main {
    static void main(String[] args) {



        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação"));
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai de ferro"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Pergaminho de pedra"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Pergaminho de água"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Kurama"));


        System.out.println("Itens da bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();

    }
}
