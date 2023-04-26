package javabd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int opcao = 0;
        UsuarioDBOracle db = new UsuarioDBOracle();
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Incluir aluno");
            System.out.println("2 - Atualizar aluno");
            System.out.println("3 - Excluir aluno");
            System.out.println("4 - Listar todos os alunos");
            System.out.println("5 - Listar um aluno");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o ID do aluno: ");
                    aluno.setId(scanner.nextInt());
                    
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setNome(scanner.next());
                    
                    System.out.println("Digite o RA do aluno: ");
                    aluno.setRa(scanner.next());
                    
                    System.out.println("Digite o curso do aluno: ");
                    aluno.setCurso(scanner.next());
                    
                    db.incluirAluno(aluno);
                    System.out.println("Aluno incluído com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o ID do aluno que deseja atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.println("Digite o novo nome do aluno: ");
                    String novoNome = scanner.next();
                    aluno.setId(idAtualizar);
                    aluno.setNome(novoNome);
                    db.atualizarAluno(aluno);
                    System.out.println("Aluno atualizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o ID do aluno que deseja excluir: ");
                    int idExcluir = scanner.nextInt();
                    db.excluirAluno(idExcluir);
                    System.out.println("Aluno excluído com sucesso!");
                    break;
                case 4:
                    db.listarAlunos();
                    break;
                case 5:
                    System.out.println("Digite o ID do aluno que deseja listar: ");
                    int idListar = scanner.nextInt();
                    db.listarAluno(idListar);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

    }
}
