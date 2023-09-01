package org.example;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    public Pessoa(String nome, String cpf, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void formatarCpf(){
        String cpf = this.cpf;
        cpf = cpf.replace(".", "").replace("-", "").strip();
        //cpf = cpf.substring(0, 3)+"."+cpf.substring(3, 6)+"."+cpf.substring(6, 9)+"-"+cpf.substring(9);
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf(){
        return  this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
