import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double productOneValue, productTwoValue, productThirdValue, productFourthValue, productFifthValue, productsValue, payment, result;
		
		System.out.println("Informe o valor do primeiro produto?");
		productOneValue = ler.nextDouble();
		
		System.out.println("Informe o valor do segundo produto?");
		productTwoValue = ler.nextDouble();
		
		System.out.println("Informe o valor do terceiro produto?");
		productThirdValue = ler.nextDouble();
		
		System.out.println("Informe o valor do quarto produto?");
		productFourthValue = ler.nextDouble();
		
		System.out.println("Informe o valor do quinto produto?");
		productFifthValue = ler.nextDouble();
		
		productsValue = productOneValue + productTwoValue + productThirdValue + productFourthValue + productFifthValue;
		
		System.out.printf("O valor total dos produtos deu: %f\n", productsValue);
		
		System.out.println("Informe o valor em dinheiro:");
		payment =  ler.nextDouble();
		
		
		result = payment - productsValue;
		
		System.out.printf("O seu troco deu: %f", result);
		
		ler.close();
	}

}
