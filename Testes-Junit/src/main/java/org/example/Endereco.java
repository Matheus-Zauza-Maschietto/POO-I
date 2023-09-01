package org.example;

public class Endereco {
    private String logradouro;
    private String numero;

    public Endereco(String logradouro, String numero){
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
}
