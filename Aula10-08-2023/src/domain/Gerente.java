package domain;

public class Gerente implements Cargo{
    private double salarioBase = 7000;
    @Override
    public double valorSalario(Movimentacao movimentacao){
        return this.salarioBase;
    }
}
