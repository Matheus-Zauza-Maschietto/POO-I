package Classes;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private int idade;

    public String getNome(){
        return this.nome;
    }
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

}
