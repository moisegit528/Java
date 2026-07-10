package Java_Exercicios_POO;

import java.util.Scanner;

public class ParouImpar {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite um número e descubra se é IMPAR ou PAR");
        System.out.format("Pode digitar: ");
        int numero = usuario.nextInt();
        if (numero%2==0){
            System.out.println(numero + " é PAR!");
        }else{
            System.out.println(numero + " é IMPAR!");
        }
    }
}
