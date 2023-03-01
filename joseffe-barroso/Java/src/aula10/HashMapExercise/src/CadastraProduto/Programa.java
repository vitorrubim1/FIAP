package CadastraProduto;

import java.util.HashMap;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HashMap<Integer, Produto> map = new HashMap<Integer, Produto>();
		
		String possuiCategoria;
		
		for (int index = 0; index <= 1; index++) {
			Produto produto = new Produto();
			
			System.out.printf("Digite o ID do %dº produto: ", index + 1);
			produto.setId(scanner.nextInt());
			
			System.out.printf("Digite o nome do %dº produto: ", index + 1);
			produto.setNome(scanner.next());
			
			System.out.printf("Digite o preço do %dº produto: ", index + 1);
			produto.setPreco(scanner.nextDouble());
			
			System.out.printf("Digite a quantidade do %dº produto: ", index + 1);
			produto.setQuantidade(scanner.nextInt());
			
			System.out.printf("O %dº produto possui categoria? (S/N): ", index + 1);
			possuiCategoria = scanner.next().toLowerCase();
			
			if (possuiCategoria.equals("s")) { 
				Categoria categoria = new Categoria();
				
				System.out.printf("Informe o ID da categoria: ");
				categoria.setId(scanner.nextInt());
				
				System.out.printf("Informe o nome da categoria: ");
				categoria.setNome(scanner.next());
				
				produto.setCategoria(categoria);
			} else {
				produto.setCategoria(null);
			}
			
			map.put(index, produto);
		}
		
		 map.forEach((key, value) -> {
			 System.out.print(key + "=" + value.exibirNomePreco() + " ");
		 });
		
		scanner.close();
		
	}

}