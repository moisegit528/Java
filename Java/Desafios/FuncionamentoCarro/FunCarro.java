package Desafios.FuncionamentoCarro;

public class FunCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford Ka", 2018);
        carro1.mostrarStatus();
        System.out.println("-----------");
        carro1.ligar();
        System.out.println("-----------");
        carro1.mostrarStatus();

    }
}
