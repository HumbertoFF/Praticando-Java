package main.java;

public class Calculadora {

    double a;
    double b;

    Calculadora( double a, double b) {
        this.a = a;
        this.b = b;

        System.out.println("Os valores de entradas são: " + a + " e " + b );

    }

    public static double soma(double a, double b) {
        new Calculadora(a, b);
        double resultado = a + b;
        System.out.println("O resultado da soma é " + resultado);
        return resultado ;
    }
    public static double subtracao(double a, double b) {
        new Calculadora(a, b);
        double resultado = a - b;
        System.out.println("O resultado da subtração é " + resultado);
        return resultado ;
    }
    public static double divisao(double a, double b) {
        new Calculadora(a, b);
        double resultado = a / b;
        System.out.println("O resultado da divisão é " + resultado);
        return resultado ;
    }
    public static double multiplicacao(double a, double b) {
        new Calculadora(a, b);
        double resultado = a * b;
        System.out.println("O resultado da multiplicação é " + resultado);
        return resultado ;
    }


}
