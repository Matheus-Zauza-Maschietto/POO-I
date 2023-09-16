package org.example.service;

import org.example.Exceptions.CpfException;
import org.example.services.FormaterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormaterServiceTest {

    @Test
    public void deveFormatarCpf(){
        FormaterService formatador = new FormaterService();
        String valida = formatador.formatadorCpf("123.123.123-88");

        Assertions.assertEquals("12312312388", valida);
    }

    @Test
    public void deveFormatarCpfInvalido(){
        FormaterService formatador = new FormaterService();

        Assertions.assertThrows(CpfException.class, () -> formatador.formatadorCpf("123.123.123-88.123"));
    }
}
