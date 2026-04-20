import java.util.Scanner;

public class MaiorMenorIdade {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite seu ano de nascimento: ");
        int ano = usuario.nextInt();
        int idade = 2026 - ano;
        System.out.println("Sua idade é: " + idade);
        if (idade>=18){
            System.out.println("Maior de Idade!");
        }else {
            System.out.println("Menor de Idade!");
        }
    }
}
