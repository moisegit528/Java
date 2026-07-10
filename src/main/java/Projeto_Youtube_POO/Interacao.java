package Projeto_Youtube_POO;

public class Interacao extends Pessoa {
    private String login;
    private int totalAssistido;

    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}

    public int getTotalAssistido() {return totalAssistido;}
    public void setTotalAssistido(int totalAssistido) {this.totalAssistido = totalAssistido;}

    public Interacao(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm() {
        this.totalAssistido++;
    }

    @Override
    public String toString() {
        return "Interacao{" +super.toString() + "\nlogin='" + login + '\'' +
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
