import Classes.TransporteNautico;
import Classes.TransporteTerrestre;

public class Main {
    public static void main(String[] args) {
        TransporteNautico nautico = new TransporteNautico();
        TransporteTerrestre terrestre = new TransporteTerrestre();
        System.out.println(terrestre.calculaFrete(10, 10));
        System.out.println(nautico.calculaFrete(10,10));
    }
}