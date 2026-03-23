import java.util.Scanner;

public class MenuComSwitchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Opção 1 = Bolo\nOpção 2 = Pudim\nOpção 3 = Sorvete");
        System.out.format("Digite o valor da opção da Sobremesa que deseja: ");
        int escolha = teclado.nextInt();
        String opcao;
        switch (escolha){
            case 1:
                opcao = "Bolo";
            break;
            case 2:
                opcao = "Pudim";
                break;
            case 3:
                opcao = "Sorvete";
                break;
            default:
                opcao = "Inválida!";
                break;
        }
        System.out.format("Você escolheu: "+ opcao);
    }
}
