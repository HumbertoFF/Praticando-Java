import main.java.Calculadora;
import main.java.Emprestimo;
import main.java.PraticandoSet;
import main.java.Series;

import java.io.IOException;
import java.lang.ref.Cleaner;
import java.util.*;

import static main.java.CheckedException.imprimirArquivoDeTexto;
import static main.java.CheckedException.imprimirArquivoNoConsole;
import static main.java.GuardandoConsoantes.guardarConsoantes;


public class Main {
    public static void main(String[] args) throws IOException {

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
    //PraticandoSet.collectionSet();

      /*  System.out.println("--\tOrdem aleatória\t--");
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("got","fantasia",60));
            add(new Series("dark","drama",60));
            add(new Series("that 70s show","comédia",25));
        }};
        for (Series series: minhasSeries) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\t Ordem natural (TempoEpisodio\t --");
        //Foi necessário implementar o método comparable
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Series series: minhasSeries2) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem  Nome/Genero/TempoEpisodio\t--");
        Set<Series> minhasSeries3 = new TreeSet<>(new Comparator<Series>() {
            @Override
            public int compare(Series o1, Series o2) {
                int nome = o1.getNome().compareTo(o2.getNome());
                if(nome != 0) return nome;

                int genero = o1.getGenero().compareTo(o2.getGenero());
                if(genero != 0) return genero;

                return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
            }
        });
        minhasSeries3.addAll(minhasSeries);
        for (Series series: minhasSeries3) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
*/
/*
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("celta",13.4);
            put("uno",15.4);
            put("pálio",11554);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo de gol por 15,2 km/l");
        carrosPopulares.put("gol",15.2);

        System.out.println("Confira se o modelo tucson está no dicionário");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno " + carrosPopulares.get("uno"));

        System.out.println("Exiba todos os modelos: " + carrosPopulares.keySet());

        System.out.println(carrosPopulares.values().toString());
*/
        imprimirArquivoDeTexto("arquivoDeTexto.txt");


        //Manipulação de um Set<String> para se tornar uma string personalizada dentro de uma única variável. Com separação por ponto e virgula
        // útil para utilização no front.
        String doc1 = "Negativa do benefício junto ao INSS ou requerimento de entrada, após 120 dias";
        String doc2 = "Cadastro Único Atualizado";
        String doc3 = "Comprovante de residência";

        Set<String> documentos =  new HashSet<>();
        documentos.add(doc1);
        documentos.add(doc2);
        documentos.add(doc3); 
        System.out.println(documentos);
        String texto = "";
        for (String documento : documentos) {
            texto = texto.concat(String.format(" "+documento+";",documento));
        }
        System.out.println(texto);

    }

}