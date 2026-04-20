public class CarrinhoCompraSimplesVetor {
    public static void main(String[] args) {
        double preco[] = {12.50, 10.00, 13.50, 32.50, 20.90};
        double total = 0;
        for (int i=0; i<preco.length; i++){
            System.out.println("Produto " + (i+1) + " custa R$" + preco[i]);
            total += preco[i];
        }
        System.out.println("Total da compra: " + total);
    }
}
