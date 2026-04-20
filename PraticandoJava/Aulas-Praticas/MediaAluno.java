import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Olá,Professor! Digite as notas abaixo, para verificar\nse foi aprovado ou reprovado! ");
        System.out.format("Digite a primeira nota do aluno: ");
        float n1 = usuario.nextFloat();
        System.out.format("Digite a segunda nota: ");
        float n2 = usuario.nextFloat();
        float media = (n1+n2)/2;
        System.out.println("A média ficou: " + media);
        if (media>=6){
            System.out.format("APROVADO!");
        }else {
            System.out.format("REPROVADO!");
        }
    }
}
