package Exercise52;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produto[] productList = new Produto[10];

		int index = 0;

		do {
			Produto produto = new Produto();

			System.out.printf("Digite o id do %dº produto: ", index + 1);
			produto.id = scanner.nextInt();

			System.out.printf("Digite a descrição do %dº produto: ", index + 1);
			produto.descricao = scanner.next();

			System.out.printf("Digite o valor do %dº produto: ", index + 1);
			produto.valor = scanner.nextDouble();

			System.out.printf("Digite a quantidade do %dº produto: ", index + 1);
			produto.quantidade = scanner.nextDouble();

			productList[index] = produto;
			index = index + 1;
		} while (index <= 2);

		if (index >= 2)
			index = 0;

		do {
			if (productList[index].valor < 100) {
				System.out.printf("Produto cujo id é: " + productList[index].id + " foi cadastrado com sucesso!");
			}
			index = index + 1;
		} while (index <= 2);

		scanner.close();
	}

}
