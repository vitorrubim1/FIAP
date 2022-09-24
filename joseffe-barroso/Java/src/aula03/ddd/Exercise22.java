package ddd;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double triangleHeight, triangleBase, squareSide, rectangleHeight, rectangleBase, circleRadius, totalArea;
		int choice;

		System.out.println("Cálculo de área, digite o número da opção correspondente");
		System.out.println("1 - Triângulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Retângulo");
		System.out.println("4 - Circulo");
		System.out.println("5 - FIM DE PROCESSO (sair do programa)");

		System.out.printf("Digite o número da operação:");
		choice = scanner.nextInt();

		if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
			if (choice == 5) {
				System.out.println("Até mais");
				scanner.close();
				return;
			} else if (choice == 1) {
				// Triângulo
				System.out.printf("Digite a altura do triângulo: ");
				triangleHeight = scanner.nextDouble();

				System.out.printf("Digite a base do triângulo: ");
				triangleBase = scanner.nextDouble();

				totalArea = (triangleBase * triangleHeight) / 2;

				System.out.printf("A área do triângulo é: %f", totalArea);

			} else if (choice == 2) {
				// Quadrado
				System.out.printf("Digite o lado do quadrado: ");
				squareSide = scanner.nextDouble();

				totalArea = squareSide * squareSide;

				System.out.printf("A área do quadrado é: %f", totalArea);

			} else if (choice == 3) {
				// Retângulo
				System.out.printf("Digite a altura do retângulo: ");
				rectangleHeight = scanner.nextDouble();

				System.out.printf("Digite a base do retângulo: ");
				rectangleBase = scanner.nextDouble();

				totalArea = rectangleBase * rectangleHeight;

				System.out.printf("A área do retângulo é: %f", totalArea);

			} else if (choice == 4) {
				// Circulo
				System.out.printf("Digite o raio do círculo: ");
				circleRadius = scanner.nextDouble();

				double pi;
				pi = 3.14;

				totalArea = pi * Math.pow(circleRadius, 2);

				System.out.printf("A área do círculo é: %f", totalArea);

			}
		}

		scanner.close();
	}

}
