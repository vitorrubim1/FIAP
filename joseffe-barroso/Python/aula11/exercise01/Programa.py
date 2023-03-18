from Aluno import Aluno
from utils.listaAlunos import handleListaAlunos
from utils.handleRequest import handleRequest

listaAlunos = []

while True:
    print("\nDigite a opção desejada:")
    print("1 - Incluir Aluno")
    print("2 - Alterar Aluno")
    print("3 - Excluir Aluno")
    print("4 - Consultar Alunos")
    print("5 - Sair")
    opcao = int(input("> "))

    if opcao == 1:
      aluno = Aluno()

      id = listaAlunos.__len__() + 1

      aluno.id = id
      aluno.ra = input("\nInforme o RA do aluno: ")
      aluno.nome = input("Informe o nome do aluno: ")
      aluno.curso = input("Informe o curso do aluno: ")
      cep = input("Digite o CEP: ")

      data = handleRequest(f"https://viacep.com.br/ws/{cep}/json/")

      if data != "":
        print(f"Logradouro: {data['logradouro']}")
        print(f"Bairro: {data['bairro']}")
        print(f"Cidade: {data['localidade']}")
        print(f"Estado: {data['uf']}")
        numero = input("Digite o número da casa: ")

        logradouro = data["logradouro"]
        bairro = data["bairro"]
        localidade =  data["localidade"]
        uf = data["uf"]

        endereco = { 
          "cep": cep, 
          "logradouro": logradouro, 
          "bairro": bairro, 
          "localidade": localidade, 
          "uf": uf, 
        }

        aluno.endereco = endereco

      listaAlunos.append(aluno)
    
    elif opcao == 2:
      handleListaAlunos(listaAlunos)

      idAluno = int(input("\nDigite o ID do aluno que deseja alterar: "))
      for aluno in listaAlunos:
        if aluno.id == idAluno:
          aluno.nome = input(f"Digite o novo nome: ")
          aluno.curso = input(f"Digite o novo curso: ")
          print("\nAluno alterado com sucesso!")
        else: print("\n ID de aluno não encontrado!")

    elif opcao == 3:
      handleListaAlunos(listaAlunos)

      idAluno = int(input("\nDigite o ID do aluno que excluir: "))
      for aluno in listaAlunos:
        if aluno.id == idAluno:
          listaAlunos.remove(aluno)
          print("Aluno excluído com sucesso!")
          break;
        else: print("\n ID de aluno não encontrado!")

    elif (opcao == 4): 
      handleListaAlunos(listaAlunos)

    elif opcao == 5: break
    else: print("Opção inválida!")