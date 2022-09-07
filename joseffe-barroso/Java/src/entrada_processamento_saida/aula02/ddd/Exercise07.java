package ddd;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double productOneValue, productTwoValue, productThirdValue, productFourthValue, productFifthValue,
				productsValue, payment, result;

		System.out.println("Informe o valor do primeiro produto: ");
		productOneValue = scanner.nextDouble();

		System.out.println("Informe o valor do segundo produto: ");
		productTwoValue = scanner.nextDouble();

		System.out.println("Informe o valor do terceiro produto: ");
		productThirdValue = scanner.nextDouble();

		System.out.println("Informe o valor do quarto produto: ");
		productFourthValue = scanner.nextDouble();

		System.out.println("Informe o valor do quinto produto: ");
		productFifthValue = scanner.nextDouble();

		productsValue = productOneValue + productTwoValue + productThirdValue + productFourthValue + productFifthValue;

		System.out.printf("O valor total dos produtos deu: %f\n", productsValue);

		System.out.println("Informe o valor em dinheiro:");
		payment = scanner.nextDouble();

		result = payment - productsValue;

		System.out.printf("O seu troco deu: %f", result);

		scanner.close();
	}

}
