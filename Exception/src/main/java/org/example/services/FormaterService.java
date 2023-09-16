package org.example.services;

import org.example.Exceptions.CpfException;
import org.example.Exceptions.ValueException;

public class FormaterService{
    public String formatadorCpf(String cpf){
        if(cpf == null){
            throw new ValueException();
        }

        String resultado = cpf.replaceAll("\\.|\\-", "");

        if(resultado.length() > 11){
            throw new CpfException();
        }
        return  resultado;
    }
}
