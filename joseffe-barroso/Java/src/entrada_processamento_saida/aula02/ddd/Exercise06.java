package ddd;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double quotation, dolar, result;

		System.out.println("Qual a cotação atual?");
		quotation = scanner.nextDouble();

		System.out.println("Qual a quantidade em Dolar (US$)?");
		dolar = scanner.nextDouble();

		result = quotation * dolar;

		System.out.printf("A quantidade final é: %f", result);

		scanner.close();
	}

}
