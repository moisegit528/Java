package Desafios.SistemaBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        ArrayList<CadastroLivro> listaLivros = new ArrayList<>();


        System.out.format("Quantos livros deseja cadastrar? \n");
        int qtd = usuario.nextInt();
        usuario.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("====== Cadastro do Livro " + (i + 1) + " ====");

            System.out.format("Digite o título: ");
            String titulo = usuario.nextLine();

            System.out.format("Digite o autor: ");
            String autor = usuario.nextLine();

            System.out.format("Digite o ano: ");
            int ano = usuario.nextInt();
            usuario.nextLine();

            CadastroLivro livro = new CadastroLivro(titulo, autor, ano);
            listaLivros.add(livro);
        }
        System.out.println("\n ==== Listra de Livros Cadastrados ==== ");
        for (CadastroLivro l : listaLivros){
            l.mostrarInfo();
        }
        usuario.close();
    }
}
