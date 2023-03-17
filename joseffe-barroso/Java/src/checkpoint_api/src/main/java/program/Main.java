package program;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import model.Comentario;
import model.Filme;
import service.FilmeService;

public class Main {

    public static void main(String[] args) throws ClientProtocolException, IOException {
        Scanner ler = new Scanner(System.in);
       
        HashMap<Integer, Filme> filmes = new HashMap<Integer, Filme>();
        FilmeService filmeService = new FilmeService();

        filmes = filmeService.getFilmes();
       
        int opcao;
        int idFilme;
        String comentarioTexto;
        
        do {       
        	System.out.printf("\n\n===> Lista de Filmes <===\n\n");
        	for (Filme filme : filmes.values()) {
        	    System.out.println(filme.getNomeComId());
        	}

        	
            System.out.printf("\n\n===> Sistema de Filmes <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Ver detalhes do filme\n" +
                              "2 - Criar comentário\n" +
                              "3 - Excluir comentário\n" +
                              "4 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            ler.nextLine();
           
            if (opcao == 1) {
                System.out.printf("\nDigite o ID do filme: ");
                idFilme = ler.nextInt();
                ler.nextLine();
                
                if (filmes.containsKey(idFilme)) {
                    Filme filme = filmes.get(idFilme);
                    System.out.printf("\nDetalhes do filme %s:\n", filme.getNome());
                    System.out.printf("Sinopse: %s\n", filme.getSinopse());
                    filme.exibirComentarios();
                } else {
                    System.out.printf("\nFilme não encontrado.");
                }
                
                System.in.read();
            }
            else if (opcao == 2) {          
                System.out.printf("\nDigite o ID do filme: ");
                idFilme = ler.nextInt();
                ler.nextLine();
                
                if (filmes.containsKey(idFilme)) {
                    Filme filme = filmes.get(idFilme);
                    
                    System.out.printf("\nDigite o comentário: ");
                    comentarioTexto = ler.nextLine();
                    
                    Comentario novoComentario = new Comentario(comentarioTexto);
                    filme.adicionarComentario(novoComentario);
                    
                    System.out.printf("\nComentário adicionado com sucesso!");
                } else {
                    System.out.printf("\nFilme não encontrado.");
                }
                
                System.in.read();
            }
            else if (opcao == 3) {
                System.out.printf("\nDigite o ID do filme: ");
                idFilme = ler.nextInt();
                ler.nextLine();
                
                if (filmes.containsKey(idFilme)) {
                    Filme filme = filmes.get(idFilme);
                    
                    for (Comentario comentario : filme.getComentarios().values()) {
                        System.out.printf("ID: %d - Comentário: %s \n", comentario.getId(), comentario.getTexto());
                    }
                    
                    System.out.printf("\nDigite o ID do comentário para exclusão: ");
                    int idComentario = ler.nextInt();
                    
                    if (filme.excluirComentario(idComentario)) {
                        System.out.printf("\nComentário excluído com sucesso!");
                    } else {
                        System.out.printf("\nComentário não encontrado.");
                    }
                } else {
                    System.out.printf("\nFilme não encontrado.");
                }
                
                System.in.read();
            }
        } while(opcao != 4);       
    }
}
