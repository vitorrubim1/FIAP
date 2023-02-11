package program;

import java.io.IOException;
import java.util.Scanner;

import service.ConverterService;
import model.Coin;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    	int option;
    	double value;

    	ConverterService converter_service = new ConverterService();

        try {
        	System.out.printf("Qual o valor em R$: ");
        	value = scanner.nextDouble();
        	
          	System.out.println("Deseja converter para: ");
          	System.out.println("1 - Dólar: ");
          	System.out.println("2 - Euro: ");
          	System.out.println("3 - Bitcoin: ");
          	
          	System.out.printf("Digite o número da opção: ");
          	option = scanner.nextInt();
          	
          	
        	
          	Coin response = converter_service.getCoinResult(option);
          	Double coin = response.showResult(value);
           
            System.out.println(coin);
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        scanner.close();
	}

}
