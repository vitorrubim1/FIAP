package ddd;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double triangleFirstValue, triangleSecondValue, triangleThirdValue;

		System.out.printf("Digite o primeiro lado do triângulo: ");
		triangleFirstValue = scanner.nextDouble();

		System.out.printf("Digite o segundo lado do triângulo: ");
		triangleSecondValue = scanner.nextDouble();

		System.out.printf("Digite o terceiro lado do triângulo: ");
		triangleThirdValue = scanner.nextDouble();

		if ((triangleFirstValue + triangleSecondValue < triangleThirdValue)
				|| (triangleFirstValue + triangleThirdValue < triangleSecondValue)
				|| (triangleSecondValue + triangleThirdValue < triangleFirstValue)) {
			System.out.println("Não é um triangulo");
		} else if ((triangleFirstValue == triangleSecondValue) && (triangleFirstValue == triangleThirdValue)) {
			System.out.println("Equilatero");
		} else if ((triangleFirstValue == triangleSecondValue) || (triangleFirstValue == triangleThirdValue)
				|| (triangleSecondValue == triangleThirdValue)) {
			System.out.println("Isósceles");
		} else {
			System.out.println("Escaleno");
		}

		scanner.close();
	}

}
