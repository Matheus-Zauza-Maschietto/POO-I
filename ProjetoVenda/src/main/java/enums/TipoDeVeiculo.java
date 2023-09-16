package enums;

import java.security.PublicKey;

public enum TipoDeVeiculo {
    CAMINHAO(100),
    CARRO(50),
    KOMBI(75);

    TipoDeVeiculo(Integer capacidadeDeVeiculo){
        this.capacidadeDeVeiculo = capacidadeDeVeiculo;
    }

    private Integer capacidadeDeVeiculo;
}
