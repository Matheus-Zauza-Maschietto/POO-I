package org.example.domain;

public class Motorista {
    private EstadoCivil estadoCivil;

    public Motorista(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public EstadoCivil getEstadoCivil(){
        return this.estadoCivil;
    }
}
