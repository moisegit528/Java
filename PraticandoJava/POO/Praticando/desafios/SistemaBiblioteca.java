import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        Livros verificar = new Livros();

        System.out.format("Digite o livro que deseja: ");
        verificar.titulo = usuario.nextLine();

        verificar.verificarLivro();
    }
}
