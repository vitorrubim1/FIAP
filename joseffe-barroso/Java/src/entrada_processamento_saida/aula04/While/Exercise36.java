package While;

import java.util.Scanner;

public class Exercise36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value, interval, index, result;

		System.out.print("Informe um valor qualquer: ");
		value = scanner.nextInt();

		while (value <= 0) {
			System.out.print("Informe um valor positivo: ");
			value = scanner.nextInt();
		}

		System.out.print("Informe o intervalo: ");
		interval = scanner.nextInt();

		while (value > interval) {
			System.out.print("O intervalo dever ser maior que o valor informado: ");
			interval = scanner.nextInt();
		}

		index = interval;

		while (index > 0) {
			result = value * index;
			System.out.printf("\n%d X %d = %d", value, index, result);
			index = index - 1;
		}
		
		scanner.close();

	}

}
