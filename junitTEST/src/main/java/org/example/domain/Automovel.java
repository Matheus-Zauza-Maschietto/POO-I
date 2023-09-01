package org.example.domain;

public class Automovel {
    private double valorFipe;
    private TipoVeiculo tipoVeiculo;

    private Motorista motorista;
    private TipoEstacionamento tipoEstacionamento;

    public Automovel(double valorFipe, TipoVeiculo tipoVeiculo, Motorista motorista, TipoEstacionamento tipoEstacionamento) {
        this.valorFipe = valorFipe;
        this.tipoVeiculo = tipoVeiculo;
        this.motorista = motorista;
        this.tipoEstacionamento = tipoEstacionamento;
    }

    public Automovel(double valorFipe, TipoVeiculo tipoVeiculo, Motorista motorista) {
        this.valorFipe = valorFipe;
        this.tipoVeiculo = tipoVeiculo;
        this.motorista = motorista;
    }

    public double calculaSeguro() {
        double tipoVeiculo = this.tipoVeiculo.taxaFipe(this.valorFipe);
        double preValorSeguro =  tipoVeiculo +
                this.motorista.getEstadoCivil().taxaFipe(this.valorFipe);
        return preValorSeguro+
                (this.tipoEstacionamento == null ? 0 : this.tipoEstacionamento.taxaFipe(preValorSeguro));
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public TipoVeiculo getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public Motorista getMotorista() {
        return this.motorista;
    }
}
