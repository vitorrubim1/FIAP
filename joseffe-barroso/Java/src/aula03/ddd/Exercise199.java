package ddd;

import java.util.Scanner;

public class Exercise199 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNote, secondNote, average;

		System.out.printf("Informe o valor da primeira nota (P1): ");
		firstNote = scanner.nextDouble();

		System.out.printf("Informe o valor da segunda nota (P2): ");
		secondNote = scanner.nextDouble();

		average = (firstNote + (2 * secondNote)) / 3;

		System.out.println(average);

		if (average >= 5)
			System.out.printf("Aprovado");
		else
			System.out.printf("Reprovado");

		scanner.close();
	}

}
