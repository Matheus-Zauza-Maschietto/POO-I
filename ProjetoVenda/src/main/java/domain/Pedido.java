package domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer numero;
    private List<Produto> produtos = new ArrayList<Produto>();

    public Pedido(Integer numero, List<Produto> produtos){
        this.numero = numero;
        this.produtos = produtos;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Double getValorTotal(){
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    public Integer getQuantidade(){
        return this.produtos.size();
    }
}
