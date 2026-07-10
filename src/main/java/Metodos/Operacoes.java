package Metodos;

public class Operacoes {
    static String contador(int i, int f) {
        String s = "";

        for(int c = 1; c <= f; ++c) {
            s = s + c + " ";
        }

        return s;
    }
}
