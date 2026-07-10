package Java_Exercicios_POO.FuncionamentoEstoque;

public class Estoque {
    private String nome;
    private int quantidade;
    private float preco;

    public Estoque(String nome, int quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void mostrarInfo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + "R$" + preco + " reais a unidade.");
        System.out.println("Quantidade: " + quantidade);
    }

    public void calcularTotal(){
        System.out.println("Valor total em estoque: " + preco * quantidade + " reais");
    }

    public void adicionarEstoque(int valor){
        quantidade = quantidade + valor;
        System.out.println("Produto adicionado ao estoque. Quantidade atual: " + getQuantidade());
    }

    public void removerEstoque(int valor){
        if (valor <= quantidade){
            quantidade = quantidade - valor;
            System.out.println("Produto removido do estoque. Quantidade atual: " + getQuantidade());
        }else{
            System.out.println("ERRO: Estoque insuficiente.");
        }
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float p){
        preco = p;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int q){
        quantidade = q;
    }
}


