package domain;

public class Movimentacao {
    private int quantidadeFalta;
    private int quantidadeAfastamento;
    private int quantidadeFerias;

    public Movimentacao(int quantidadeAfastamento, int quantidadeFalta, int quantidadeFerias){
        this.quantidadeAfastamento = quantidadeAfastamento;
        this.quantidadeFalta = quantidadeFalta;
        this.quantidadeFerias = quantidadeFerias;
    }

    public int getQuantidadeFalta(){
        return this.quantidadeFalta;
    }
    public int getQuantidadeAfastamento(){
        return this.quantidadeAfastamento;
    }
    public int getQuantidadeFerias(){
        return this.quantidadeFerias;
    }
}
