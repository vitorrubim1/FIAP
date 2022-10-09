nome = []
sexo = []
idade = []

for index in range (0, 4, 1):
  nome.append(input(f"\nInforme o nome da {index + 1}º pessoa: "))
  sexo.append(input(f"Informe o sexo da {index + 1}º pessoa: "))
  idade.append(input(f"Informe a idade da {index + 1}º pessoa: "))

for i in range (0, 4, 1):
  for j in range(i+1, 4, 1):
    if (idade[i] < idade[j]):
      auxNome = nome[i]
      nome[i] = nome[j]
      nome[j] = auxNome

      auxSexo = sexo[i]
      sexo[i] = sexo[j]
      sexo[j] = auxSexo

      auxIdade = idade[i]
      idade[i] = idade[j]
      idade[j] = auxIdade

for index in range (0, 4, 1):
  print(f"{nome[index]} possui {idade[index]} e é {sexo[index]}")