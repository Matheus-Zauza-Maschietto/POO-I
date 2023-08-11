package domain;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private TipoCargo tipoCargo;
    private int matricula;
    private Cargo cargo;
    private Movimentacao movimentacao;
    public Funcionario(String nome, int matricula, Cargo cargo, LocalDate dataNascimento, int idade, Movimentacao movimentacao, TipoCargo tipoCargo){
        super(nome, dataNascimento, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.movimentacao = movimentacao;
        this.tipoCargo = tipoCargo;
    }
    public Cargo getCargo(){
        return this.cargo;
    }

    public double getSalario(){
        return this.cargo.valorSalario(this.movimentacao);
    }
    public Movimentacao getMovimentacao(){
        return this.movimentacao;
    }
}
