package domain;

public class Cliente extends Pessoa{
    private Pedido pedido;

    public Cliente(String nome,
                   String documento,
                   Endereco endereco,
                   Pedido pedido) {
        super(nome, documento, endereco);
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
