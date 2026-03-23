import java.util.Scanner;

public class MaiorMenorIdadeTernario {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite o ano de nascimento: ");
        int ano = usuario.nextInt();
        int idade = 2026-ano;
        System.out.println((idade>=18) ? "Maior de Idade" : "Menor de Idade") ;
    }
}
