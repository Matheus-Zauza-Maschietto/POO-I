package domain;

public class Pessoa {
    private String nome;
    private String documento;
    private Endereco endereco;
    public Pessoa(String nome, String documento, Endereco endereco){
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
