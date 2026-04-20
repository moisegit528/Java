public class RepeticaoWhile {
    public static void main(String[] args) {
        int c = 0;
        while (c<10){
            c++;
            if (c == 5 || c == 7 || c == 9){
                continue;
            }
            System.out.println("Contagem " + c);
        }
    }
}
