package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.printf("Digite um valor inteiro: ");
		number = scanner.nextInt();

		if (number % 2 == 0)
			System.out.printf("O valor informado é PAR");
		else
			System.out.printf("O valor informado é IMPAR");

		scanner.close();
	}

}
