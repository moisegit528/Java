package Vetores;

public class Vetor02 {
    static void main() {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int c=0; c<mes.length; c++){
        System.out.println("Mês de "+mes[c]+" tem um total de "+total[c]+" dias" );
    }
    }
}
