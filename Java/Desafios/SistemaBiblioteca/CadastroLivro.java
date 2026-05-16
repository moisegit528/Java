package Desafios.SistemaBiblioteca;

public class CadastroLivro {
    private String titulo;
    private String autor;
    private int ano;

    public CadastroLivro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
