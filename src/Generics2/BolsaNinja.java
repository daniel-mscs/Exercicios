package Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    //Inicializar Array
    private List<T> ferramentas;


    //onstrutor vazio
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }



    //Construtor para nome;

    public BolsaNinja(List<T> ferramentas) {
        this.ferramentas = new ArrayList<>();
  ;  }

    //Colocar ferramentas no Array
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //Mostrar lista de ferramentas
    public void mostrarFerramenta(){
       for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }

    @Override
    public String toString () {
        return ferramentas.toString();
    }

}
