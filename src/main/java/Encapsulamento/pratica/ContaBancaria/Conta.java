package Encapsulamento.pratica.ContaBancaria;

public class Conta {
    public static void main(String[] args) {
        Encapsulamento.pratica.ContaBancaria.ContaBancaria c = new Encapsulamento.pratica.ContaBancaria.ContaBancaria(1000);
        c.sacar(500);
        System.out.println("Saldo atual: " + c.getSaldo());
        c.sacar(120.50);
        System.out.println("Saldo atual: " + c.getSaldo());
        c.depositar(323.15);
        System.out.println("Saldo atual: " + c.getSaldo());
    }
}
