package Heranca.Ex2;

import java.sql.SQLOutput;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public void pagarMensal(){
        System.out.println("Mensalidade paga do aluno" + this.nome);
    }

    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula = matricula;}

    public String getCurso() {return curso;}

    public void setCurso(String curso) {this.curso = curso;}
}
