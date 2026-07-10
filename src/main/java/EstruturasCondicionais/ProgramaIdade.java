package EstruturasCondicionais;

import java.util.Scanner;

public class ProgramaIdade {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Qual seu ano de nascimento: ");
        int ano = usuario.nextInt();
        int soma = 2026 - ano;
        if (soma>=18){
            System.out.println("Você tem " + soma + " anos, é maior de idade!");
        }else {
            System.out.println("Sua idade é " + soma + " anos, é menor de idade!");
        }
    }
}
