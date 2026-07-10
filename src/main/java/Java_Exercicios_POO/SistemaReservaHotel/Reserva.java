package Java_Exercicios_POO.SistemaReservaHotel;

public class Reserva {
    private int tipo;
    private double precoDiaria;

    public Reserva(int tipo, double precoDiaria){
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
    }

    public void mostrarInfo(){
        System.out.println("Tipo de quarto: " + tipo);
        System.out.println("Preço da diária: R$" + precoDiaria);
    }

    public double getTipo(){
        return tipo;
    }
}
