package Vetores;

import java.util.Arrays;

public class Vetor05 {
    static void main() {
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0);
        for (int valor: vetor){
            System.out.println(valor + " ");
        }
    }
}
