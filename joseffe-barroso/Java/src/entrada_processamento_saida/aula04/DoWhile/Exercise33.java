package DoWhile;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String gender;

		System.out.print("Informe seu sexo (F) para feminino e (M) para masculino:  ");
		gender = scanner.next();

		do {
			System.out.print("Informe seu sexo (F) para feminino e (M) para masculino:  ");
			gender = scanner.next();
		} while (!gender.equals("M") && !gender.equals("F"));

		System.out.print("Thank you");

		scanner.close();
	}

}
