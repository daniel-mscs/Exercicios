package Desafio5;

public class Main {
    static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);

        System.out.println("--- KONOHA CONTA CORRENTE ---");
        cc.depositar(100);
        cc.consultarSaldo();


        System.out.println("--- KONOHA CONTA POUPANÇA---");
        cp.depositar(100);
        cp.consultarSaldo();
        System.out.println("...");
        System.out.println("BANCO DE KONOHA AGRADECE!");
    }
}
