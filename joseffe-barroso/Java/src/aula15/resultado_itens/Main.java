package resultado_itens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String inputFile = "/home/vitor/eclipse-workspace/ddd/aula15/lista.txt";
        String outputFile = "/home/vitor/eclipse-workspace/ddd/aula15/total.txt";

        FileReader fr = null;
        BufferedReader br = null;
       
        try {
            fr = new FileReader(inputFile);
            br = new BufferedReader(fr);


            String line = br.readLine();


            while(line != null){
            	String[] produto = line.split(",");
                double total = Double.parseDouble(produto[1]) * Double.parseDouble(produto[2]);
                
                String linha = produto[0] + "," + total;
                
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
                    bw.write(linha);
                    bw.newLine();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }

                line = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro ao ler o arquivo - " + e.getMessage());
        }
        finally {
            try{
                if (br != null)
                    br.close();


                if (fr != null)
                    fr.close();
            }
            catch(IOException e) {
                System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
            }
        }
    }
}
