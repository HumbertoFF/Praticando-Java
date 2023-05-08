package main.java;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class UncheckedException {
    public static void main() {
        JOptionPane.showMessageDialog(null,"Faça uma divisão de dois inteiros!");
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        
        try{
            double resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
            JOptionPane.showMessageDialog(null,"Resultado: "+ resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número inteiro");
            //throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"Não é possível dividir o número por zero");
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Chegou no finally!");
        }
        System.out.println("O código continua...");

    }

    private static int dividir(int a, int b) {

        return a/b;
    }


}
