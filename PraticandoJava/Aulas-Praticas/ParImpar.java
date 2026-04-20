import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.format("Número para descobrir se é PAR ou ÍMPAR: ");
        int usuario = teclado.nextInt();
        if (usuario%2==0) {
            System.out.println("PAR");
        } else{
            System.out.println("ÍMPAR");
        }
    }
}
