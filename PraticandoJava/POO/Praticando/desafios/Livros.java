public class Livros {
    String titulo;
    boolean disponivel;
    String livro1;
    String livro2;
    String livro3;
    String livro4;
    String livro5;

    void verificarLivro(){
        Livros livro1 = new Livros();
        livro1.titulo = "Harry Potter";
        livro1.disponivel = false;
        Livros livro2 = new Livros();
        livro2.titulo = "Drácula";
        livro2.disponivel = true;
        Livros livro3 = new Livros();
        livro3.titulo = "O Hobbit";
        livro3.disponivel = false;
        Livros livro4 = new Livros();
        livro4.titulo = "Macbeth";
        livro4.disponivel = true;
        Livros livro5 = new Livros();
        livro5.titulo = "Carrie";
        livro5.disponivel = true;
       if(disponivel == true){
           System.out.println("O livro está disponivel.");
       }else {
           System.out.println("O livro está emprestado.");
       }
    }
}
