package DoWhile;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double i, soma, n, maior, media;

		i = 1;
		soma = 0;
		maior = 0;

		do {
			System.out.println("Digite o " + (int) i + "º número positivo: ");
			n = scanner.nextDouble();

			while (n < 0) {
				System.out.println("O número deve ser positivo!");
				System.out.println("Digite o " + (int) i + " número positivo: ");
				n = scanner.nextDouble();
			}
			if (i == 1) {
				maior = n;
			} else if (n > maior) {
				maior = n;
			}

			soma = soma + n;
			i++;
		} while (i <= 10);
		
		media = soma / (i - 1);

		System.out.println("O maior número é: " + maior);
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores é: " + media);

		scanner.close();
	}

}
