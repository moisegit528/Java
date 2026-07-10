package EstruturaRepeticao;

public class Contador03 {
    static void main() {
        int cc = 0;
        while (cc <= 10){
            cc++;
            if (cc == 0){
                continue;
            }
            if (cc == 11){
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}
