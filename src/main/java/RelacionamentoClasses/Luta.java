package RelacionamentoClasses;

import java.util.Random;

public class Luta {
    private RelacionamentoClasses.Lutador desafiado;
    private RelacionamentoClasses.Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public RelacionamentoClasses.Lutador getDesafiado() {return desafiado;}
    public void setDesafiado(RelacionamentoClasses.Lutador desafiado) {this.desafiado = desafiado;}

    public RelacionamentoClasses.Lutador getDesafiante() {return desafiante;}
    public void setDesafiante(RelacionamentoClasses.Lutador desafiante) {this.desafiante = desafiante;}

    public int getRounds() {return rounds;}
    public void setRounds(int rounds) {this.rounds = rounds;}

    public boolean getAprovada() {return aprovada;}
    public void setAprovada(boolean aprovada) {this.aprovada = aprovada;}

    public void marcarLuta(RelacionamentoClasses.Lutador l1, RelacionamentoClasses.Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("===== Desafiado =====");
            this.desafiado.apresentar();
            System.out.println("===== Desafiante =====");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0: // empate
                    System.out.println("========== Resultado ============");
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou desafiado
                    System.out.println("========== Resultado ============");
                    System.out.println("Vitória do lutador " + this.desafiado.getNome());
                    this.desafiado.ganhaLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Ganhou desafiante
                    System.out.println("=========== Resultado ===========");
                    System.out.println("Vitória do lutador " +this.desafiante.getNome());
                    this.desafiante.ganhaLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("======================");
        }else {
            System.out.println("Luta não pode acontecer!");
        }
    }

}
