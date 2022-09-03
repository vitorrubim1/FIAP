package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value, result;

		System.out.printf("Digite qualquer valor inteiro: ");
		value = scanner.nextInt();

		if (value > 0) {
			result = value * 2;
			System.out.printf("O dobro do valor é: %d", result);
		} else {
			result = value * 3;
			System.out.printf("O dobro do valor é: %d", result);
		}

		scanner.close();
	}

}
