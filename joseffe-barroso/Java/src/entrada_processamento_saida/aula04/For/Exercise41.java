package For;

import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, i, soma, termo;

		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 100): ");
		n = scanner.nextInt();

		while ((n <= 0) || (n > 100)) {
			System.out.println("O valor de N deve ser positivo e menor que 100.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 100): ");
			n = scanner.nextInt();
		}

		soma = 0;

		for (i = 1; i <= n; i++) {
			termo = ((int) Math.pow(i, 2) + 1);
			System.out.println(i + ". " + termo);
			soma = soma + termo;
			scanner.close();
		}

		System.out.println("A soma é: " + soma);

	}

}
