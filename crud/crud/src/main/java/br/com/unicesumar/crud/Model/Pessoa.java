package br.com.unicesumar.crud.Model;

public class Pessoa {
    private long id;
    private String nome;
    private String documento;
    public Pessoa(long id, String nome, String documento){
        this.id = id;
        this.nome = nome;
        this.documento = documento;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
