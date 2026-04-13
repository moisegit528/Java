import java.util.Scanner;

public class CadastroUsuario {
    public static void cadastrarUsuario() {
        Scanner usuario = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = usuario.nextLine();
        System.out.format("Digite sua idade: ");
        int idade = usuario.nextInt();
        usuario.nextLine();
        System.out.print("Digite seu email: ");
        String email = usuario.nextLine();

        System.out.println("\n--- Dados Cadastrados  ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
    public static void main(String[] args){
        cadastrarUsuario();
    }
}