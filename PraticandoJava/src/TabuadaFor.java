import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite o número para ver sua tabuada\n de 1 a 10:");
        int numero = usuario.nextInt();
        for (int soma=1; soma<=10; soma++){
            System.out.println(numero + "X" + soma + " = " + (numero * soma));
        }
    }
}
