import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        DadosAluno notas = new DadosAluno();

        System.out.format("Digite o nome do Aluno: ");
        notas.nome = usuario.nextLine();
        System.out.format("Digite a primeira nota: ");
        notas.nota1 = usuario.nextFloat();
        System.out.format("Digite a segunda nota: ");
        notas.nota2 = usuario.nextFloat();
        System.out.format("Digite a terceira nota: ");
        notas.nota3 = usuario.nextFloat();

        notas.verificarAprovacao();
    }
}
