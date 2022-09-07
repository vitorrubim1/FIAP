package For;

import java.util.Scanner;

public class Exercise35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value, result, index;

		System.out.print("Informe um valor qualquer: ");
		value = scanner.nextInt();

		while (value <= 0) {
			System.out.print("Informe um valor positivo: ");
			value = scanner.nextInt();
		}

		for (index = 1; index < 11; index++) {
			result = value * index;
			System.out.printf("\n%d X %d = %d", value, index, result);
			scanner.close();
		}
	}

}
