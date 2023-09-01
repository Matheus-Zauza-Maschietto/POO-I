package domain;

public enum TipoEstacionamento implements CalculosFipe {
    PORTAO_AUTOMATICO(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return -(valorFipe/100)*4.5;
        }
    },
    PORTAO_MANUAL(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return -(valorFipe/100)*2;
        }
    };
}
