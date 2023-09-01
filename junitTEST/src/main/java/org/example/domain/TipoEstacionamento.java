package org.example.domain;

public enum TipoEstacionamento implements CalculosFipe {
    PORTAO_AUTOMATICO(){
        @Override
        public Double taxaFipe(Double valorSeguro){
            return -(valorSeguro/100)*4.5;
        }
    },
    PORTAO_MANUAL(){
        @Override
        public Double taxaFipe(Double valorSeguro){
            return -(valorSeguro/100)*2;
        }
    };
}
