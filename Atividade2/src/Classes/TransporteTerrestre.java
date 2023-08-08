package Classes;

public class TransporteTerrestre extends Transportadora{
    @Override
    public double calculaFrete(int largura, int altura){
        return (double) ((largura+altura)/100)*20;
    }
}
