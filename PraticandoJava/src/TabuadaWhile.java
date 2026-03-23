import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite o número, para ver sua tabuada de 1 a 10: ");
        int numero = usuario.nextInt();
        int comeco = 1;
        while (comeco<=10){
            System.out.println(numero + " X " + comeco + " = " + (numero*comeco));
            comeco++;
        }
        usuario.close();
    }
}
