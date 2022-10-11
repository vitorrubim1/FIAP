package checkpoint;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Aluno[] listaAluno = new Aluno[5];
		
		String estaMatriculado;
		
		for (int index = 0; index <= 2; index++) {
			Aluno aluno = new Aluno();
			
			System.out.printf("Digite o ID do %dº aluno: ", index + 1);
			aluno.setId(scanner.nextInt());
			
			System.out.printf("Digite o nome do %dº aluno: ", index + 1);
			aluno.setNome(scanner.next());
			
			System.out.printf("Digite o RM do %dº aluno: ", index + 1);
			aluno.setRm(scanner.next());
			
			System.out.printf("O %dº aluno está matriculado em algum curso? S/N: ", index + 1);
			estaMatriculado = scanner.next().toLowerCase();
			
			while (!estaMatriculado.equals("s") && !estaMatriculado.equals("n")) {
				System.out.printf("RESPOSTA INCORRETA. \"S\" para SIM e \"N\" para NÃO");
				System.out.printf("\nO %dº aluno está matriculado em algum curso? ", index + 1);
				estaMatriculado = scanner.next().toLowerCase();
			}
			
			if (estaMatriculado.equals("s")) {
				Curso curso = new Curso();
				
				System.out.printf("Digite o ID do curso: ");
				curso.setId(scanner.nextInt());
				
				System.out.printf("Digite o nome do curso: ");
				curso.setNome(scanner.next());
				
				aluno.setCurso(curso);
			} else {
				aluno.setCurso(null);
			}
			
			listaAluno[index] = aluno;
		}
		
		for (int index = 0; index <= 2; index++) {
			System.out.println("\n Nome: " + listaAluno[index].getNome() + " - RM: " + listaAluno[index].getRm() + " - ID: " + listaAluno[index].getId());
			
			if (listaAluno[index].getCurso() != null) {
				System.out.println("   Dados do curso ID: " + listaAluno[index].getCurso().getId() + " - Nome: " + listaAluno[index].getCurso().getNome());
			}
		}
		
		scanner.close();
	}

}
