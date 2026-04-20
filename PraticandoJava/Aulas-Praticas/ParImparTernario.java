import java.util.Scanner;

public class ParImparTernario {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite o número e descubra se é PAR ou Ímpar: ");
        int num = usuario.nextInt();
        System.out.format((num%2==0) ? "PAR":"ÍMPAR");
    }
}
