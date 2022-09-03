package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber, secondNumber, thirdNumber;

		System.out.print("Digite o primeiro número:");
		firstNumber = scanner.nextDouble();

		System.out.print("Digite o segundo número:");
		secondNumber = scanner.nextDouble();

		System.out.print("Digite o terceiro número:");
		thirdNumber = scanner.nextDouble();

		if ((firstNumber + secondNumber) < thirdNumber)
			System.out.println("A adição do primeiro e segundo número é menor que o terceiro número");
		else
			System.out.println("A adição do primeiro e segundo número é maior que o terceiro número");

		scanner.close();
	}

}
