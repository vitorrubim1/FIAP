package ddd;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name, genre;
		int maritalStatus, yearsMarried;

		System.out.print("Informe seu nome: ");
		name = scanner.next();

		System.out.print("Informe seu sexo (M para masculino) e (F para feminino): ");
		genre = scanner.next();

		if (genre.equals("M") || genre.equals("F")) {
			System.out.println("1 - Solteiro(a)");
			System.out.println("2 - Casado(a)");
			System.out.println("3 - Separado(a)");
			System.out.println("4 - Divorciado(a)");
			System.out.println("5 - Viúvo(a)");

			System.out.println("Informe seu estado civil");
			maritalStatus = scanner.nextInt();

			if (maritalStatus == 1 || maritalStatus == 2 || maritalStatus == 3 || maritalStatus == 4
					|| maritalStatus == 5) {
				if (maritalStatus == 2) {
					System.out.printf("Quantos anos de casado?");
					yearsMarried = scanner.nextInt();

					System.out.printf("Olá %s, que legal que você está há %d casado(a)", name, yearsMarried);
				}
			} else {
				System.out.printf("Informe um estado civil que corresponde na lista");
			}

		} else {
			System.out.println("Informe um genêro válido.");
		}

		scanner.close();
	}

}
