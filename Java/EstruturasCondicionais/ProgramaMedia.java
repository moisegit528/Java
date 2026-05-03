package EstruturasCondicionais;

import java.util.Scanner;

public class ProgramaMedia {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite a primeira nota: ");
        float n1 = usuario.nextFloat();
        System.out.format("Digite a segunda nota: ");
        float n2 = usuario.nextFloat();
        float soma = (n1+n2)/2;
        System.out.println("A média é: " + soma);
        if (soma>=8){
            System.out.println("Parabêns,nota muito boa!");
        }
    }
}
