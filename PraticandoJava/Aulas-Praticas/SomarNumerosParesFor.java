import java.util.Scanner;

public class SomarNumerosParesFor {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite um número Par e veja a soma dos pares\naté 20: ");
        int numero = usuario.nextInt();
        if (numero%2!=0){
            System.out.println("Apenas números pares são válidos!");
        } else {
            int soma = 0;

            for (int num = 2; num <= numero; num+=2){
                soma+=num;
                System.out.println(num);
        }
            System.out.println("A soma dos números pares: "+ soma);
        }
    }
}
