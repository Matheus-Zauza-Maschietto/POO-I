package domain;

public class Estacionamento {
    private TipoEstacionamento tipoEstacionamento;

    public Estacionamento(){    }

    public Estacionamento(TipoEstacionamento tipoEstacionamento){
        this.tipoEstacionamento = tipoEstacionamento;
    }

    public TipoEstacionamento getTipoEstacionamento(){
        return this.tipoEstacionamento;
    }
}
