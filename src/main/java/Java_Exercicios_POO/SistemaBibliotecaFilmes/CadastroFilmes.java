package Java_Exercicios_POO.SistemaBibliotecaFilmes;

public class CadastroFilmes {
    private String titulo;
    private String diretor;
    private int ano;

    public CadastroFilmes(String titulo, String diretor, int ano){
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }

    public void mostrarInfo(){
        System.out.format("Título: " + titulo);
        System.out.format("Diretor: " + diretor);
        System.out.format("Ano do filme: " + ano);
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
