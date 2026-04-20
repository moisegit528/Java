import java.util.Scanner;

public class CondicaoMultiplaEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.format("Quantas Pernas: ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.format("Isso é um(a): ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
