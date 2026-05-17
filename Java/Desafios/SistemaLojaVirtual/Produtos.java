package Desafios.SistemaLojaVirtual;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarInfo(){
        System.out.println("Produto:" + nome);
        System.out.println("Preço:R$" + preco);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double p){
        this.preco = p;
    }

}
