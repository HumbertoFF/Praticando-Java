package test.java;


import main.java.CheckedException;
import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExceptionsTeste {
    @Order(2)
    @Test
    void testeSemExcessoes(){
        Assertions.assertDoesNotThrow( () ->
                CheckedException.imprimirArquivoDeTexto("arquivoDeTexto.txt"));
    }
    @Order(1)
    @Test
    void testeComExcessoes(){
        Assertions.assertThrows(NullPointerException.class, () ->
                CheckedException.imprimirArquivoDeTexto(String.valueOf(null)));
    }
}
