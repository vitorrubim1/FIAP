package ddd;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber, secondNumber, thirdNumber, fourthNumber, media;

		System.out.print("Digite a primeira nota:");
		firstNumber = scanner.nextDouble();

		System.out.print("Digite a segunda nota:");
		secondNumber = scanner.nextDouble();

		System.out.print("Digite a terceira nota:");
		thirdNumber = scanner.nextDouble();

		System.out.print("Digite a quarta nota:");
		fourthNumber = scanner.nextDouble();

		media = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;

		System.out.printf("A média é: %f", media);

		scanner.close();
	}

}
