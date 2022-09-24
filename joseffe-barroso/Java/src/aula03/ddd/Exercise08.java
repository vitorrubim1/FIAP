package ddd;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber, secondNumber;

		System.out.print("Digite o primeiro número: ");
		firstNumber = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		secondNumber = scanner.nextDouble();


		if (firstNumber > secondNumber) {
			System.out.printf("O primeiro valor informado é o maior");
		} else {
			System.out.println("O segundo valor informado é o maior");
		}

		scanner.close();
	}

}
