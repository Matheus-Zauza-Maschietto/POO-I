package domain;

public class Analista implements Cargo{
    private double salarioBase = 2000;
    @Override
    public double valorSalario(Movimentacao movimentacao){
        return this.salarioBase;
    }
}
