package Records;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto Uzukami", "naruto@email.com",999999);

        System.out.println("cadastro = "+ cadastro);


        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", 55555);

        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord.emailCaixaAlta());

        cadastroUsandoRecord.emailCaixaAlta();
        System.out.println("NOME DO CADASTRO: " + cadastroUsandoRecord.nome());





    }
}
