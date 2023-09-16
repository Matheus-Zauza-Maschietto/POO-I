package org.example;
import org.example.domain.*;

public class Main {
    public static void main(String[] args) {
        Automovel carroProfissional = new Automovel(1000,
                TipoVeiculo.PASSEIO,
                new Motorista(EstadoCivil.CASADO)
        );
        System.out.println(carroProfissional.calculaSeguro());

    }
}