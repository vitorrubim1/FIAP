package program;

import model.Produto;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario;
        boolean novoPedido = true;
        String resposta = "";

        String path = "C:\\temp\\pedidos.txt";
        String outputFile = "C:\\temp\\total_pedidos.txt";

        while (novoPedido) {
            System.out.println("Cadastro de Pedidos - Informática");
            System.out.print("Nome do usuário: ");
            nomeUsuario = scanner.next();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                System.out.print("Quantidade de produtos: ");
                int quantidadeProdutos = scanner.nextInt();

                bw.write("\n" + nomeUsuario);
                bw.newLine();

                for (int i = 0; i < quantidadeProdutos; i++) {
                    Produto produto = new Produto();
                    System.out.printf("\nProduto %d:\n", (i + 1));

                    System.out.print("Nome do produto: ");
                    produto.setNome(scanner.next());

                    System.out.print("Quantidade: ");
                    produto.setQuantidade(scanner.nextInt());

                    System.out.print("Preço unitário: ");
                    produto.setPrecoUnitario(scanner.nextDouble());

                    String item = produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPrecoUnitario();
                    bw.write(item);
                    bw.newLine();
                }

                System.out.println("Pedido cadastrado com sucesso!");
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print("Deseja cadastrar um novo pedido? (s/n): ");
            resposta = scanner.next().toLowerCase();
            novoPedido = resposta.equals("s");
        }

        scanner.close();

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
            String line;
            String nomeUsuarioAtual = "";
            double valorTotal = 0.0;

            while ((line = br.readLine()) != null) {
                if (!line.contains(",")) {
                    if (!nomeUsuarioAtual.isEmpty()) {
                        bw.write(nomeUsuarioAtual + " - R$ " + String.format("%.2f", valorTotal));
                        bw.newLine();
                    }
                    nomeUsuarioAtual = line;
                    valorTotal = 0.0;
                } else {
                    String[] parts = line.split(",");
                    double quantidadeProduto = Double.parseDouble(parts[1]);
                    double precoUnitarioProduto = Double.parseDouble(parts[2]);
                    double valorProduto = quantidadeProduto * precoUnitarioProduto;

                    valorTotal += valorProduto;
                }
            }

            if (!nomeUsuarioAtual.isEmpty()) {
                bw.write(nomeUsuarioAtual + " - R$ " + String.format("%.2f", valorTotal));
                bw.newLine();
            }

            System.out.println("Arquivo total_pedidos.txt gerado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
