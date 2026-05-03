package Desafios;

import java.util.Scanner;

public class CalculadoraSimples {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.format("Digite o primeiro número: ");
        double n1 = usuario.nextDouble();
        System.out.format("Digte o segundo número: ");
        double n2 = usuario.nextDouble();
        System.out.println(" Opção: 1 = Somar +\n Opcão: 2 = Subtração -\n Opção: 3 = Multiplicação *\n Opção: 4 = Divisão /");
        System.out.format("Digite a opção para qual deseja realizar a operação: ");
        int escolha = usuario.nextInt();

        if (escolha == 1){
            double soma = n1+n2;
            System.out.println("A soma entre "+n1+" e "+n2+" ficou: " + soma);
        }else if(escolha == 2){
            double subtracao = n1-n2;
            System.out.println("A subtração entre "+n1+" e "+n2+" ficou: " + subtracao);
        } else if (escolha == 3) {
            double multiplicacao = n1*n2;
            System.out.println("A multiplicação entre "+n1+" e "+n2+" ficou: " + multiplicacao);
        } else if (escolha == 4) {
            double divisao = n1/n2;
            System.out.println("A divisão entre "+n1+" e "+n2+" ficou: " + divisao);
        }else {
            System.out.println("Opção inválida!");
        }
    }

}
