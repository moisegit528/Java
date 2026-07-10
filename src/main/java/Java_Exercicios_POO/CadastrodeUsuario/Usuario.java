package Java_Exercicios_POO.CadastrodeUsuario;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.format("Digite seu nome: ");
        String nome = usuario.nextLine();

        System.out.format("Digite sua idade: ");
        int idade = usuario.nextInt();
        usuario.nextLine();

        System.out.format("Digite seu email: ");
        String email = usuario.nextLine();

        Cadastro usuario1 = new Cadastro(nome, idade, email);

        usuario1.mostrarInfo();
        usuario1.validarCadastro();
    }
}
