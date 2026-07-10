package Polimorfismo.Ex1;

public class Animal {
    protected float peso;
    protected int idade;
    protected int membros;


    public void locomover(){
        System.out.println("Correndo");
    }
    public void alimentar(){
        System.out.println("Comendo");
    }
    public void emitirSom(){
        System.out.println("Emitindo som");
    }
}
