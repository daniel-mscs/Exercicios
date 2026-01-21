package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //colocar equipamentos genéricos
    public void adicionarEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString () {
       return "Bolsa de equipamentos: "+ equipamentos.toString();
    }


}
