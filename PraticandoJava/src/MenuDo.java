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
            if (opcao==1){
                System.out.println("Você vai comer a melhor Pizza do Mundo!");
            } else if (opcao==2) {
                System.out.println("A coxinha está quentinha!");
            } else if (opcao==3) {
                System.out.println("Vou fritar agora!");
            } else if (opcao==0) {
                System.out.println("Saiu do Menu.");
            }else if (opcao!= 1 && opcao != 2 && opcao != 3){
                System.out.println("Opção Inválida, tente novamente.");
            }
        } while (opcao !=0);
        System.out.println("Programa Encerrado.");
    }
}
