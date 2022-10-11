rm = []
nome = []
curso = []

quantidadePessoa = 5

for index in range (0, quantidadePessoa, 1):
    rmAluno = input(f"\nInforme o RM da {index + 1}º pessoa: ")
    while(rmAluno == ""):
        rmAluno = input(f"\nInforme o RM da {index + 1}º pessoa: ")

    nomeAluno = input(f"Informe o nome da {index + 1}º pessoa: ")
    while(nomeAluno == ""):
        nomeAluno = input(f"Informe o nome da {index + 1}º pessoa: ")
    
    estaMatriculado = input("Este aluno está matriculado em algum curso? S/N: ").lower()
    
    while(estaMatriculado != "n" and estaMatriculado != "s"):
        print("\nRESPOSTA INCORRETA. \"S\" para SIM e \"N\" para NÃO")
        estaMatriculado = input("Este aluno está matriculado em algum curso? S/N: ").lower()

    if (estaMatriculado == "s"):
        curso.append(input(f"Informe o nome do curso: "))
    else: 
        curso.append('NÃO ESTÁ MATRICULADO')

    rm.append(rmAluno)
    nome.append(nomeAluno)


for index in range (0, quantidadePessoa, 1):
    print(f"{index + 1}º  - Nome: {nome[index]} - RM: {rm[index]} - Curso: {curso[index]}")
   