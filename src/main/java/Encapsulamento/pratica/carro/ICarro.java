package Encapsulamento.pratica.carro;

public class ICarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.ligar();
        c.acelerar();
        c.frear();
        c.acelerar();
        c.acelerar();
        c.desligar();
    }
}
