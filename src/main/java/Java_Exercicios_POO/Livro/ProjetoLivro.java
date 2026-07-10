package Java_Exercicios_POO.Livro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 23, "F");

        l[0] = new Livro("Aprendendo Java", "Antony", 300, p[0]);
        l[1] = new Livro("Luiz", "Juanito", 600, p[1]);
        l[2] = new Livro("Harry Potter", "João Ambrosio", 450, p[1]);

        l[0].abrir();
        l[1].abrir();
        l[0].folhear(100);
        l[1].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
