package Encapsulamento.pratica.ContaBancaria;

public class ContaBancaria implements Encapsulamento.pratica.ContaBancaria.Interface {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {saldo += valor;
            System.out.println("Depósito realizado: " + valor);}else{System.out.println("Valor inválido para depósito");}
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double getSaldo() {return saldo;}

}
