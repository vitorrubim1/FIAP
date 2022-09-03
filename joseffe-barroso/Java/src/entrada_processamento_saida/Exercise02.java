package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double squareSide, totalArea;

		System.out.print("Digite o lado do quadrado:");
		squareSide = scanner.nextDouble();

		totalArea = squareSide * squareSide;

		System.out.printf("A área do quadrado é: %f", totalArea);

		scanner.close();
	}

}
