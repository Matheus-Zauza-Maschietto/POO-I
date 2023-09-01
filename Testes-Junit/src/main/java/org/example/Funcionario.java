package org.example;

public class Funcionario extends Pessoa{
    private String matricula;
    public Funcionario(String matricula, String nome, String cpf, Endereco endereco){
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
