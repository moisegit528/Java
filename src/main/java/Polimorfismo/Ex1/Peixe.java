package Polimorfismo.Ex1;

public class Peixe extends Animal{
    protected String corEscama;

    public String getCorEscama() {return corEscama;}
    public void setCorEscama(String corEscama) {this.corEscama = corEscama;}

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não emiti Som");
    }

    public void soltarBolha(){

    }
}
