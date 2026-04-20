import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        SalarioFuncionario dados = new SalarioFuncionario();

        System.out.format("Digite nome do funcionário: ");
        dados.nome = usuario.nextLine();
        System.out.format("Digite o salário do funcionário: ");
        dados.salario = usuario.nextFloat();
        System.out.println("Seu sálario é: " + dados.salario);

        dados.verificar();
    }
}
