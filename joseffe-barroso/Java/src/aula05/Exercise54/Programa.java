package Exercise54;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] listaPessoas = new Pessoa[10];
		
		String possuiDependente;
		
		for (int index = 0; index <= 2; index++) {
			Pessoa pessoa = new Pessoa();
			
			System.out.printf("Digite o ID da %dº pessoa: ", index + 1);
			pessoa.id = scanner.nextInt();
			
			System.out.printf("Digite o nome da %dº pessoa: ", index + 1);
			pessoa.nome = scanner.next();
			
			System.out.print("Você possui dependente? (S/N): ");
			possuiDependente = scanner.next();
			
			if (possuiDependente.equals("s")) {
				Dependente dependente = new Dependente();
				
				System.out.print("Digite o nome do dependente: ");
				dependente.nome = scanner.next();
				
				System.out.print("Digite a idade do dependente: ");
				dependente.idade = scanner.nextInt();
				
				// Atribuindo as info do dependente
				pessoa.dependente = dependente;
			} else {
				pessoa.dependente = null;
			}
			
			// Atribuindo as info da pessoa ao array
			listaPessoas[index] = pessoa; 
		}
		
		for (int index = 0; index <= 2; index++) {
			System.out.println(listaPessoas[index].exibirIdNome());
			
			if (listaPessoas[index].dependente != null) {
				System.out.println("  Dependente - " + listaPessoas[index].exibirdDependente());
			}
		}
		
		scanner.close();
	}

}
