import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacao, dolar, quantidadeReal;
		
		System.out.println("Qual a cotação atual?");
		cotacao = ler.nextDouble();
		
		System.out.println("Qual a quantidade em Real (R$)?");
		dolar = ler.nextDouble();
		
		quantidadeReal = cotacao * dolar;
		
		System.out.printf("A quantidade final é: %f", quantidadeReal);
		
		ler.close();
	}

}
