package JavaPOO.ContaBanco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String titular;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tip) {
        this.setTipo(tip);
        this.setStatus(true);
        if (tip == "cc") {
            this.saldo = 50.0F;
        } else if (tip == "cp") {
            this.saldo = 150.0F;
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.saldo > 0.0F) {
            System.out.println("Conta com Dinheiro!");
        } else if (this.saldo < 0.0F) {
            System.out.println("Conta em débito!");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(float v) {
        if (this.status) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta " + this.getTitular());
        } else {
            System.out.println("Impossível depositar");
        }

    }

    public void sacar(float v) {
        if (this.status) {
            if (this.saldo > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso! Saldo atual: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar!");
        }

    }

    public void pagarMensal() {
        if (this.tipo == "cc") {
            float v = 12.0F;
        } else if (this.tipo == "cp") {
            float v = 20.0F;
            if (this.status) {
                if (this.saldo > v) {
                    this.saldo -= v;
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
        } else {
            System.out.println("Impossível pagar!");
        }

    }

    public void Construtor() {
        this.saldo = 0.0F;
        this.status = false;
    }

    public int getnumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String ti) {
        this.titular = ti;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }
}