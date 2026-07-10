package Java_Exercicios_POO.FuncionamentoCarro;

public class Carro {
    private String modelo;
    private int ano;
    private boolean estado;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
        this.estado = false;
    }

    public void ligar(){
        estado = true;
        System.out.println("Você ligou o carro!");
    }

    public void desligar(){
        estado = false;
        System.out.println("Carro está desligado!");
    }

    public void mostrarStatus(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Estado atual: " + (estado ? "Ligado!" : "Desligado!"));
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
}
