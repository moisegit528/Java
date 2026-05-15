package Desafios.CadastrodeUsuario;

public class Cadastro {
    private String nome;
    private int idade;
    private String email;

    public Cadastro(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Email: " + this.getEmail());
    }

    public void validarCadastro(){
        if (idade >= 18){
            System.out.println("Cadastro concluído com sucesso!");
        }else{
            System.out.println("Cadastro não pode ser concluído, pois é menor de idade!");
        }
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.setNome();
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(){
        this.setIdade();
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.setEmail();
    }
}
