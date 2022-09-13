package For;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n, i, soma, dividendo, divisor, divisao;

		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
		n = scanner.nextInt();

		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor de N deve ser positivo e menor que 50.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
			n = scanner.nextInt();
		}

		soma = 0;

		for (i = 1; i <= n; i++) {
			dividendo = (Math.pow(i, 2)) + 1;
			divisor = (Math.pow(i, 3));
			divisao = dividendo / divisor;
			System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
			soma = soma + divisao;
			scanner.close();
		}

		System.out.printf("A soma é: %.2f", soma);

	}

}
