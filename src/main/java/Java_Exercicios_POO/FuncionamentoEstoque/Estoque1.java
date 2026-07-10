package Java_Exercicios_POO.FuncionamentoEstoque;

public class Estoque1 {
    public static void main(String[] args) {
        Estoque produto1 = new Estoque("Arroz", 1, 21.85f);
        Estoque produto2 = new Estoque("Feijão", 2, 7.85f);

        produto1.mostrarInfo();
        produto1.calcularTotal();

        System.out.println("------------------------------");

        produto2.mostrarInfo();
        produto2.calcularTotal();
    }
}
