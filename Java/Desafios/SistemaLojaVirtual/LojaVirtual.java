package Desafios.SistemaLojaVirtual;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaVirtual {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        System.out.format("Quantos produtos deseja cadastrar: ");
        int qtd = usuario.nextInt();

        for (int i=0; i < qtd; i++){
            System.out.format("Digite o nome do produto: ");
            usuario.nextLine();
            String nome = usuario.nextLine();

            System.out.format("Digite o preço do produto: ");
            double preco = usuario.nextDouble();

            Produtos lista = new Produtos(nome,preco);
            listaProdutos.add(lista);
        }
        double total = 0;
        System.out.println("==== Compra ====");
        for (Produtos p : listaProdutos){
            p.mostrarInfo();
            System.out.println(" ");
            System.out.format("Quantas unidades deseja comprar? ");
            int unidades = usuario.nextInt();
            usuario.nextLine();
            total = total + (p.getPreco() * unidades);
        }
        System.out.println("Valor total da compra: R$" + total);
    }
}
