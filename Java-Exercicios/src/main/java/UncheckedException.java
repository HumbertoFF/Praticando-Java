package main.java;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        
        try{
            int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
            System.out.println("Resultado: "+ resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número inteiro" + e.getMessage());
            //throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"Não é possível dividir o número por zero " + e.getMessage());
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Chegou no finally!");
        }
        System.out.println("O código continua...");

    }

    private static int dividir(int a, int b) { return  a/b;
    }
}
