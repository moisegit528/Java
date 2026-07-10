package Encapsulamento.pratica.carro;

public class Carro implements Encapsulamento.pratica.carro.InterfaceCarro {
    private boolean ligado;
    private int velocidade;

    public static final int VELOCIDADE_MAXIMA = 180;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public boolean getLigado() {return ligado;}

    public void setLigado(boolean ligado) {this.ligado = ligado;}

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        velocidade = 0;
        System.out.println("Carro desligado");
    }

    @Override
    public void acelerar() {
        if (ligado) {
            if(velocidade + 10 <= VELOCIDADE_MAXIMA) {
                velocidade += 10;
                System.out.println("Acelerando... Velocidade: " + velocidade);
            }else {
                System.out.println("Velocidade máxima atingida!");
            }
        }else  {
            System.out.println("Não é possível acelerar. Carro Desligado!");
        }
    }

    @Override
    public void frear() {
        if (ligado && velocidade > 0) {
            velocidade -= 10;
            System.out.println("Freando... Velocidade: " + velocidade);
        }else  {
            System.out.println("Carro parado ou desligado.");
        }
    }

    @Override
    public int getVvelocidade() {
        return velocidade;
    }

}
