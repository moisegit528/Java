package Desafios.SistemaReservaHotel;

import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.format("Digite seu nome: ");
        String nome = usuario.nextLine();

        System.out.format("Digite a quantidade de dias: ");
        int dias = usuario.nextInt();

        System.out.format("Digite a opção que deseja, para selecionar o tipo de quarto (Simples, Duplo, Luxo): ");
        int tipo = usuario.nextInt();
        double total = 0;
        if (tipo == 1){
            System.out.println("Tipo de quarto selecionado: Simples");
            System.out.println("Valor da diária: R$150,00");
            total = 150 * dias;
        } else if (tipo == 2) {
            System.out.println("Tipo de quarto selecionado: Duplo");
            System.out.println("Valor da diária: R$230,00");
            total = 230 * dias;
        }else if (tipo == 3){
            System.out.println("Tipo de quarto selecionado: Luxo");
            System.out.println("Valor da diária: R$320,00");
            total = 320 * dias;
        }else {
            System.out.println("Opção inválida! Tente novamente!");
        }


        Reserva Quarto = new Reserva(tipo, total);
        System.out.println("=== Reserva ===");
        System.out.println("Cliente: " + nome);
        Quarto.mostrarInfo();
        System.out.println(" ");
        System.out.println("Dias reservados: " + dias);

        double soma = Quarto.getTipo() + dias;
        System.out.println("Valor total da estadia: R$" + soma);
    }
}
