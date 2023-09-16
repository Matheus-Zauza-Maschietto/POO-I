package org.example.Exceptions;

public class ValueException extends RuntimeException{
    public ValueException(){
        super("Valor nulo maluco");
    }
}
