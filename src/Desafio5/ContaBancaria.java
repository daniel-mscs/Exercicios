package Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipo;

    public ContaBancaria(double saldoInicial, TipoConta tipo){
        this.saldo = saldoInicial;
        this.tipo = tipo;
    }


    @Override
    public void consultarSaldo() {
        System.out.println("Saldo conta [ "+tipo+" ]: R$ "+this.saldo);
    }

    @Override
    public abstract void depositar(double valor);

}
