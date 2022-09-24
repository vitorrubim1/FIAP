package ddd;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double heigth, weight, imc;

		System.out.println("Digite a sua altura em (m): ");
		heigth = scanner.nextDouble();

		System.out.println("Digite o seu peso (em Kg): ");
		weight = scanner.nextDouble();

		imc = weight / (heigth * heigth);

		if (imc < 20) {
			System.out.printf("Abaixo do peso!");
		} else if (imc < 25) {
			System.out.println("Peso ideal!");
		} else {
			System.out.println("Acima do peso!");
		}

		scanner.close();
	}

}
