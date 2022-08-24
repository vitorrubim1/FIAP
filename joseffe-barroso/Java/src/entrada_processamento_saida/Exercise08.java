package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double valueOne, valueTwo, media;
		
		System.out.println("Informe a primeira nota: ");
		valueOne = scanner.nextDouble();
		
		System.out.println("Informe a primeira nota: ");
		valueTwo = scanner.nextDouble();
		
		media = (valueOne + valueTwo) / 2;
		
		if (media >= 5) {
			System.out.printf("Sua média foi %f e você está aprovado", media);
		} else {
			System.out.println("Reprovado!");
		}
		
		
		scanner.close();
	}

}
