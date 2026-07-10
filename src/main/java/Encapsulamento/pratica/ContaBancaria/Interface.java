package Encapsulamento.pratica.ContaBancaria;

public interface Interface {
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public double getSaldo();
}
