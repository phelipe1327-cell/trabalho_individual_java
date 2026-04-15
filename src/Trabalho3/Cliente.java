package Trabalho3;

public class Cliente {
    private String nome;
    private String cpf;
    private Integer idade;

    public Cliente(String nome, String cpf, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
//NOME
    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            System.out.println("Nome Inválido");
        }
        else{
            this.nome = nome;
        }
    }
    public String getNome() {
        return nome;
    }
//CPF
    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("CPF inválido");
        }
        else{
            this.cpf = cpf;
        }
    }
    public String getCpf() {
        return cpf;
    }
//IDADE
    public void setIdade(Integer idade) {
        if(idade == null || idade < 18){
            System.out.println("Idade inválida");
        }
        else{
            this.idade = idade;
        }
    }
    public Integer getIdade() {
        return idade;
    }
}
