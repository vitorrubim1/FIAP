package While;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String confirmation;
		int value, index, result;
		
		value = 1;
		
		while (value < 20) {
			for (index = 1; index < 21; index++) {
			    result = value * index;
			    System.out.printf("\n%d X %d = %d", value, index, result);
			    
			    if (index == 20) {
			    	System.out.print("\nDigite 'OK' para continuar: ");
					confirmation = scanner.next();
					
					while (!confirmation.equals("OK")) {
						System.out.print("\nDigite 'OK' para continuar: ");
						confirmation = scanner.next();
					}
					
					value = value + 1;
			    }
			}
		}
		
		System.out.print("Thank you");
	}

}
