package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber, secondNumber, thirdNumber;

		System.out.printf("Digite o primeiro número: ");
		firstNumber = scanner.nextDouble();

		System.out.printf("Digite o segundo número: ");
		secondNumber = scanner.nextDouble();

		System.out.printf("Digite o terceiro número: ");
		thirdNumber = scanner.nextDouble();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.printf("O primeiro valor informado é o maior");
		}

		if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.printf("O segundo valor informado é o maior");
		}

		if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.printf("O terceiro valor informado é o maior");
		}

		if (firstNumber == secondNumber & firstNumber == thirdNumber) {
			System.out.printf("Os valores são iguais");
		}

		scanner.close();
	}

}
