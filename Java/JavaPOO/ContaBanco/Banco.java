package JavaPOO.ContaBanco;

public class Banco {
    public int numConta;
    protected String tipo; //cc: conta corrente e cp: conta poupança
    private String titular;
    private float saldo;
    private boolean status;


    public void abrirConta(String tip){
        setTipo(tip);
        setStatus(true);
        if (tip == "cc"){
            saldo = 50;
        }else if (tip == "cp"){
            saldo = 150;
        }

    }

    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta com Dinheiro!");
        }else if (saldo < 0){
            System.out.println("Conta em débito!");
        }else{
            setStatus(false);
        }
    }

    public void depositar(float v){
        if (status == true){
            setSaldo(getSaldo() + v);
        }else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float v){
        if (status == true){
            if (saldo > v){
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensal() {
        float v;
        if (tipo == "cc") {
            v = 12;
        } else if (tipo == "cp") {
            v = 20;
            if (status == true) {
                if (saldo > v) {
                    saldo = saldo - v;
                }else{
                    System.out.println("Saldo insuficiente!");
                }
            }
        }else {
            System.out.println("Impossível pagar!");
        }
    }
    public void Construtor() {
        saldo = 0;
        status = false;
    }

    public int getnumConta(){
        return numConta;
    }

    public void setNumConta(int n){
        numConta = n;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tip){
        tipo = tip;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String ti){
        titular = ti;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float s){
        saldo = s;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean sta){
        status = sta;
    }
}
