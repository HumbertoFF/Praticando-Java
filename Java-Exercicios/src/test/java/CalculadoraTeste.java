package test.java;

import main.java.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTeste {
//Exemplos simples de testes unitários
    @Test
    void testeDeSoma(){
        Assertions.assertEquals(10,Calculadora.soma(3.0,7.0));
    }
    @Test
    void testeDeSubtracao(){
        Assertions.assertEquals(30,Calculadora.subtracao(56d,26d));
    }
    @Test
    void testeDeDivisao(){
        Assertions.assertEquals(5,Calculadora.divisao(20,4));
    }
    @Test
    void testeDeMultiplicacao(){
        Assertions.assertEquals(30,Calculadora.multiplicacao(5,6));
    }

}
