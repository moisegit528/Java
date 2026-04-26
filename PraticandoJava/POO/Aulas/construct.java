public class construct {
    private String modelo;
    private String cor;
    private float ponta;

    public construct(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }
    void status(){
        System.out.println("Sobre a caneta...");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
    }
}
