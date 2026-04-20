public class SalarioFuncionario {
    String nome;
    double salario;

    void verificar(){
        if (salario >= 5000){
            System.out.println("Salário acima da média.");
        }else{
            System.out.println("Salário abaixo da média.");
        }
    }
}
