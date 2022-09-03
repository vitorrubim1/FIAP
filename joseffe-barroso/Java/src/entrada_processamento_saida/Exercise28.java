package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double productValue, cashPayment, creditCardPayment, interestFreePaymentInTwoInstallments,
				paymentInTwoInstallmentsWithInterest;

		System.out.printf("Informe o valor do produto: ");
		productValue = scanner.nextDouble();

		cashPayment = productValue - (10 / 100) * productValue;
		creditCardPayment = productValue - (15 / 100) * productValue;
		interestFreePaymentInTwoInstallments = productValue;
		paymentInTwoInstallmentsWithInterest = productValue + (10 / 100) * productValue;

		System.out.printf("Valor à vista em dinheiro ou cheque R$ %.2f", cashPayment);
		System.out.printf("\nValor à vista no cartão de crédito R$ %.2f", creditCardPayment);
		System.out.printf("\nEm duas vezes, preço normal de etiqueta sem juros R$ %.2f",
				interestFreePaymentInTwoInstallments);
		System.out.printf("\nEm duas vezes, preço normal de etiqueta mais juros de 10% R$ %.2f",
				paymentInTwoInstallmentsWithInterest);

		scanner.close();
	}

}
