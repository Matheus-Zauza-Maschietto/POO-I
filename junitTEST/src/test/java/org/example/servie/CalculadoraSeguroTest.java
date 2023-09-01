package org.example.servie;
import org.example.domain.Automovel;
import org.example.domain.EstadoCivil;
import org.example.domain.Motorista;
import org.example.domain.TipoVeiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraSeguroTest {

    @Test
    public void deveCalcularSolteiroSemEstacionamentoComVeiculoProfissional(){
        Automovel solteiroSemEstacionamento = new Automovel(45000, TipoVeiculo.PROFISSIONAL, new Motorista(EstadoCivil.SOLTEIRO));

        Assertions.assertEquals(10035, solteiroSemEstacionamento.calculaSeguro());
    }

    @Test
    public void deveCalcularSolteiroSemEstacionamentoComVeiculoDePasseio(){
        Automovel solteiroSemEstacionamento = new Automovel(45000, TipoVeiculo.PASSEIO, new Motorista(EstadoCivil.SOLTEIRO));

        Assertions.assertEquals(9000, solteiroSemEstacionamento.calculaSeguro());
    }

}
