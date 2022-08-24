
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double graus, fahrenheit;
		
		System.out.print("Qual a temperatura em celsius?");
		graus = ler.nextDouble();
		
		fahrenheit = (graus * 1.2) + 32;
		
		System.out.printf("O resultado em fahrenheit é: %f", fahrenheit);
		
		ler.close();
	}

}
