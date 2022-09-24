package Exercise51;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cliente[] clientList = new Cliente[5];

		int index = 0;

		while (index <= 4) {
			Cliente cliente = new Cliente();

			System.out.printf("Digite o id do %dº cliente: ", index + 1);
			cliente.id = scanner.nextInt();

			System.out.printf("Digite o nome do %dº cliente: ", index + 1);
			cliente.nome = scanner.next();

			System.out.printf("Digite a idade do %dº cliente: ", index + 1);
			cliente.idade = scanner.nextInt();

			System.out.printf("Digite o e-mail do %dº cliente: ", index + 1);
			cliente.email = scanner.next();

			clientList[index] = cliente;
			index = index + 1;
		}

		if (index >= 4)
			index = 0;

		while (index <= 4) {
			if (clientList[index].idade >= 18) {
				System.out.println("Cliente " + clientList[index].nome + " cadastrado com sucesso! WHILE");
			}

			index = index + 1;
		}

		scanner.close();
	}

}
