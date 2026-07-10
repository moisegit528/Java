package Heranca.Ex1;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;


    public void cancelarmatricula(){
        System.out.println("Cancelando Matricula");
    }

    public int getMatricula() {return matricula;}

    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getCurso() {return curso;}

    public void setCurso(String curso) {this.curso = curso;}
}
