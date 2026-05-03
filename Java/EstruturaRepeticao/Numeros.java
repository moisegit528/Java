package EstruturaRepeticao;

import java.util.Scanner;

public class Numeros {
    static void main() {
        int n, s=0;
        String resposta;
        Scanner usuario = new Scanner(System.in);
        do {
            System.out.format("Digite um número: ");
            n = usuario.nextInt();
            s += n; // s = s + n;
            System.out.println("Quer continuar? [S/N]");
            resposta = usuario.next();
        }while(resposta.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
}
