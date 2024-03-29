package program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import model.Pessoa;
import service.EnderecoService;


public class Programa {

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
       
        int opcao;
        int id;
        String nome;
        String email;
        String numeroCasa;
        String complemento;
        String cep;
        
        EnderecoService enderecoService = new EnderecoService(); 

        do {        
            System.out.printf("===> Sistema de Cadastro de Pessoas <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir \n" +
                              "2 - Atualizar \n" +
                              "3 - Excluir \n" +
                              "4 - Exibir \n" +
                              "5 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
           
            if (opcao == 1) {
                id = listaPessoas.size() + 1;
                
                System.out.printf("\nDigite o nome: ");
                nome = ler.next();
                
                System.out.printf("\nDigite o e-mail: ");
                email = ler.next();
                
                System.out.printf("\nDigite o seu CEP: ");
                cep = ler.next();
                               
                Pessoa p = enderecoService.completaEndereco(cep);

                System.out.printf("\nDigite o numero do endereço: ");
                numeroCasa = ler.next();
                
                System.out.printf("\nDigite o complemento do endereço: ");
                complemento = ler.next();
                        
                p.setId(id);
                p.setNome(nome);
                p.setEmail(email);
                p.setNumeroCasa(numeroCasa);
                p.setComplemento(complemento);
                
                listaPessoas.add(p);
               
                System.out.printf("Pessoa incluída com sucesso!");
                System.in.read();
            }
            else if (opcao == 2) {          
                for(Pessoa a: listaPessoas) {
                    System.out.printf("ID: %d - Nome: %s - Endereço: %s \n", a.getId(), a.getNome(), a.getLogradouro());
                }
               
                System.out.printf("\nDigite o id da pessoa que deseja atualizar: ");
                id = ler.nextInt();
               
                System.out.printf("Digite o novo nome: ");
                nome = ler.next();
               
                System.out.printf("Digite o novo email: ");
                email = ler.next();
               
                Pessoa p = listaPessoas.get(id-1);
               
                p.setNome(nome);
                p.setEmail(email);
               
                System.out.printf("Pessoa atualizada com sucesso!");
                System.in.read();
            }
            else if (opcao == 3) {
                for(Pessoa a: listaPessoas) {
                    System.out.printf("ID: %d - Nome: %s - Endereço: %s \n", a.getId(), a.getNome(), a.getLogradouro());
                }
               
                System.out.printf("\nDigite o id da pessoa para exclusão: ");
                id = ler.nextInt();

                listaPessoas.remove(id-1);
               
                System.out.printf("Pessoa excluída com sucesso!");
                System.in.read();
            }
            else if (opcao == 4) {
                for(Pessoa a: listaPessoas) {
                    System.out.printf("\n\nID: %d \nNome: %s \nEndereço: %s \nBairro: %s \nCidade: %s \nEstado: %s", a.getId(), a.getNome(), a.getLogradouro(), a.getBairro(), a.getLocalidade(), a.getUf());
                }
               
                System.in.read();
            }
        }while(opcao != 5);       
    }
}