public class Aula04 {
    public static void main(String[] args) {
        Caneta02 c1 = new Caneta02("BIC",0.5f, "Vermelha");
        //c1.setModelo("");
        // c1.modelo = "BIC"; não pode alterar assim por que é privado
        //c1.setPonta(0.5f);
        // c1.ponta = 0.5f não pode alterar assim por que é privado

        c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + " e cor " + c1.getCor());

    }
}
