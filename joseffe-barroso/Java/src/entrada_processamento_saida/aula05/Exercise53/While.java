package Exercise53;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno[] alunoList = new Aluno[5];

		int index = 0;

		while (index <= 4) {
			Aluno aluno = new Aluno();
			String[] materiaList = new String[6];

			System.out.printf("Digite o RA do %dº aluno: ", index + 1);
			aluno.ra = scanner.next();

			System.out.printf("Digite o nome: ");
			aluno.nome = scanner.next();

			System.out.printf("Digite o perído (Manhã ou Noite): ");
			aluno.periodo = scanner.next();

			for (int materiaIndex = 0; materiaIndex <= 5; materiaIndex++) {
				System.out.printf("Digite a inicial da sua %dº materia: ", materiaIndex + 1);
				materiaList[materiaIndex] = scanner.next();
			}

			aluno.materias = materiaList;
			alunoList[index] = aluno;
			index = index + 1;
		}

		if (index >= 4) {
			index = 0;
		}

		while (index <= 4) {
			if (alunoList[index].periodo.equals("Noite")) {
				System.out.println("Aluno " + alunoList[index].nome + " estuda a noite!");
			}
			index = index + 1;
		}

		scanner.close();
	}
}
