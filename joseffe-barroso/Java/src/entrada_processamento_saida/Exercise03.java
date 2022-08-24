package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double triangleHeight, triangleBase, totalArea;
		
		System.out.print("Digite a altura do triângulo:");
		triangleHeight = scanner.nextDouble();
		
		System.out.print("Digite a base do triângulo: ");
		triangleBase = scanner.nextDouble();
		
		totalArea = (triangleBase * triangleHeight) / 2;
		
		System.out.printf("A área do triângulo é: %f", totalArea);
		
		scanner.close();
	}

}
