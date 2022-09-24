package Exercise52;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produto[] productList = new Produto[10];

		for (int index = 0; index <= 9; index++) {
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
		}

		for (int index = 0; index <= 9; index++) {
			if (productList[index].valor < 100) {
				System.out.printf("Produto cujo id é: " + productList[index].id + " foi cadastrado com sucesso!");
			}
		}

		scanner.close();
	}

}
