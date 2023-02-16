package program;

import java.io.IOException;
import java.util.Scanner;

import model.Coins;
import service.Converter;

public class Programa {
	public static void main(String[] args) {

		int option;
		Double value = 0.0;
		Coins result;

		Scanner scanner = new Scanner(System.in);

		try {

			Converter converter = new Converter();

			System.out.println("Conversor de moeda");
			System.out.println("Deseja converter para:");
			System.out.println("1. Dólar");
			System.out.println("2. Euro");
			System.out.println("3. Bitcoin");

			System.out.println("Infome a opção: ");
			option = scanner.nextInt();

			result = converter.converterCoins(option);

			System.out.println(result.show(value));
			
			scanner.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
