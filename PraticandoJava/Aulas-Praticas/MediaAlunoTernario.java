import java.util.Scanner;

public class MediaAlunoTernario {
    public static void main(String[] args) {
        Scanner professor = new Scanner(System.in);
        System.out.format("Nota 1: ");
        float n1 = professor.nextFloat();
        System.out.format("Nota 2: ");
        float n2 = professor.nextFloat();
        float media = (n1+n2)/2;
        System.out.println((media>=6) ? "APROVADO":"REPROVADO");
    }
}
