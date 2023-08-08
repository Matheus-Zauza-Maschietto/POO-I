package Classes;

public class TransporteNautico extends Transportadora{
    @Override
    public double calculaFrete(int largura, int altura){
        return (double) ((largura+altura)/100)*10;
    }
}

