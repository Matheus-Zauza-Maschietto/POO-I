package domain;

public enum EstadoCivil implements CalculosFipe {
    SOLTEIRO(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return (valorFipe/100)/8;
        }
    },
    CASADO(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return -(valorFipe/100)*2.5;
        }
    },
    VIUVO(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return -(valorFipe/100)*5;
        }
    },
}
