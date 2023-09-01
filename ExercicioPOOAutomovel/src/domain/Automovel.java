package domain;

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
        return this.tipoVeiculo.taxaFipe(this.valorFipe) +
                this.motorista.getEstadoCivil().taxaFipe(this.valorFipe) +
                (this.tipoEstacionamento == null ? 0 : this.tipoEstacionamento.taxaFipe(this.valorFipe));
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
