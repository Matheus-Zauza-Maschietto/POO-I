package domain;

import java.time.LocalDate;

public abstract class Pessoa {
    private int idade;
    private LocalDate dataNascimento;
    private String nome;
    public Pessoa(String nome, LocalDate dataNascimento, int idade){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }
}
