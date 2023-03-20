import java.util.Scanner;

public class GuardandoConsoantes {
                                                                                   //**COMENTÁRIOS PARA FINS DIDÁTICOS**
    public static void guardarConsoantes(int tam){
        Scanner letras = new Scanner(System.in);                                   //BIBLIOTECA PARA INPUTS DO TECLADO
        String[] consoantes = new String[tam];                                     //GUARDAR OS 10 VALORES
        //DECLARAÇÃO DE VARIÁVEIS
        int quantConsoantes = 0;
        int count = 0;
        boolean letrasMaiusculas;
        boolean letrasMinusculas;
        boolean consoante = false;
        do {
            System.out.println("Digite 10 consoantes uma por vez, se digitar outra informação não vai salvar");
            String letra = letras.next();                                         //RECEBE O VALOR DIGITADO
            int numAscii = letra.hashCode();                                      //IDENTIFICA O VALOR DO DADO DIGITADO NA TABELA ASCII
            letrasMaiusculas = (65 <= numAscii && numAscii <= 90);                //INTERVALO DAS LETRAS MAIÚSCULAS
            letrasMinusculas = (97 <= numAscii && numAscii <= 122);               //INTEVALO DAS LETRAS MINÚSCULAS
            int[] vogais = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};          //CÓDIGO DA TABELA ASCII PARA VOGAIS MAIÚSCULAS OU MINÚSCULAS
            if (letrasMaiusculas || letrasMinusculas) {                           //PERMITE ENTRAR APENAS LETRAS MAIÚSCULAS OU MINÚSCULAS
                for (int vogai : vogais) {                                        //FOR EACH PARA VERIFICAR O ARRAY DE VOGAIS
                    if (numAscii != vogai) {                                      //COMPARA SE DADO DIGITADO É DIFERENTE DE UMA VOGAL
                        consoante = true;
                    } else {
                        consoante = false;
                        break;                                                    //PARA A EXERCUÇÃO DO FOR
                    }
                }
                if (consoante) {                                                  //SE FOR UMA CONSOANTE GUARDE O VALOR, CONTE E PULE PARA O PRÓXIMO ÍNDICE
                    consoantes[count] = letra;
                    quantConsoantes++;
                    count++;
                } else {
                    System.out.println("não é uma consoante");
                }
            } else {
                System.out.println("não é uma consoante");
            }
        }
        while (quantConsoantes < consoantes.length);                              //SE PREENCHER O ARRAY PARA!

        for (String Consoante : consoantes) {                                     //FOR EACH PARA IMPRIMIR AS CONSOANTES
            System.out.print(Consoante + " ");
        }
        System.out.print("quantidade de consoantes " + quantConsoantes);          //EXIBE A QUANTIDADE DE CONSOANTES.

    }

}
