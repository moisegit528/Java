import java.util.Scanner;

public class MenuDo {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Pizza");
            System.out.println("2 - Coxinha");
            System.out.println("3 - Pastel");
            System.out.println("0 - Sair");
            System.out.format("Digite a opção que deseja: ");
            opcao = usuario.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Você escolheu Pizza!");
                    break;
                case 2:
                    System.out.println("Você escolheu Coxinha!");
                    break;
                case 3:
                    System.out.println("Você escolheu Pastel!");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente!");
            }
        } while (opcao !=0);
    }
}
