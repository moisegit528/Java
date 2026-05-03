package EstruturasCondicionais;

import java.util.Scanner;

public class ImparPar {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite um número PAR ou IMPAR: ");
        int jogar = usuario.nextInt();
        if (jogar%2==0){
            System.out.println("Deu PAR!");
        }else{
            System.out.println("Deu IMPAR!");
        }
    }
}
