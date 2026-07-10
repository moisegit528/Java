package EstruturaRepeticao;

public class Contador02 {
    static void main() {
        int cc = 0;
        while (cc <= 9) {
            cc++;
            if (cc == 5 || cc == 8 || cc == 6) {
                continue;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}