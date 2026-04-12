public class ForEach {
    public static void main(String[] args) {
        double preco[] = {12.50, 10.5, 3.50, 25.64, 1.69};
        double total = 0;
        int contador = 1;
        for (double valor: preco){
            System.out.println("Produto " + contador + " custa R$" + valor);
            total += valor;
            contador++;
        }
        System.out.println("Total da compra: " + total);
    }
}
