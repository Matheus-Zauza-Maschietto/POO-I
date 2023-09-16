package domain;

public class Produto {
    private String nome;
    private Double peso;
    private Double preco;

    public Produto(String nome, Double peso, Double preco){
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getPeso(){
        return this.peso;
    }

    public Double getPreco(){
        return this.preco;
    }
}
