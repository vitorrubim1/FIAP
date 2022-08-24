package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double quotation, dolar, amountInReais;
		
		System.out.println("Qual a cotação atual?");
		quotation = scanner.nextDouble();
		
		System.out.println("Qual a quantidade em Dolar (US$)?");
		dolar = scanner.nextDouble();
		
		amountInReais = quotation * dolar;
		
		System.out.printf("A quantidade final é: %f", amountInReais);
		
		scanner.close();
	}

}
