package domain;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String complemento;

    public Endereco(String rua,
                    String numero,
                    String bairro,
                    String cidade,
                    String uf){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.uf = uf;
        this.cidade = cidade;
    }
}
