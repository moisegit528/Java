package EstruturasCondicionais;

import java.util.Scanner;

public class Votacao {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Vamos descobrir se é obrigatório ou opcional o seu voto? ");
        System.out.format("Digite seu ano de nascimento: ");
        int ano = usuario.nextInt();
        int soma = 2026 - ano;
        if (soma<16){
            System.out.println("Não pode votar!");
        }else if ((soma >=16 && soma<18) || (soma>70)){
            System.out.println("Voto opcional!");
        }else{
            System.out.println("Voto Obrigatório!");
        }
    }
}
