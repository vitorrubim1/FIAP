package ddd;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber, secondNumber, thirdNumber;

		System.out.print("Digite o primeiro número: ");
		firstNumber = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		secondNumber = scanner.nextInt();

		System.out.print("Digite o terceiro número: ");
		thirdNumber = scanner.nextInt();

		int[] listNumbers = { firstNumber, secondNumber, thirdNumber };

		Arrays.sort(listNumbers);
		System.out.println("\nOrdem crescente dos valores: " + Arrays.toString(listNumbers));

		scanner.close();
	}

}
