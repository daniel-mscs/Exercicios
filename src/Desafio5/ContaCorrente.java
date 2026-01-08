package Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial){
        super(saldoInicial, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$: "+valor+" realizado na conta corrente!");
    }
}
