package ddd;

import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value, result;

		System.out.printf("Digite qualquer valor inteiro: ");
		value = scanner.nextInt();

		if (value % 2 == 0) {
			result = value + 5;
			System.out.println(result);
		} else {
			result = value + 8;
			System.out.println(result);
		}

		scanner.close();
	}

}
