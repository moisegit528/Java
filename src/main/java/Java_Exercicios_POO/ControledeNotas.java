package Java_Exercicios_POO;

import java.util.Scanner;

public class ControledeNotas {
    static void main() {
        Scanner professor = new Scanner(System.in);
        System.out.println("Seja Bem-Vindo Professor!");
        System.out.println("Aqui poderá fazer o cálculo da média dos seus alunos.");
        System.out.format("Digite o nome do Aluno: ");
        String nome = professor.next();
        System.out.format("Digite a primeira nota: ");
        float nota1 = professor.nextFloat();
        System.out.format("Digite a segunda nota: ");
        float nota2 = professor.nextFloat();
        System.out.format("Digite a terceira nota: ");
        float nota3 = professor.nextFloat();
        float media = (nota1+nota2+nota3)/3;
        if (media >= 9){
            System.out.println("Sua média ficou "+media+" Parabêns pela nota muito boa, APROVADO!");
        } else if (media >=6) {
            System.out.println("Sua média ficou "+media+" Parabêns você foi APROVADO!");
        }else {
            System.out.println("Sua média ficou "+media+" Precisa se esforça mais, REPROVADO!");
        }
    }
}
