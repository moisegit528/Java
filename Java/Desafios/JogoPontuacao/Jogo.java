package Desafios.JogoPontuacao;

public class Jogo {
    public static void main(String[] args) {
       JogoPontuacao jogo = new JogoPontuacao("Moises", 0);
       jogo.Iniciar();
       jogo.Jogar();
       jogo.Jogar();
       jogo.Encerrar();
    }
}
