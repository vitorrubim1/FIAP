package entrada_processamento_saida;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNote, minimumNote;

		System.out.printf("Informe o valor da primeira nota (P1): ");
		firstNote = scanner.nextDouble();

		minimumNote = (15 - firstNote) / 2;

		System.out.printf("O aluno precisa tirar no minímo %f pontos para ser aprovado", minimumNote);

		scanner.close();
	}

}
