package For;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, i;
		double dividendo, divisor, divisao, soma;

		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
		n = scanner.nextInt();

		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor de N deve ser positivo e menor que 50.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
			n = scanner.nextInt();
		}

		dividendo = 1;
		divisor = 2;
		soma = 0;

		for (i = 1; i <= n; i++) {
			divisao = dividendo / divisor;
			soma = soma + divisao;
			System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
			dividendo++;
			divisor++;
			scanner.close();
		}
		System.out.printf("A soma é: %.2f", soma);

	}

}
