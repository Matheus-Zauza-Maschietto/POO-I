package sistemaFolha;

public enum Cargo {
    PROGRAMADOR(1){
        @Override
        public Double calculaSalario(){
            return 100d;
        }
    },
    DBA(2){
        @Override
        public Double calculaSalario(){
            return 20d;
        }
    },
    GUARDA_TRANSITO(2){
        @Override
        public Double calculaSalario(){
            return 39d;
        }
    },
    ANALISTA(3){
        @Override
        public Double calculaSalario(){
            return 75934d;
        }
    },
    MARKETING(4){
        @Override
        public Double calculaSalario(){
            return 3593d;
        }
    };

    private Integer codigo;
    Cargo(Integer codigo){
        this.codigo = codigo;
    }

    abstract Double calculaSalario();
}
