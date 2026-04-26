public class Caneta02 {
    private String modelo; // atributo
    private float ponta; // atributo
    private boolean tampada;
    private String cor;

    public Caneta02(String m, float p, String c) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void status(){

    }
}
