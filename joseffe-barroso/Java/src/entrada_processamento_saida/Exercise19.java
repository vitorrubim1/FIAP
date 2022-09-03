package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstValue, secondValue, result;
		int choice;

		System.out.println("Qual operação você deseja realizar? \n");
		System.out.println("1 - MULTIPLICAÇÃO");
		System.out.println("2 - ADIÇÃO");
		System.out.println("3 - DIVISÃO");
		System.out.println("4 - SUBTRAÇÃO");
		System.out.println("5 - FIM DE PROCESSO (sair do programa)");

		System.out.printf("Digite o número da operação:");
		choice = scanner.nextInt();

		if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {

			if (choice == 5) {
				System.out.println("Até mais");
				scanner.close();
				return;
			}

			System.out.printf("\nInforme o primeiro valor: ");
			firstValue = scanner.nextDouble();

			System.out.printf("Informe o segundo valor: ");
			secondValue = scanner.nextDouble();

			// Multiplicação
			if (choice == 1) {
				result = firstValue * secondValue;
				System.out.printf("A multiplicação deu: %f", result);
			}

			// Adição
			else if (choice == 2) {
				result = firstValue + secondValue;
				System.out.printf("A adição deu: %f", result);
			}

			// Divisão
			else if (choice == 3) {
				result = firstValue / secondValue;
				System.out.printf("A divisão deu: %f", result);
			}

			// Subtração
			else if (choice == 4) {
				result = firstValue - secondValue;
				System.out.printf("A subtração deu: %f", result);
			}
		} else {
			System.out.println("Informe um valor que que coincida na lista");
		}

		scanner.close();
	}

}
