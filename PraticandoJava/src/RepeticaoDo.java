import java.util.Scanner;

public class RepeticaoDo {
    public static void main(String[] args) {
        /*int c = 1;
        do{
            System.out.println(c);
            c++;
        } while (c<=5);
         */
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("Soma de todos os valores é: " + s);
    }
}
