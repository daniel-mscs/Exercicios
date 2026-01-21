package Generics2;

public class CompanheiroNinja {

    private String nomeDoAnimal;

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString () {
        return "Esse é meu companheiro " + nomeDoAnimal;
    }
}
