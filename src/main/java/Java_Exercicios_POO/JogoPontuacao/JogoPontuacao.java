package Java_Exercicios_POO.JogoPontuacao;
import java.util.Random;

public class JogoPontuacao {
    private String nome;
    private int pontuacao;
    private boolean status;

    public JogoPontuacao(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.status = false;
    }

    public void Iniciar(){
        this.status = true;
        this.pontuacao = 0;
        System.out.println("Jogo Iniciado!");
    }
    public void Jogar(){
        if (status == true){
            Random aleatorio = new Random();
            int pontos = aleatorio.nextInt(10) + 1;
            pontuacao += pontos;
            System.out.println("Você ganhou " + pontos + " Pontos!");
            System.out.println("Pontuação atual: " + getPontuacao());
        }else{
            System.out.println("Erro: Jogo não iniciado!");
        }
    }
    public void Encerrar(){
        this.status = false;
        System.out.println("Jogo Encerrado. Pontuação Final: " + getPontuacao());
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public int getPontuacao(){
        return pontuacao;
    }
    public void setPontuacao(int pontos){
        this.pontuacao = pontos;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
