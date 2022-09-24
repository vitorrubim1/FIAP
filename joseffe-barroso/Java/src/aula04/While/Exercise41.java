package While;

import java.util.Scanner;
import java.lang.Math;

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
		
		i = 1;
		soma = 0;
		
		while (i <=n) {
			termo = ( (int) Math.pow(i,2) + 1);
			System.out.println(i + ". " + termo);
			i++;
			soma = soma + termo;	
		} System.out.println("A soma é: " + soma);
		
		scanner.close();

	}

}