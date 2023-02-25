import requests

listaPessoas = []

while True:
    print("\nDigite a opção desejada:")
    print("1 - Incluir Pessoa")
    print("2 - Alterar Pessoa")
    print("3 - Excluir Pessoa")
    print("4 - Consultar Pessoa")
    print("5 - Sair")
    opcao = int(input("> "))
    
    if opcao == 1:
      id = listaPessoas.__len__() + 1
      nome = input("\nDigite o nome da pessoa: ")
      email = input("Digite o email da pessoa: ")
      cep = input("Digite o CEP: ")

      response = requests.get(f"https://viacep.com.br/ws/{cep}/json/")
      endereco = response.json()

      if response.status_code == 200:
        print(f"CEP: {endereco['cep']}")
        print(f"Logradouro: {endereco['logradouro']}")
        print(f"Bairro: {endereco['bairro']}")
        print(f"Cidade: {endereco['localidade']}")
        print(f"Estado: {endereco['uf']}")
        numero = input("Digite o número da casa: ")
        complemento = input("Digite o complemento: ")

        logradouro = endereco["logradouro"]
        bairro = endereco["bairro"]
        localidade =  endereco["localidade"]
        uf = endereco["uf"]

        pessoa = {
          "id": id,
          "nome": nome,
          "email": email, 
          "numero": numero, 
          "complemento": complemento, 
          "rua": logradouro, 
          "bairro": bairro, 
          "cidade": localidade, 
          "estado": uf
        }

        listaPessoas.append(pessoa)
        print("Pessoa cadastrada com sucesso!")

      else: print("CEP inválido!")
    
    elif opcao == 2:
      for pessoa in listaPessoas:
        print(f"\nID: {pessoa['id']}; \nNome: {pessoa['nome']}; \nEmail: {pessoa['email']}; \nEndereço: {pessoa['rua']};", )

      idPessoa = int(input("Digite o ID da pessoa que deseja alterar: "))
      
      nome = input(f"Digite o novo nome: ")
      email = input(f"Digite o novo email: ")

      for pessoa in listaPessoas:
        if(pessoa['id'] == idPessoa):
          pessoa.update({'nome': nome})
          pessoa.update({'email': email})

      print("Dados da pessoa atualizados com sucesso!")

    elif opcao == 3:
      for pessoa in listaPessoas:
        print(f"\nID: {pessoa['id']}; \nNome: {pessoa['nome']}; \nEmail: {pessoa['email']}; \nEndereço: {pessoa['rua']};", )

      idPessoa = int(input("Digite o ID da pessoa que deseja excluir: "))

      for pessoa in listaPessoas:
        if(pessoa['id'] == idPessoa):
          listaPessoas.remove(pessoa)

      print("Pessoa excluída com sucesso!")
    
    elif opcao == 4:
      for pessoa in listaPessoas:
        print(f"\nID: {pessoa['id']}; \nNome: {pessoa['nome']}; \nEmail: {pessoa['email']}; \nEndereço: {pessoa['rua']};", )
    
    elif opcao == 5: break
    else: print("Opção inválida!")
