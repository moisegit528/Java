package Heranca.Ex1;

import Heranca.Ex1.Funcionario;
import Heranca.Ex1.Professor;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Antonio");
        p4.setNome("Joao");

        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Masculino");

        p1.setSexo("M");
        p4.setSexo("M");
        p2.setIdade(25);

        p2.setCurso("Direito");
        p3.setSalario(2500.75f);
        p4.setSetor("Estilista");

        p3.receberaumento(200.50f);
        p2.cancelarmatricula();
        p4.mudartrabalho();
        p4.mudartrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
