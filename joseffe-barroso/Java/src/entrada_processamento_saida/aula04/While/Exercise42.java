import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index, quantity;
		double sumNumbers, sequence;

		System.out.println("Qual é o valor da sequencia?");
		quantity = scanner.nextInt();

		while (quantity <= 0 || quantity > 100) {
			System.out.println(
					"O valor da sequência deve ser positivo e menor que cem. Informe novamente:  ");
			quantity = scanner.nextInt();
		}

		index = 2;
		sequence = 2;
		sumNumbers = 0;

		while (index < quantity + 2) {
			System.out.printf("%f", sequence);
			sumNumbers = sumNumbers + sequence;
			sequence = Math.pow(2, index) + 1;
			index = index + 1;
			scanner.close();
		}
		System.out.printf("\nsoma deu: %f", sumNumbers);
	}

}
