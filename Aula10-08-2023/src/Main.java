import domain.Funcionario;
import domain.Movimentacao;
import domain.Programador;
import domain.TipoCargo;

import javax.annotation.processing.SupportedSourceVersion;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario matheus = new Funcionario("Matheus",
                                            10,
                                            new Programador(),
                                            LocalDate.of(2000, 10, 12), 19,
                                            new Movimentacao(10, 10, 10),
                                            TipoCargo.CLT);

        System.out.println(matheus.getSalario());

    }
}