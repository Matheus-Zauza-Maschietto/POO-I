package sistemaFolha;

public class Calculadora {
    public Double calculaSalario(Funcionario funcionario){
        switch (funcionario.getCargo()){
            case PROGRAMADOR:
                return 100.00;
            case DBA:
                return 200.00;
            case ANALISTA:
                return 300.00;
            case MARKETING:
                return 6000000000D;
            default:
                return 0.0;
        }
    }
}
