package For;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String confirmation;
		int value = 1, result, index;
		
		for (index = 1; value < 20; index++) {
			for (index = 1; index < 21; index++) {
				 result = value * index;
				 System.out.printf("\n%d X %d = %d", value, index, result);
				 
				 if (index == 20) {
					 System.out.print("\nDigite 'OK' para continuar: ");
					 confirmation = scanner.next();
					 
					 while (!confirmation.equals("OK")) {
						 System.out.print("Digite 'OK' para continuar: ");
						 confirmation = scanner.next();
					 } 
					 
					 value = value + 1;	 
				 }
			}
		}
		System.out.print("Thank you");
	}

}
