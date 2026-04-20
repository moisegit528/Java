public class TesteFuncao1 {

    static int soma(int a, int b){
        int s = a + b;
        return s ;
        /*System.out.println("A soma é " + s);*/
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa!");
        /*soma(5,2);*/
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
}
