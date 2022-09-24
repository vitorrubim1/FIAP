package ddd;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double rectangleHeight, rectangleBase, totalArea;

		System.out.print("Digite a altura do retângulo:");
		rectangleHeight = scanner.nextDouble();

		System.out.print("Digite a base do retângulo:");
		rectangleBase = scanner.nextDouble();

		totalArea = rectangleBase * rectangleHeight;

		System.out.printf("A área do retângulo é: %f", totalArea);

		scanner.close();
	}

}
