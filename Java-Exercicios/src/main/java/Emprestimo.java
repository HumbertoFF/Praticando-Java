package main.java;

public class Emprestimo {
    Emprestimo(){
    }

    public static double getJurosParcelas(int n){
        double juros = 0;
        switch(n){
            case 1:
                juros = 1.10;
                System.out.println("1 parcela com juros a " + juros + "% ");
                return juros;
            case 2:
                juros = 1.20;
                System.out.println("2 parcela com juros a" + juros + "% ");
                return juros;
            case 3:
                juros = 1.30;
                System.out.println("3 parcela com juros a " + juros + "% ");
                return juros;
            case 4:
                juros = 1.40;
                System.out.println("4 parcela com juros a " + juros + "% ");
                return juros;
            case 5:
                juros = 1.50;
                System.out.println("5 parcela com juros a " + juros + "% ");
                return juros;
            case 6:
                juros = 1.60;
                System.out.println("6 parcela com juros a " + juros + "% ");
                return juros;
            case 7:
                juros = 1.70;
                System.out.println("7 parcela com juros a " + juros + "% ");
                return juros;
            case 8:
                juros = 1.80;
                System.out.println("8 parcela com juros a " + juros + "% ");
                return juros;
            case 9:
                juros = 1.90;
                System.out.println("9 parcela com juros a " + juros + "% ");
                return juros;
            case 10:
                juros = 2.0;
                System.out.println("10 parcela com juros a " + juros + "% ");
                return juros;
            default:
                return 0.0d;
        }
    }
    public static double calculaEmprestimo(double valor, int parcelas){
        double valorAPagar = valor * getJurosParcelas(parcelas);
        System.out.println("Para o valor de R$"+ valor+ " o total do emprestimo para pagar é R$ "+valorAPagar);
        return valorAPagar;
    }
}
