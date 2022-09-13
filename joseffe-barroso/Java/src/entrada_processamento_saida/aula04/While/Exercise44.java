import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantity = 0, sumNumbers = 0, higherNumber = 0, index, number, avarage;

		index = 0;
		while (index < quantity) {
			System.out.println("Qual é o valor da sequencia?");
			number = scanner.nextInt();

			if (index == 0) {
				higherNumber = number;
			} else if (number > higherNumber) {
				higherNumber = number;
			}

			sumNumbers = sumNumbers + number;
			index = index + 1;
			
			avarage = sumNumbers / quantity;
			
			System.out.printf("\nMédia %d", avarage);
			System.out.printf("\nSoma %d", sumNumbers);
			System.out.printf("\nMaior %d", higherNumber);
			
			scanner.close();
		}
	}

}
