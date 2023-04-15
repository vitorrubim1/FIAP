package itens_compra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] itens_compra = new Produto[10];
        String item = null;

        System.out.println("Digite os detalhes dos produtos:");

        for (int i = 0; i < 1; i++) {
        	Produto produto = new Produto();
        	
        	System.out.printf("Produto %d:\n", (i + 1));
            
            System.out.print("Nome do produto: ");
            produto.setNome(scanner.next());
            
            System.out.print("Quantidade: ");
            produto.setQuantidade(scanner.nextInt());
            
            System.out.print("Preço unitário: ");
            produto.setPreco_unitario(scanner.nextDouble());
            
            itens_compra[i] = produto;
        }

        String path = "/home/vitor/eclipse-workspace/ddd/aula15/lista.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Produto produto : itens_compra) {
                if (produto != null) {
                    item = produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPreco_unitario();
                    bw.write(item);
                    bw.newLine();
                }
            }
            System.out.println("Lista de compras gravada com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	scanner.close();
        }
    }
}
