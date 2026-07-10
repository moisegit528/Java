package RelacionamentoClasses;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {return nome;}
    public void setNome(String no) {this.nome = no;}

    public String getNacionalidade() {return nacionalidade;}
    public void setNacionalidade(String na) {this.nacionalidade = na;}

    public int getIdade() {return idade;}
    public void setIdade(int id) {this.idade = id;}

    public float getAltura() {return altura;}
    public void setAltura(float al) {this.altura = al;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso; this.setCategoria();}

    public String getCategoria() {return categoria;}
    private void setCategoria() {
        if (this.peso <52.2) {
            this.categoria = "Invalido";
        }else if (this.peso < 70.3) {
            this.categoria = "Leve";
        }else if (this.peso < 83.9) {
            this.categoria = "Médio";
        }else if (this.peso < 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {return vitorias;}
    public void setVitorias(int vi) {this.vitorias = vi;}

    public int getDerrotas() {return derrotas;}
    public void setDerrotas(int de) {this.derrotas = de;}

    public int getEmpates() {return empates;}
    public void setEmpates(int em) {this.empates = em;}


    public void apresentar(){
        System.out.println("Nome do Lutador: " + getNome());
        System.out.println("Nacionalidade do Lutador: " + getNacionalidade());
        System.out.println("Idade do Lutador: " + getIdade() + " anos");
        System.out.println("Altura do lutador: " + getAltura() + " de altura");
        System.out.println("Pesando: " + getPeso() + " kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }
    public void ganhaLuta(){setVitorias(getVitorias()+1);}
    public void perderLuta(){setVitorias(getVitorias()+1);}
    public void empatarLuta(){setEmpates(getEmpates()+1);}

}
