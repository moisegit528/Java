public class DadosAluno {
    String nome;
    float nota1;
    float nota2;
    float nota3;
    float soma;

    void verificarAprovacao(){
        float soma = (nota1+nota2+nota3)/3;

        if (soma >=7){
            System.out.println(nome + " foi APROVADO com nota " + soma);
        }else {
            System.out.println(nome + "foi REPROVADO com nota " + soma);
        }
    }
}
