import java.util.Scanner;

public class CondicaoCompostaEncadeada {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite o seu ano de nascimento, para verificar\nse o voto é obrigatório ou opcional: ");
        int nascimento = usuario.nextInt();
        int idade = 2026 - nascimento;
        if (idade<16){
            System.out.println("Não vota");
        } else if ((idade>=16 && idade<18) || (idade>70)){
                System.out.println("Opcional");
            } else {
            System.out.println("Obrigatório!");
        }
    }
}
