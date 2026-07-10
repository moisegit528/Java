package Polimorfismo.Ex1;

public class Tartaruga extends Reptil {
    @Override
    public void locomover(){
        System.out.println("Rastejando bem devagar");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo melancia");
    }
}
