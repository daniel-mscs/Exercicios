package Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldoInicial){
        super(saldoInicial, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        double valorFinal = valor - taxa;
        this.saldo += valorFinal;
        System.out.println("Depósito de R$: "+valor+" (taxa: R$ "+taxa+") realizado na conta poupança");
    }
}
