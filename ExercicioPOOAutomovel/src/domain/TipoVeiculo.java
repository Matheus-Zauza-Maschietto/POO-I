package domain;

public enum TipoVeiculo implements CalculosFipe {
    PASSEIO(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return (valorFipe/100)*12;
        }
    },
    PROFISSIONAL(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return (valorFipe/100)*14.3;
        }
    },
    TRANSPORTE(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return (valorFipe/100)*13.5;
        }
    },
    CARGA(){
        @Override
        public Double taxaFipe(Double valorFipe){
            return (valorFipe/100)*8;
        }
    };

}
