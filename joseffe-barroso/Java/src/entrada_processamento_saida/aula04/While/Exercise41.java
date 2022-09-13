
import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantity, index;
		double sequence, sumNumbers;
		
		System.out.println("Qual é o valor da sequencia? ");
		quantity = scanner.nextInt();

		while (quantity <= 0) {
			System.out.println("O valor da sequência deve ser positivo e menor que cem. Informe novamente: ");
			quantity = scanner.nextInt();
		}

		index = 2;
		sequence = 2;
		sumNumbers = 0;

		while (index < quantity + 2) {
			System.out.println(sequence);
			sumNumbers = sumNumbers + sequence;
			sequence = Math.pow(sumNumbers, 2)+ 1;
			index = index + 1;
		}
		
		scanner.close();

	}

}
