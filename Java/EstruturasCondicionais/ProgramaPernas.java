package EstruturasCondicionais;

import java.util.Scanner;

public class ProgramaPernas {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Qual a quantidade de pernas? ");
        int pernas = usuario.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Quadrupede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
