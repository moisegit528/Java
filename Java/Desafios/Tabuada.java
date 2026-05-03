package Desafios;

import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Tabuada de 1 a 10");
        System.out.format("Digite o número que deseja: ");
        int numero = usuario.nextInt();
        for (int i=1; i<=10; i++){
            int resultado = numero * i;
            System.out.println("O número "+numero+" X "+i+" é igual: "+resultado);
        }
    }
}
