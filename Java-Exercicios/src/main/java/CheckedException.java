package main.java;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void imprimirArquivoDeTexto(String nomeDoArquivo) {
        //variável com o nome do arquivo para ser passado por parâmetro
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch ( FileNotFoundException e){
            //tratando erro de arquivo não encontrado.
            System.out.println("Verifique o nome do arquivo");
        }
        catch (IOException e) {
            //Erro genérico que não dá pra saber o que vai acontecer.
            JOptionPane.showMessageDialog(null,"O correu um erro inesperado");
        }
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        //cria um arquivo qualquer e o nomeia
        File file = new File(nomeDoArquivo);
        //Realiza um Buffered de leitura para o arquivo informado
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        //Realiza um Buffered de escrita para o arquivo informado
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();
        }
}
