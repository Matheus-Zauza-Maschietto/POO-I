package domain;

public class Estagiario implements Cargo{
    private double salarioBase = 800;
    @Override
    public double valorSalario(Movimentacao movimentacao){
        return salarioBase;
    }
}
