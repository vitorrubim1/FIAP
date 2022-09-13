package For;

import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n, i, soma, xneg, xpos, maior, menor, xnul, x, media, porcneg, porcpos, porcnul;

		System.out.println("Digite a quantidade de números a ser comparada (deve ser maior que 0 e menor que 20): ");
		n = scanner.nextDouble();

		while ((n < 1) || (n >= 20)) {
			System.out.println("Número inválido. O número digitado deve estar entre 1 e 19.");
			System.out
					.println("Digite a quantidade de números a ser comparada (deve ser maior que 0 e menor que 20): ");
			n = scanner.nextDouble();
		}
		xpos = 0;
		xneg = 0;
		xnul = 0;
		soma = 0;
		maior = 0;
		menor = 0;

		for (i = 1; (i <= n); i++) {
			System.out.println("Digite o " + (int) i + "º número: ");
			x = scanner.nextDouble();

			if (i == 1) {
				maior = x;
				menor = x;
				if (x > 0) {
					xpos = xpos + 1;
				} else if (x < 0) {
					xneg = xneg + 1;
				} else {
					xnul = xnul + 1;
				}

			} else if (x > maior) {
				maior = x;
				if (x > 0) {
					xpos = xpos + 1;
				} else if (x < 0) {
					xneg = xneg + 1;
				} else {
					xnul = xnul + 1;
				}
			} else if (x < menor) {
				menor = x;
				if (x > 0) {
					xpos = xpos + 1;
				} else if (x < 0) {
					xneg = xneg + 1;
				} else {
					xnul = xnul + 1;
				}
			} else {
				if (x > 0) {
					xpos = xpos + 1;
				} else if (x < 0) {
					xneg = xneg + 1;
				} else {
					xnul = xnul + 1;
				}
			}
			soma = soma + x;
			scanner.close();
		}
		media = soma / n;
		porcneg = 100 * xneg / n;
		porcpos = 100 * xpos / n;
		porcnul = 100 * xnul / n;

		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores positivos é: " + media);
		System.out.println("A porcentagem dos valores positivos é: " + porcpos);
		System.out.println("A porcentagem dos valores negativos é: " + porcneg);
		System.out.println("A porcentagem dos valores nulos (0) é: " + porcnul);
	}

}
