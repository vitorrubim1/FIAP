package While;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int valueOne, valueTwo;

		System.out.print("Informe o primeiro valor: ");
		valueOne = scanner.nextInt();

		System.out.print("Informe o segundo valor: ");
		valueTwo = scanner.nextInt();

		while (valueTwo <= valueOne) {
			System.out.print("O segundo valor precisar ser maior que o primeiro. Informe novamente: ");
			valueTwo = scanner.nextInt();
		}

		System.out.print("Thank you");

		scanner.close();
	}

}
