import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sequence, index;
		double numerator, denominator, divisao, sumNumbers;
		
		System.out.println("Qual é o valor da sequencia?");
		sequence = scanner.nextInt();

		while (sequence <= 0 || sequence > 100) {
			System.out.println("O valor da sequência deve ser positivo e menor que cem. Informe novamente:  ");
			sequence = scanner.nextInt();
		}

		numerator = 1;
		denominator = 2;
		index = 1;
		sumNumbers = 0;

		while (index < sequence){
		    numerator = Math.pow(index, 2) + 1;
		    denominator = Math.pow(index, 3);
		    divisao = numerator / denominator;
		    if (index == 1) System.out.printf("%f", numerator);
		    else System.out.printf("%f/%f", numerator, denominator);
		    index = index + 1;
		    sumNumbers = sumNumbers + divisao;
		}
			
		scanner.close();
	}

}
