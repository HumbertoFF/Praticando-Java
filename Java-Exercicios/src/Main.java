import main.java.Calculadora;
import main.java.Emprestimo;
import main.java.PraticandoSet;
import main.java.UncheckedException;

import static main.java.GuardandoConsoantes.guardarConsoantes;


public class Main {
    public static void main(String[] args) {

    //Guardar uma lista de consoantes de acordo do tamanho informado, não aceita outras entradas para incluir na lista.
    //guardarConsoantes(10);


    //Calculadora retorna o valor da operação no método chamado, que inclui soma, subtracao, multiplicao e divisao,
    //apesar de métodos simples o foco é implementar cálculos que podem ser feitos nos métodos e retornando de forma automática o resultado.

    //Calculadora.multiplicacao(30,12);
    //Calculadora.divisao(100,5);
    //Calculadora.subtracao(1320,5);
    //Calculadora.soma(320,12);


    //Calcula o emprestimo a juros simples recebendo o valor de entrada e a quantidade de parcelas.
    //Emprestimo.calculaEmprestimo(50000,8);
    //Emprestimo.calculaEmprestimo(12200, 2);
    //Emprestimo.calculaEmprestimo(1230000, 6);
    //Emprestimo.calculaEmprestimo(4200, 5);
    //Emprestimo.calculaEmprestimo(4000, 2);


    //praticando Collection Set
    // PraticandoSet.collectionSet();

    // praticando Exception que serve para tratar erros ou comportamentos inesperados do usuário
        //O exemplo é de uma divisão de dois números inteiros, que se o usuário digitar outro dado que não seja números inteiros,
        //por exemplo uma letra ou números quebrados e se digitar zero no denominador, aparecerá uma mensagem informando o problema.
    UncheckedException.main();
    }

}