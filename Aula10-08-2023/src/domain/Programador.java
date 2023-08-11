package domain;

public class Programador implements Cargo{
    private double salarioBase = 3500;
    @Override
    public double valorSalario(Movimentacao movimentacao){
        if(movimentacao.getQuantidadeFalta() > 0 || movimentacao.getQuantidadeAfastamento() > 0){
            return this.salarioBase - (this.salarioBase / 30 * movimentacao.getQuantidadeFalta());
        }
        return this.salarioBase;
    }
}
