nome = []
sexo = []
idade = []

quantidadePessoa = 4

for index in range (0, quantidadePessoa, 1):
  nome.append(input(f"\nInforme o nome da {index + 1}º pessoa: "))
  sexoPessoa = input(f"Informe o sexo da {index + 1}º pessoa: ")

  while (sexoPessoa != "M" and sexoPessoa != "F"):
    sexoPessoa = input(f"Sexo Inválido. Digite seu sexo (M ou F): ").upper()

  sexo.append(sexoPessoa)
  idade.append(input(f"Informe a idade da {index + 1}º pessoa: "))

for index in range(0, quantidadePessoa, 1):
  for j in range(index + 1, quantidadePessoa, 1):
    if (sexo[index] == "M" and sexo[j] != sexo[index]):
      auxNome = nome[index]
      nome[index] = nome[j]
      nome[j] = auxNome

      auxSexo = sexo[index]
      sexo[index] = sexo[j]
      sexo[j] = auxSexo

      auxIdade = idade[index]
      idade[index] = idade[j]
      idade[j] = auxIdade
    else: 
      for k in range (index + 1, quantidadePessoa, 1):
        if (sexo[index] == sexo[k] and idade[index] < idade[k]):
            auxNome = nome[index]
            nome[index] = nome[k]
            nome[k] = auxNome

            auxSexo = sexo[index]
            sexo[index] = sexo[k]
            sexo[k] = auxSexo

            auxIdade = idade[index]
            idade[index] = idade[k]
            idade[k] = auxIdade

for index in range (0, quantidadePessoa, 1):
    print(f"Nome: {nome[index]}, Sexo: {sexo[index]}, Idade: {idade[index]}")