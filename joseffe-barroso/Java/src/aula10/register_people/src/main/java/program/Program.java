package program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import org.apache.http.client.ClientProtocolException;

import model.Address;
import model.People;
import service.ViaCepService;

public class Program {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<People> listPeople = new ArrayList<People>();
		ViaCepService viaCepService = new ViaCepService();

		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		int option;
		int index = 0;
		String idTyped;
		String cep;

		do {
			System.out.println("\n=== Cadastro de pessoas ===");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Editar");
			System.out.println("3 - Consultar");
			System.out.println("4 - Apagar");
			System.out.println("5 - Sair do programa");
			System.out.print("Qual opção deseja realizar: ");
			option = scanner.nextInt();

			People people = new People();
			Address endereco = new Address();

			if (option == 1) {
				people.setId(id);

				System.out.printf("\nDigite o nome da %dº pessoa: ", index + 1);
				people.setNome(scanner.next());

				System.out.printf("Digite o email da %dº pessoa: ", index + 1);
				people.setEmail(scanner.next());

				System.out.printf("Digite o cep da %dº pessoa: ", index + 1);
				cep = scanner.next();

				Address responseEndereco = viaCepService.getEndereco(cep);
				System.out.println(responseEndereco.showAddress());

				System.out.printf("Digite o complemento: ");
				endereco.setComplemento(scanner.next());

				System.out.printf("Digite o número: ");
				endereco.setNumero(scanner.nextInt());

				people.setEndereco(responseEndereco);

				index = index + 1;
				listPeople.add(people);
			}
			
			if (option == 2) {
				if (listPeople.size() == 0) {
					System.out.println("\nNinguem cadastrado!\n");
					System.in.read();
					break;
				}

				for (People peopleFor : listPeople) {
					System.out.println("\nListagem de pessoas:");
					System.out.println(peopleFor.show());
				}

				System.out.println("Digite o ID da pessoa que deseja editar: ");
				idTyped = scanner.next();

				for (People peopleFor : listPeople) {

					People peopleExists = null;

					if (peopleFor.getId().equals(idTyped)) peopleExists = peopleFor;

					if (peopleExists != null) {
						
						System.out.printf("\nDigite o nome pessoa: ");
						peopleFor.setNome(scanner.next());

						System.out.printf("Digite o email da pessoa: ");
						peopleFor.setEmail(scanner.next());

						System.out.printf("Digite o cep da pessoa: ");
						cep = scanner.next();

						Address responseEndereco = viaCepService.getEndereco(cep);
						System.out.println(responseEndereco.showAddress());

						System.out.printf("Digite o complemento: ");
						endereco.setComplemento(scanner.next());

						System.out.printf("Digite o número: ");
						endereco.setNumero(scanner.nextInt());

						peopleFor.setEndereco(responseEndereco);
						

						System.out.println("Pessoa editada com sucesso!");

						break;
					} else
						System.out.println("ID informado é inexistente");
					
					System.out.println("\nTecle ENTER para retornar ao Menu.\n");
					System.in.read();
				}
			}

			if (option == 4) {
				if (listPeople.size() == 0) {
					System.out.println("\nNinguem cadastrado!\n");
					System.in.read();
					break;
				}

				for (People peopleFor : listPeople) {
					System.out.println("\nListagem de pessoas:");
					System.out.println(peopleFor.show());
				}

				System.out.println("Digite o ID da pessoa que deseja excluir: ");
				idTyped = scanner.next();

				for (People peopleFor : listPeople) {

					People peopleDelete = null;

					if (peopleFor.getId().equals(idTyped))
						peopleDelete = peopleFor;

					if (peopleDelete != null) {
						listPeople.remove(peopleDelete);

						System.out.println("Pessoa excluída com sucesso!");

						break;
					} else
						System.out.println("ID informado é inexistente");
					
					System.out.println("\nTecle ENTER para retornar ao Menu.\n");
					System.in.read();
				}
			}

			if (option == 3) {
				if (listPeople.size() == 0) {
					System.out.println("\nNinguem cadastrado!\n");
					System.in.read();
					break;
				}

				for (People peopleFor : listPeople) {
					System.out.println("\nListagem de pessoas:");
					System.out.println(peopleFor.show());
				}
			}
			
		} while (option != 5);
		
		scanner.close();
	}

}
