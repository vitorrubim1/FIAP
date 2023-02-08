package program;


import java.io.IOException;
import java.util.Scanner;

import model.Endereco;
import service.ViaCepService;


public class Teste {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	String cep;

        ViaCepService viacepservice = new ViaCepService();


        try {
        	System.out.printf("Digite o CEP: ");
        	cep = scanner.next();
        	
            Endereco endereco = viacepservice.getEndereco(cep);
           
            System.out.println(endereco + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        scanner.close();
    }
}


