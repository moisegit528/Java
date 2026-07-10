package Polimorfismo.Ex1;

public class Cobra extends Polimorfismo.Ex1.Reptil {
    @Override
    public void locomover(){
        System.out.println("Rastejando formando um S");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Ratos");
    }
}
