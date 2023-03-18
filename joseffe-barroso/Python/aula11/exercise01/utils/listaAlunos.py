def handleListaAlunos(alunos=[]):
    if (len(alunos) > 0):
        print("\nListagem de alunos:")
        for aluno in alunos:
          print(f"{aluno.exibeAluno()}")

    else: print("\nNão possui alunos cadastrados")
    