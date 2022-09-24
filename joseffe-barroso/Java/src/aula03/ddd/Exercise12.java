package ddd;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double rectangleHeight, rectangleBase, totalArea;

		System.out.printf("Digite a altura do retângulo: ");
		rectangleHeight = scanner.nextDouble();

		System.out.printf("Digite a base do retângulo: ");
		rectangleBase = scanner.nextDouble();

		totalArea = rectangleBase * rectangleHeight;

		if (totalArea > 100) {
			System.out.printf("O Terreno é grande, e possui: %f m²", totalArea);
		} else {
			System.out.printf("O Terreno é pequeno, e possui: %f m²", totalArea);
		}

		scanner.close();
	}

}
