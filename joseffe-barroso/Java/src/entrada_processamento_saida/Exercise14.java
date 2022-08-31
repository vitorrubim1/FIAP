package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double heigth, catetoOne, catetoTwo, catetoSum;
		
		System.out.print("Digite a altura: ");
		heigth = scanner.nextDouble();
		
		System.out.print("Digite o primeiro cateto: ");
		catetoOne = scanner.nextDouble();
		
		System.out.print("Digite o primeiro cateto: ");
		catetoTwo = scanner.nextDouble();
		
		catetoSum = (catetoOne * catetoOne) + (catetoTwo * catetoTwo);
		
		if ((heigth * heigth) == catetoSum) {
			System.out.println("É um triângulo retângulo");
		} else {
			System.out.println("Não é um triângulo retângulo");
		}

		scanner.close();
	}
}
