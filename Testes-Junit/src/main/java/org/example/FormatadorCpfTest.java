package org.example;
import org.junit.Assert;
import org.junit.Test;

public class FormatadorCpfTest {
    @Test
    public void deveFormatarCpf(){
        Funcionario funcionario = new Funcionario("11111111111", "Matheus", "088.555.439-62", new Endereco("Rua campos sales", "638"));
        funcionario.formatarCpf();

        Assert.assertEquals(11, funcionario.getCpf().length());
    }
}
